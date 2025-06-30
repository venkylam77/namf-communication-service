package com.namf.communication.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.namf.communication.service.dto.N2InformationTransferReqData;
import com.namf.communication.service.dto.N2InformationTransferRspData;
import com.namf.communication.service.dto.NonUeN2InfoSubscriptionCreateData;
import com.namf.communication.service.dto.NonUeN2InfoSubscriptionCreatedData;
import com.namf.communication.service.dto.NonUeN2InfoUnsubscribeResponse;
import com.namf.communication.service.dto.NonUeN2MessageTransferResponse;
import com.namf.communication.service.dto.SubscribeResponse;
import com.namf.communication.service.service.NamfCommunicationService;

@RestController
@RequestMapping("/cbcf")
public class NamfCommunicationController {
	@Autowired
	NamfCommunicationService namfCommunicationService;
	Logger logger = LoggerFactory.getLogger(NamfCommunicationController.class);

	@PostMapping("/non-ue-n2-messages/transfer")
	public ResponseEntity<NonUeN2MessageTransferResponse> nonUeTransfer(
			@RequestBody N2InformationTransferReqData req) {
		NonUeN2MessageTransferResponse objNonUeN2MessageTransferResponse = new NonUeN2MessageTransferResponse();

		try {
			logger.info("non-ue-n2-messages-transfer start:::::");
			N2InformationTransferRspData n2InformationTransferRspData = namfCommunicationService.nonUeMessageTransfer(req);
			objNonUeN2MessageTransferResponse.setN2InformationTransferRspData(n2InformationTransferRspData);
			objNonUeN2MessageTransferResponse.setStatus("accepted");
			logger.info("non-ue-n2-messages-transfer end:::::");
			return ResponseEntity.ok(objNonUeN2MessageTransferResponse);

		} catch (Exception e) {
			e.printStackTrace();
			objNonUeN2MessageTransferResponse.setStatus("failed");
			return new ResponseEntity<>(objNonUeN2MessageTransferResponse, HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}

	@PostMapping("/non-ue-n2-messages/subscriptions")
	public ResponseEntity<SubscribeResponse> subscribe(@RequestBody NonUeN2InfoSubscriptionCreateData req) {
		SubscribeResponse objSubscribeResponse = new SubscribeResponse();

		try {
			logger.info("non-ue-n2-messages-subscriptions start:::::");
			NonUeN2InfoSubscriptionCreatedData nonUeN2InfoSubscriptionCreatedData = namfCommunicationService.nonUeN2InfoSubscribe(req);
			String subId = nonUeN2InfoSubscriptionCreatedData.getN2NotifySubscriptionId();
			objSubscribeResponse.setSubscriptionId(subId);
			objSubscribeResponse.setStatus("subscribed");
			logger.info("non-ue-n2-messages-transfer SubscriptionId:::::" + subId + " status::subscribed");

			logger.info("non-ue-n2-messages-subscriptions end:::::");

			return ResponseEntity.ok(objSubscribeResponse);
		} catch (Exception e) {
			e.printStackTrace();
			objSubscribeResponse.setStatus("failed to subscribed");
			return new ResponseEntity<>(objSubscribeResponse, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@DeleteMapping("/non-ue-n2-messages/subscriptions/{subId}")
	public ResponseEntity<NonUeN2InfoUnsubscribeResponse> unsubscribe(@PathVariable String subId) {
		NonUeN2InfoUnsubscribeResponse objNonUeN2InfoUnsubscribeResponse = new NonUeN2InfoUnsubscribeResponse();

		try {
		logger.info("non-ue-n2-messages-unsubscribe start:::::");
		objNonUeN2InfoUnsubscribeResponse.setSubscriptionId(subId);
		objNonUeN2InfoUnsubscribeResponse.setStatus("unsubscribed");
		logger.info("non-ue-n2-messages-unsubscribe SubscriptionId:::::" + subId + " status::unsubscribe");
		logger.info("non-ue-n2-messages-unsubscribe end:::::");

		return new ResponseEntity<>(objNonUeN2InfoUnsubscribeResponse, HttpStatus.NO_CONTENT);

	} catch (Exception e) {
		e.printStackTrace();
		objNonUeN2InfoUnsubscribeResponse.setStatus("failed to unsubscribed");
		return new ResponseEntity<>(objNonUeN2InfoUnsubscribeResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	}
}