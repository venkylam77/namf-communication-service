package com.namf.communication.service.dto;

import lombok.Data;

@Data
public class NonUeN2InfoSubscriptionCreatedData {
	private String n2NotifySubscriptionId, supportedFeatures, n2InformationClass;

	public String getN2NotifySubscriptionId() {
		return n2NotifySubscriptionId;
	}

	public void setN2NotifySubscriptionId(String n2NotifySubscriptionId) {
		this.n2NotifySubscriptionId = n2NotifySubscriptionId;
	}

	public String getSupportedFeatures() {
		return supportedFeatures;
	}

	public void setSupportedFeatures(String supportedFeatures) {
		this.supportedFeatures = supportedFeatures;
	}

	public String getN2InformationClass() {
		return n2InformationClass;
	}

	public void setN2InformationClass(String n2InformationClass) {
		this.n2InformationClass = n2InformationClass;
	}

}
