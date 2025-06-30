package com.namf.communication.service.dto;

public class N2InformationTransferRspData {

	private String result;
	private PwsRspData pwsRspData;
	private String supportedFeatures;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public PwsRspData getPwsRspData() {
		return pwsRspData;
	}

	public void setPwsRspData(PwsRspData pwsRspData) {
		this.pwsRspData = pwsRspData;
	}

	public String getSupportedFeatures() {
		return supportedFeatures;
	}

	public void setSupportedFeatures(String supportedFeatures) {
		this.supportedFeatures = supportedFeatures;
	}

}
