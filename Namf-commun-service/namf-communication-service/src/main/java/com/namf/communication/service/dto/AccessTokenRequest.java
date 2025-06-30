package com.namf.communication.service.dto;

import java.util.ArrayList;

public class AccessTokenRequest {
	String grant_type, nfInstanceId, nfType, targetNfType, scope, targetNfInstanceId, requesterFqdn;
	ArrayList<PlmnId> requesterPlmnList;

	ArrayList<SNssai> requesterSnssaiList;


}
