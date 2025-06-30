package com.namf.communication.service.dto;

import jakarta.validation.constraints.NotBlank;

public class SmInfo {
	@NotBlank(message = "pduSessionId is mandatory")
	private Integer pduSessionId;

	private N2InfoContent n2InfoContent;

	private SNssai sNssai;

	private HomePlmnSnssai homePlmnSnssai;

	private IwkSnssai iwkSnssai;

	private Boolean subjectToHo;

	public SNssai getsNssai() {
		return sNssai;
	}

	public void setsNssai(SNssai sNssai) {
		this.sNssai = sNssai;
	}

	public HomePlmnSnssai getHomePlmnSnssai() {
		return homePlmnSnssai;
	}

	public void setHomePlmnSnssai(HomePlmnSnssai homePlmnSnssai) {
		this.homePlmnSnssai = homePlmnSnssai;
	}

	public IwkSnssai getIwkSnssai() {
		return iwkSnssai;
	}

	public void setIwkSnssai(IwkSnssai iwkSnssai) {
		this.iwkSnssai = iwkSnssai;
	}

	public Boolean getSubjectToHo() {
		return subjectToHo;
	}

	public void setSubjectToHo(Boolean subjectToHo) {
		this.subjectToHo = subjectToHo;
	}

	public Integer getPduSessionId() {
		return pduSessionId;
	}

	public void setPduSessionId(Integer pduSessionId) {
		this.pduSessionId = pduSessionId;
	}

	public N2InfoContent getN2InfoContent() {
		return n2InfoContent;
	}

	public void setN2InfoContent(N2InfoContent n2InfoContent) {
		this.n2InfoContent = n2InfoContent;
	}

}
