package com.namf.communication.service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class GNbId {

	@NotBlank(message = "bitLength is mandatory")
	private Integer bitLength;

	@Pattern(regexp = "^[A-Fa-f0-9]{6,8}$", message = "Invalid gNBValue")
	private String gNBValue;

	public Integer getBitLength() {
		return bitLength;
	}

	public void setBitLength(Integer bitLength) {
		this.bitLength = bitLength;
	}

	public String getgNBValue() {
		return gNBValue;
	}

	public void setgNBValue(String gNBValue) {
		this.gNBValue = gNBValue;
	}

}
