package com.namf.communication.service.dto;

public class NonUeN2MessageTransferRequest {
	private String requestId;
	private String messageType;
	private String messageContent;
	private String n2InfoType;

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public String getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}

	public String getN2InfoType() {
		return n2InfoType;
	}

	public void setN2InfoType(String n2InfoType) {
		this.n2InfoType = n2InfoType;
	}


}
