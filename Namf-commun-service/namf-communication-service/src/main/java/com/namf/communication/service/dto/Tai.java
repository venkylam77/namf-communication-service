package com.namf.communication.service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class Tai {

	@NotBlank(message = "plmnId is mandatory")
	private PlmnId plmnId;

	// Represents a two- or three-octet Tracking Area Code (TAC) in hexadecimal
	// format
	@NotBlank(message = "tac is mandatory")
	@Pattern(regexp = "(^[A-Fa-f0-9]{4}$)|(^[A-Fa-f0-9]{6}$)", message = "Invalid tac")
	private String tac;

	// Contains the Network Identifier in hexadecimal format
	@Pattern(regexp = "^[A-Fa-f0-9]{11}$", message = "Invalid nid")
	private String nid;

}
