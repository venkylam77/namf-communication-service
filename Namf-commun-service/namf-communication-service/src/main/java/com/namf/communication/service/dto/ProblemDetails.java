package com.namf.communication.service.dto;

import java.util.ArrayList;

public class ProblemDetails {
	private String type, title, detail;
	private Integer status;
	private String instance;
	private String cause;
	private ArrayList<InvalidParams> invalidParams;
	private String supportedFeatures;
	private AccessTokenError accessTokenError;
	private AccessTokenRequest accessTokenRequest;
	private String nrfId;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getInstance() {
		return instance;
	}

	public void setInstance(String instance) {
		this.instance = instance;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public ArrayList<InvalidParams> getInvalidParams() {
		return invalidParams;
	}

	public void setInvalidParams(ArrayList<InvalidParams> invalidParams) {
		this.invalidParams = invalidParams;
	}

	public String getSupportedFeatures() {
		return supportedFeatures;
	}

	public void setSupportedFeatures(String supportedFeatures) {
		this.supportedFeatures = supportedFeatures;
	}

	public AccessTokenError getAccessTokenError() {
		return accessTokenError;
	}

	public void setAccessTokenError(AccessTokenError accessTokenError) {
		this.accessTokenError = accessTokenError;
	}

	public AccessTokenRequest getAccessTokenRequest() {
		return accessTokenRequest;
	}

	public void setAccessTokenRequest(AccessTokenRequest accessTokenRequest) {
		this.accessTokenRequest = accessTokenRequest;
	}

	public String getNrfId() {
		return nrfId;
	}

	public void setNrfId(String nrfId) {
		this.nrfId = nrfId;
	}

}
