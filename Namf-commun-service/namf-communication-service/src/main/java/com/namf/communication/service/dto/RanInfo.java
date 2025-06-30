package com.namf.communication.service.dto;

import jakarta.validation.constraints.NotBlank;

public class RanInfo {
	@NotBlank(message = "n2InfoContent is mandatory")
	private N2InfoContent n2InfoContent;

	public N2InfoContent getN2InfoContent() {
		return n2InfoContent;
	}

	public void setN2InfoContent(N2InfoContent n2InfoContent) {
		this.n2InfoContent = n2InfoContent;
	}

}
