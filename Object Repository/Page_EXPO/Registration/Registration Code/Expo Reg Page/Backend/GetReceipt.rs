<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>Registration form fields</description>
   <name>GetReceipt</name>
   <tag></tag>
   <elementGuidId>835ca0c2-c545-46a7-b5b9-3d513e45d795</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>${token}</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${url}/api/${webVersion}/forms/${eventID}/receipt/</restUrl>
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

//Check the exact fields
WS.verifyElementPropertyValue(response, 'receipt_url', null)
WS.verifyElementPropertyValue(response, 'payment_type', &quot;credit_card&quot;)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
