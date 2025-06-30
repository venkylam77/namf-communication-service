package com.namf.communication.service.dto;

import jakarta.validation.constraints.NotBlank;

public class NrppaPdu {

	private Integer ngapMessageType;
	private String ngapIeType;
	@NotBlank(message = "ngapData is mandatory")
	private NgapData ngapData;

	public Integer getNgapMessageType() {
		return ngapMessageType;
	}

	public void setNgapMessageType(Integer ngapMessageType) {
		this.ngapMessageType = ngapMessageType;
	}

	public String getNgapIeType() {
		return ngapIeType;
	}

	public void setNgapIeType(String ngapIeType) {
		this.ngapIeType = ngapIeType;
	}

	public NgapData getNgapData() {
		return ngapData;
	}

	public void setNgapData(NgapData ngapData) {
		this.ngapData = ngapData;
	}
}
