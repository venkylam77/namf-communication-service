package com.namf.communication.service.dto;

public class SubscribeRequest {
	private String cnfId;
	private String n2InfoType;
	public String getCnfId() {
		return cnfId;
	}

	public void setCnfId(String cnfId) {
		this.cnfId = cnfId;
	}

	public String getN2InfoType() {
		return n2InfoType;
	}

	public void setN2InfoType(String n2InfoType) {
		this.n2InfoType = n2InfoType;
	}

}