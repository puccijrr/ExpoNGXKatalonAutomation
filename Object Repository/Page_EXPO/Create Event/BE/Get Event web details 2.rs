<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Get Event web details 2</name>
   <tag></tag>
   <elementGuidId>0def2932-5acf-4495-9a5e-8f4c16d3794e</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer zUfgguUuU020r4jnl3mxvB078wytLX</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${url}/api/conference/get/?conference_id=1600&amp;for_web=1</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>GlobalVariable.url</defaultValue>
      <description></description>
      <id>242c84ee-9da8-4851-b6f1-1e5808af3edc</id>
      <masked>false</masked>
      <name>url</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.webVersion</defaultValue>
      <description></description>
      <id>c47db800-7ca7-46d1-996d-a9aecbf534c2</id>
      <masked>false</masked>
      <name>webVersion</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.eventID</defaultValue>
      <description></description>
      <id>48929a5c-bc6b-4ef9-941d-6d96c08fe4c3</id>
      <masked>false</masked>
      <name>eventID</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.regLevelID</defaultValue>
      <description></description>
      <id>402fab7f-23e1-4c52-8401-4f504f2229e7</id>
      <masked>false</masked>
      <name>regLevelID</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.Authorization</defaultValue>
      <description></description>
      <id>2675023a-2edb-4339-927a-c19e60ea5a49</id>
      <masked>false</masked>
      <name>token</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()
ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

//Response should be GET=200
WS.verifyResponseStatusCode(response, 200)
assertThat(response.getStatusCode()).isEqualTo(200)

//Verify fields
WS.verifyElementPropertyValue(response, 'legal.privacy_policy', [require_acceptance:false])
WS.verifyElementPropertyValue(response, 'legal.copyright', [require_acceptance:true])
WS.verifyElementPropertyValue(response, 'legal.registration', [require_acceptance:true])
WS.verifyElementPropertyValue(response, 'legal.attendee_upload', [require_acceptance:true])
WS.verifyElementPropertyValue(response, 'legal.merchant_agreement', [require_acceptance:true])
WS.verifyElementPropertyValue(response, 'legal.terms_of_service', [require_acceptance:false])
WS.verifyElementPropertyValue(response, 'legal.mobile_eula', [require_acceptance:true])

</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
