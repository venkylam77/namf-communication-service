package com.namf.communication.service.dto;

import java.util.ArrayList;

import jakarta.validation.constraints.Pattern;

public class N2InformationTransferReqData {

	private ArrayList<Tai> taiList;

	private RatSelector ratSelector;
	private ArrayList<GlobalRanNodeId> globalRanNodeList;
	private N2Information n2Information;
	private Boolean callAmfEndPoint;

	@Pattern(regexp = "^[A-Fa-f0-9]*$", message = "Invalid supportedFeatures")
	private String supportedFeatures;

	public N2Information getN2Information() {
		return n2Information;
	}

	public void setN2Information(N2Information n2Information) {
		this.n2Information = n2Information;
	}

	public String getSupportedFeatures() {
		return supportedFeatures;
	}

	public void setSupportedFeatures(String supportedFeatures) {
		this.supportedFeatures = supportedFeatures;
	}

	public ArrayList<Tai> getTaiList() {
		return taiList;
	}

	public void setTaiList(ArrayList<Tai> taiList) {
		this.taiList = taiList;
	}

	public RatSelector getRatSelector() {
		return ratSelector;
	}

	public void setRatSelector(RatSelector ratSelector) {
		this.ratSelector = ratSelector;
	}

	public ArrayList<GlobalRanNodeId> getGlobalRanNodeList() {
		return globalRanNodeList;
	}

	public void setGlobalRanNodeList(ArrayList<GlobalRanNodeId> globalRanNodeList) {
		this.globalRanNodeList = globalRanNodeList;
	}

	public Boolean getCallAmfEndPoint() {
		return callAmfEndPoint;
	}

	public void setCallAmfEndPoint(Boolean callAmfEndPoint) {
		this.callAmfEndPoint = callAmfEndPoint;
	}

}
