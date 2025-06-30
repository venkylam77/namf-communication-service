package com.namf.communication.service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class GlobalRanNodeId {
	@NotBlank(message = "plmnId is mandatory")
	private PlmnId plmnId;

	@NotBlank(message = "n3IwfId is mandatory")
	@Pattern(regexp = "^[A-Fa-f0-9]+$", message = "Invalid n3IwfId")
	private String n3IwfId;

	@NotBlank(message = "gNbId is mandatory")
	private GNbId gNbId;

	@Pattern(regexp = "^(MacroNGeNB-[A-Fa-f0-9]{5}|LMacroNGeNB-[A-Fa-f0-9]{6}|SMacroNGeNB-[A-Fa-f0-9]{5})$", message = "Invalid ngeNbId")
	private String ngeNbId;

	@Pattern(regexp = "^[A-Fa-f0-9]+$", message = "Invalid wagfId")
	private String wagfId;

	@Pattern(regexp = "^[A-Fa-f0-9]+$", message = "Invalid tngfId")
	private String tngfId;

	@Pattern(regexp = "^[A-Fa-f0-9]{11}$", message = "Invalid nid ")
	private String nid;

	@Pattern(regexp = "^(MacroeNB-[A-Fa-f0-9]{5}|LMacroeNB-[A-Fa-f0-9]{6}|SMacroeNB-[A-Fa-f0-9]{5}|HomeeNB-[A-Fa-f0-9]{7})$", message = "Invalid nid ")
	private String eNbId;

}
