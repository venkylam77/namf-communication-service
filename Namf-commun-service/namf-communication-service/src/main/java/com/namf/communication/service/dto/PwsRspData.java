package com.namf.communication.service.dto;

import java.util.ArrayList;

import jakarta.validation.constraints.NotBlank;

public class PwsRspData {
	@NotBlank(message = "ngapMessageType is mandatory")
	private Integer ngapMessageType;

	@NotBlank(message = "serialNumber is mandatory")
	private Integer serialNumber;
	@NotBlank(message = "messageIdentifier is mandatory")
	private Integer messageIdentifier;

	private ArrayList<Tai> unknownTaiList;

	public Integer getNgapMessageType() {
		return ngapMessageType;
	}

	public void setNgapMessageType(Integer ngapMessageType) {
		this.ngapMessageType = ngapMessageType;
	}

	public Integer getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Integer getMessageIdentifier() {
		return messageIdentifier;
	}

	public void setMessageIdentifier(Integer messageIdentifier) {
		this.messageIdentifier = messageIdentifier;
	}

	public ArrayList<Tai> getUnknownTaiList() {
		return unknownTaiList;
	}

	public void setUnknownTaiList(ArrayList<Tai> unknownTaiList) {
		this.unknownTaiList = unknownTaiList;
	}

}
