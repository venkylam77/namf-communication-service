package com.namf.communication.service.dto;

public class RatSelector {
	public enum RatType {
		E_UTRA, // LTE
		NR // 5G New Radio
	}

	private RatType ratType;

	public RatSelector() {
	}

	public RatSelector(RatType ratType) {
		this.ratType = ratType;
	}

	public RatType getRatType() {
		return ratType;
	}

	public void setRatType(RatType ratType) {
		this.ratType = ratType;
	}

	@Override
	public String toString() {
		return ratType == RatType.E_UTRA ? "E-UTRA" : "NR";
	}
}
