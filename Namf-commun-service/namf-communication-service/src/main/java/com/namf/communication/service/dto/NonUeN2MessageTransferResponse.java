package com.namf.communication.service.dto;

public class NonUeN2MessageTransferResponse {

	private N2InformationTransferRspData n2InformationTransferRspData;
	private String status;


	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public N2InformationTransferRspData getN2InformationTransferRspData() {
		return n2InformationTransferRspData;
	}

	public void setN2InformationTransferRspData(N2InformationTransferRspData n2InformationTransferRspData) {
		this.n2InformationTransferRspData = n2InformationTransferRspData;
	}
	

	
}
