package com.namf.communication.service.dto;

import lombok.Data;

@Data
public class N2InformationTransferError {
	private N2Error error;

	public N2Error getError() {
		return error;
	}

	public void setError(N2Error error) {
		this.error = error;
	}
}
