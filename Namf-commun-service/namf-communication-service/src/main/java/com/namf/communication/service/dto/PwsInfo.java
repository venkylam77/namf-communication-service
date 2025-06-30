package com.namf.communication.service.dto;

import java.util.ArrayList;

import jakarta.validation.constraints.NotBlank;

public class PwsInfo {
	@NotBlank(message = "messageIdentifier is mandatory")
	private Integer messageIdentifier;

	@NotBlank(message = "serialNumber is mandatory")
	private Integer serialNumber;

	private PwsContainer pwsContainer;
	private ArrayList<GlobalRanNodeId> bcEmptyAreaList;
	private Boolean sendRanResponse;
	private String omcId;

	public Integer getMessageIdentifier() {
		return messageIdentifier;
	}

	public void setMessageIdentifier(Integer messageIdentifier) {
		this.messageIdentifier = messageIdentifier;
	}

	public Integer getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}

	public PwsContainer getPwsContainer() {
		return pwsContainer;
	}

	public void setPwsContainer(PwsContainer pwsContainer) {
		this.pwsContainer = pwsContainer;
	}

	public ArrayList<GlobalRanNodeId> getBcEmptyAreaList() {
		return bcEmptyAreaList;
	}

	public void setBcEmptyAreaList(ArrayList<GlobalRanNodeId> bcEmptyAreaList) {
		this.bcEmptyAreaList = bcEmptyAreaList;
	}

	public Boolean getSendRanResponse() {
		return sendRanResponse;
	}

	public void setSendRanResponse(Boolean sendRanResponse) {
		this.sendRanResponse = sendRanResponse;
	}

	public String getOmcId() {
		return omcId;
	}

	public void setOmcId(String omcId) {
		this.omcId = omcId;
	}

}
