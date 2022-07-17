<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description>Registration form fields</description>
   <name>GetAttenFields</name>
   <tag></tag>
   <elementGuidId>42bb41f4-d1a7-4e5a-94c5-8f823580f286</elementGuidId>
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
   <restUrl>${url}/api/${webVersion}/forms/${eventID}/attendee_fields/</restUrl>
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

//Check the count of fields is correct
WS.verifyElementsCount(response, &quot;standard_fields&quot;, 11)

//Check the exact fields
WS.verifyElementPropertyValue(response, 'standard_fields[0].name', 'first_name')
WS.verifyElementPropertyValue(response, 'standard_fields[1].name', &quot;last_name&quot;)
WS.verifyElementPropertyValue(response, 'standard_fields[2].name', &quot;email_address&quot;)
WS.verifyElementPropertyValue(response, 'standard_fields[3].name', &quot;company_name&quot;)
WS.verifyElementPropertyValue(response, 'standard_fields[4].name', &quot;job_title&quot;)
WS.verifyElementPropertyValue(response, 'standard_fields[5].name', &quot;phone_number&quot;)
WS.verifyElementPropertyValue(response, 'standard_fields[6].name', &quot;street_address&quot;)
WS.verifyElementPropertyValue(response, 'standard_fields[7].name', &quot;city&quot;)
WS.verifyElementPropertyValue(response, 'standard_fields[8].name', &quot;zip_code&quot;)
WS.verifyElementPropertyValue(response, 'standard_fields[9].name', &quot;state&quot;)
WS.verifyElementPropertyValue(response, 'standard_fields[10].name', &quot;country&quot;)
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
