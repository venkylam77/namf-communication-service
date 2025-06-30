package com.namf.communication.service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class SNssai {
	@NotBlank(message = "pduSessionId is mandatory")
	private Integer sst;

	@Pattern(regexp = "^[A-Fa-f0-9]{6}$", message = "Invalid sd")
	private String sd;

	public Integer getSst() {
		return sst;
	}

	public void setSst(Integer sst) {
		this.sst = sst;
	}

	public String getSd() {
		return sd;
	}

	public void setSd(String sd) {
		this.sd = sd;
	}

}
