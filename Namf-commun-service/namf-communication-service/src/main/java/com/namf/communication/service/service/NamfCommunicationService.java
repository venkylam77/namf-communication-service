package com.namf.communication.service.service;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.namf.communication.service.dto.N2InformationTransferError;
import com.namf.communication.service.dto.N2InformationTransferReqData;
import com.namf.communication.service.dto.N2InformationTransferRspData;
import com.namf.communication.service.dto.NonUeN2InfoSubscriptionCreateData;
import com.namf.communication.service.dto.NonUeN2InfoSubscriptionCreatedData;
import com.namf.communication.service.dto.ProblemDetails;
import com.namf.communication.service.dto.PwsRspData;
import com.namf.communication.service.dto.SubscribeRequest;

import reactor.core.publisher.Mono;

@Service
public class NamfCommunicationService {

	private final WebClient webClient;

	public NamfCommunicationService(WebClient.Builder webClientBuilder) {

		this.webClient = webClientBuilder.baseUrl("https://amf.example.com/namf-comm/v1").build();
	}
	private final ConcurrentMap<String, SubscribeRequest> subs = new ConcurrentHashMap<>();

	public N2InformationTransferRspData nonUeMessageTransfer(N2InformationTransferReqData request) {
		N2InformationTransferRspData objN2InformationTransferRspData = null;
		if (request.getCallAmfEndPoint()) {
			// Actual AMS provider code
			objN2InformationTransferRspData = webClient.post()
					.uri("/non-ue-n2-messages/transfer")
					// .header(HttpHeaders.AUTHORIZATION, "Bearer " + obtainAccessToken())
					.contentType(MediaType.APPLICATION_JSON).retrieve()
					.onStatus(status -> status.is4xxClientError(),
							clientResponse -> clientResponse.bodyToMono(N2InformationTransferError.class)
									.flatMap(errorBody -> Mono.error(new Exception(errorBody.getError().toString()))))
					.onStatus(status -> status.is5xxServerError(),
							clientResponse -> clientResponse.bodyToMono(N2InformationTransferError.class)
									.flatMap(errorBody -> Mono.error(new Exception(errorBody.getError().toString()))))
					.bodyToMono(N2InformationTransferRspData.class).block();
		} else {
			// success test code
			objN2InformationTransferRspData = new N2InformationTransferRspData();
			objN2InformationTransferRspData.setResult("success");
			PwsRspData pwsRspData = new PwsRspData();
			pwsRspData.setMessageIdentifier(12345);
			pwsRspData.setNgapMessageType(22);
			pwsRspData.setSerialNumber(123);
			objN2InformationTransferRspData.setPwsRspData(pwsRspData);
		}

		return objN2InformationTransferRspData;

	}


	public NonUeN2InfoSubscriptionCreatedData nonUeN2InfoSubscribe(NonUeN2InfoSubscriptionCreateData request) {
		NonUeN2InfoSubscriptionCreatedData nonUeN2InfoSubscriptionCreatedData = null;
		if (request.getCallAmfEndPoint()) {
			// Actual AMS provider code

			nonUeN2InfoSubscriptionCreatedData = webClient.post().uri("/non-ue-n2-messages/subscriptions")
					// .header(HttpHeaders.AUTHORIZATION, "Bearer " + obtainAccessToken())
					.contentType(MediaType.APPLICATION_JSON).retrieve()
					.onStatus(status -> status.is4xxClientError(),
							clientResponse -> clientResponse.bodyToMono(ProblemDetails.class)
									.flatMap(errorBody -> Mono.error(new Exception(errorBody.toString()))))
					.onStatus(status -> status.is5xxServerError(),
							clientResponse -> clientResponse.bodyToMono(ProblemDetails.class)
									.flatMap(errorBody -> Mono.error(new Exception(errorBody.toString()))))
					.bodyToMono(NonUeN2InfoSubscriptionCreatedData.class).block();
		} else {
			// success test code
			nonUeN2InfoSubscriptionCreatedData = new NonUeN2InfoSubscriptionCreatedData();
			nonUeN2InfoSubscriptionCreatedData.setN2InformationClass("SM");
			nonUeN2InfoSubscriptionCreatedData.setN2NotifySubscriptionId("subid-1234");
			nonUeN2InfoSubscriptionCreatedData.setSupportedFeatures("1233333");
		}


		return nonUeN2InfoSubscriptionCreatedData;
	}

	public Mono<Void> nonUeN2InfoUnsubscribe(String subscriptionId) {
		return webClient
				.delete().uri(uriBuilder -> uriBuilder
						.path("/non-ue-n2-messages/subscriptions/{n2NotifySubscriptionId}").build(subscriptionId))
				.retrieve().bodyToMono(Void.class);
	}



}