package com.namf.communication.service.dto;

import jakarta.validation.constraints.NotBlank;

public class NgapData {
	@NotBlank(message = "contentId is mandatory")
	private String contentId;

	public String getContentId() {
		return contentId;
	}

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

}
