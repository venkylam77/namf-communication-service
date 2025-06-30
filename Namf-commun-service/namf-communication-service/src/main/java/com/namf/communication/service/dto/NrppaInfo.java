package com.namf.communication.service.dto;

import jakarta.validation.constraints.NotBlank;

public class NrppaInfo {
	@NotBlank(message = "nfId is mandatory")
	private String nfId;

	@NotBlank(message = "nrppaPdu  is mandatory")
	private NrppaPdu nrppaPdu;
	private String serviceInstanceId;

	public String getNfId() {
		return nfId;
	}

	public void setNfId(String nfId) {
		this.nfId = nfId;
	}

	public NrppaPdu getNrppaPdu() {
		return nrppaPdu;
	}

	public void setNrppaPdu(NrppaPdu nrppaPdu) {
		this.nrppaPdu = nrppaPdu;
	}

	public String getServiceInstanceId() {
		return serviceInstanceId;
	}

	public void setServiceInstanceId(String serviceInstanceId) {
		this.serviceInstanceId = serviceInstanceId;
	}

}
