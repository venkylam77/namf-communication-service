package com.namf.communication.service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class PlmnId {
	// Represents the three-digit Mobile Country Code
	@NotBlank(message = "mcc is mandatory")
	@Pattern(regexp = "^[0-9]{3}$", message = "Invalid mcc")
	private String mcc;

	// Represents the two- or three-digit Mobile Country Code
	@NotBlank(message = "mnc is mandatory")
	@Pattern(regexp = "^[0-9]{2,3}$", message = "Invalid mnc")
	private String mnc;

	public String getMcc() {
		return mcc;
	}

	public void setMcc(String mcc) {
		this.mcc = mcc;
	}

	public String getMnc() {
		return mnc;
	}

	public void setMnc(String mnc) {
		this.mnc = mnc;
	}

}
