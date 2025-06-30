package com.namf.communication.service.dto;

import java.util.ArrayList;

public class NonUeN2InfoSubscriptionCreateData {
	private ArrayList<GlobalRanNodeId> globalRanNodeList;
	private ArrayList<AccessType> anTypeList;
	private Boolean callAmfEndPoint;

	public ArrayList<GlobalRanNodeId> getGlobalRanNodeList() {
		return globalRanNodeList;
	}

	public void setGlobalRanNodeList(ArrayList<GlobalRanNodeId> globalRanNodeList) {
		this.globalRanNodeList = globalRanNodeList;
	}

	public ArrayList<AccessType> getAnTypeList() {
		return anTypeList;
	}

	public void setAnTypeList(ArrayList<AccessType> anTypeList) {
		this.anTypeList = anTypeList;
	}

	public String getN2InformationClass() {
		return n2InformationClass;
	}

	public void setN2InformationClass(String n2InformationClass) {
		this.n2InformationClass = n2InformationClass;
	}

	public String getN2NotifyCallbackUri() {
		return n2NotifyCallbackUri;
	}

	public void setN2NotifyCallbackUri(String n2NotifyCallbackUri) {
		this.n2NotifyCallbackUri = n2NotifyCallbackUri;
	}

	public String getNfId() {
		return nfId;
	}

	public void setNfId(String nfId) {
		this.nfId = nfId;
	}

	public String getSupportedFeatures() {
		return supportedFeatures;
	}

	public void setSupportedFeatures(String supportedFeatures) {
		this.supportedFeatures = supportedFeatures;
	}
	private String n2InformationClass;
	private String n2NotifyCallbackUri;
	private String nfId;
	private String supportedFeatures;

	public Boolean getCallAmfEndPoint() {
		return callAmfEndPoint;
	}

	public void setCallAmfEndPoint(Boolean callAmfEndPoint) {
		this.callAmfEndPoint = callAmfEndPoint;
	}

}
