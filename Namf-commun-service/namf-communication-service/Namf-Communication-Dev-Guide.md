---
title: "**Implement 5G SA Cell Broadcast Center Function\\'s (CBCF)
  Namf_Communication service\\'s** "
---

The Cell Broadcast Center Function (CBCF) utilizes the
Namf_Communication service from the Access and Mobility Management
Function (AMF) to deliver warning messages to the User Equipment (UE)
via the radio access network (RAN).

## Prerequisites

-   JDK 17

-   Maven

-   Spring Boot 3+

-   Rest Knowledge

-   Tomcat 10

-   Eclipse

-   Postman

-   Basic Knowledge on 5G Networking

## Create Namf Communication Service Spring boot project

> By using Spring initialzr, I created a namf-communication-service war
> project by adding the required dependencies for namf
> communication-service.
>
> Ex: web, web flux, webmvc-ui

## Understanding the CBCF & AMF Mobility technology

> I referred multiple documents to understanding the CBCF and AMF then I
> build the NonUeMessageTransfer, NonUeN2InfoSubscribe,
> NonUeN2InfoUnsubsribe rest Apis.
>
> Reference:
>
> <https://dstest.info/RestDict/Dictionary/4620.html>
>
> <https://www.etsi.org/deliver/etsi_ts/129500_129599/129518/15.01.00_60/ts_129518v150100p.pdf>

## Build War file

I ran the mvn clean install command on namf-communication-service
package to build war file

## Deploy the War file into tomcat

> After generating the war file, I copied the war file into tomcat
> webapp folder and started the tomcat.

## Open Swagger-UI

> Open the below url to see the all rest api's and schemas.
>
> [http://localhost:8080/namf-communication-service/swagger-ui/index.html -
> /](http://localhost:8080/namf-communication-service/swagger-ui/index.html#/)

##  {#section .unnumbered}

## NonUeMessageTransfer Rest Api 

**Request Payload:**

> POST /namf-communication-service/cbcf/non-ue-n2-messages/transfer
> HTTP/1.1
>
> Host: localhost:8080
>
> Content-Type: application/json
>
> Content-Length: 601
>
> {
>
> \"n2Information\": {
>
> \"n2InformationClass\": \"PWS\",
>
> \"smInfo\": {
>
> \"pduSessionId\": 64,
>
> \"n2InfoContent\": {
>
> \"ngapMessageType\": 30,
>
> \"ngapIeType\": \"PDU_RES_SETUP_REQ\",
>
> \"ngapData\": {
>
> \"contentId\": \"test-contentId\"
>
> }
>
> },
>
> \"getsNssai\": {
>
> \"sst\": 20,
>
> \"sd\": \"0x123456\"
>
> },
>
> \"homePlmnSnssai\": {
>
> \"sst\": 20,
>
> \"sd\": \"0x123456\"
>
> },
>
> \"iwkSnssai\": {
>
> \"sst\": 20,
>
> \"sd\": \"0x123456\"
>
> },
>
> \"subjectToHo\": true
>
> }
>
> },
>
> \"supportedFeatures\": \"0x12AF\",
>
> \"callAmfEndPoint\": false
>
> }

**Response:**

> {
>
> \"n2InformationTransferRspData\": {
>
> \"result\": \"success\",
>
> \"pwsRspData\": {
>
> \"ngapMessageType\": 22,
>
> \"serialNumber\": 123,
>
> \"messageIdentifier\": 12345,
>
> \"unknownTaiList\": **null**
>
> },
>
> \"supportedFeatures\": **null**
>
> },
>
> \"status\": \"accepted\"}

## NonUeN2InfoSubscribe Rest Api 

**Request Payload:**

> POST /namf-communication-service/cbcf/non-ue-n2-messages/subscriptions
> HTTP/1.1
>
> Host: localhost:8080
>
> Content-Type: application/json
>
> Content-Length: 258
>
> {
>
> \"anTypeList\": \[
>
> {
>
> \"accessType\": \"3GPP_ACCESS\"
>
> }
>
> \],
>
> \"n2InformationClass\": \"SM\",
>
> \"n2NotifyCallbackUri\": \"n2NotifyCallbackUri\",
>
> \"nfId\": \"UUID-1\",
>
> \"supportedFeatures\": \"string\",
>
> \"callAmfEndPoint\": false
>
> }

**Response:**

> {
>
> \"subscriptionId\": \"subid-1234\",
>
> \"status\": \"subscribed\"
>
> }

## NonUeN2InfoSubscribe Rest Api 

**Request Payload:**

> DELETE /namf-communication-service/cbcf/non-ue-n2-messages/subscriptions/subid-1234 HTTP/1.1
>
> Host: localhost:8080

**Response:**

204 No Content

> {
>
> }
>
> .
