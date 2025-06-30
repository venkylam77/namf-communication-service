package com.namf.communication.service.dto;

import jakarta.validation.constraints.NotBlank;

public class N2Information {
	@NotBlank(message = "n2InformationClass is mandatory")
	private String n2InformationClass;
	private SmInfo smInfo;
	private PwsInfo pwsInfo;
	private RanInfo ranInfo;
	private NrppaInfo nrppaInfo;
	private V2xInfo v2xInfo;

	public String getN2InformationClass() {
		return n2InformationClass;
	}

	public void setN2InformationClass(String n2InformationClass) {
		this.n2InformationClass = n2InformationClass;
	}

	public PwsInfo getPwsInfo() {
		return pwsInfo;
	}

	public void setPwsInfo(PwsInfo pwsInfo) {
		this.pwsInfo = pwsInfo;
	}

	public SmInfo getSmInfo() {
		return smInfo;
	}

	public void setSmInfo(SmInfo smInfo) {
		this.smInfo = smInfo;
	}

	public RanInfo getRanInfo() {
		return ranInfo;
	}

	public void setRanInfo(RanInfo ranInfo) {
		this.ranInfo = ranInfo;
	}

	public NrppaInfo getNrppaInfo() {
		return nrppaInfo;
	}

	public void setNrppaInfo(NrppaInfo nrppaInfo) {
		this.nrppaInfo = nrppaInfo;
	}

	public V2xInfo getV2xInfo() {
		return v2xInfo;
	}

	public void setV2xInfo(V2xInfo v2xInfo) {
		this.v2xInfo = v2xInfo;
	}



}
