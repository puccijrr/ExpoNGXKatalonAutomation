<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Event creation</name>
   <tag></tag>
   <elementGuidId>d20c92a7-4e6c-4607-a179-ddd9ef37a15c</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n\t\&quot;min_date\&quot;: \&quot;2019-06-24\&quot;,\n\t\&quot;country\&quot;: \&quot;United States\&quot;,\n\t\&quot;state\&quot;: \&quot;IL\&quot;,\n\t\&quot;enable_attendees\&quot;: true,\n\t\&quot;venue_phone_number\&quot;: \&quot;\&quot;,\n\t\&quot;max_date\&quot;: \&quot;2019-07-11\&quot;,\n\t\&quot;name\&quot;: \&quot;New Event API\&quot;,\n\t\&quot;date_from\&quot;: \&quot;2019-07-11T18:11:24.330Z\&quot;,\n\t\&quot;date_to\&quot;: \&quot;2019-07-12T18:11:24.330Z\&quot;,\n\t\&quot;venue\&quot;: \&quot;here\&quot;,\n\t\&quot;street\&quot;: \&quot;123 Fake st.\&quot;,\n\t\&quot;city\&quot;: \&quot;Chicago\&quot;,\n\t\&quot;zip_code\&quot;: 58585,\n\t\&quot;exhibitor_only\&quot;: false,\n\t\&quot;timezone_name\&quot;: \&quot;America/Chicago\&quot;,\n\t\&quot;day_from\&quot;: {\n\t\t\&quot;year\&quot;: 2019,\n\t\t\&quot;month\&quot;: 7,\n\t\t\&quot;day\&quot;: 11\n\t},\n\t\&quot;day_to\&quot;: {\n\t\t\&quot;year\&quot;: 2019,\n\t\t\&quot;month\&quot;: 7,\n\t\t\&quot;day\&quot;: 12\n\t}\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer ${Bearer}</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${url}/api/v1.1/conferences/</restUrl>
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
   <variables>
      <defaultValue>GlobalVariable.username</defaultValue>
      <description></description>
      <id>674ca817-2642-47fa-be85-2aac4126a2f6</id>
      <masked>false</masked>
      <name>username</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.password</defaultValue>
      <description></description>
      <id>11f0b8d7-d9aa-4178-bde0-4db358528c89</id>
      <masked>false</masked>
      <name>password</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.clientID</defaultValue>
      <description></description>
      <id>5c32a501-64f9-46d9-a41e-cbec9ef15357</id>
      <masked>false</masked>
      <name>clientID</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.Bearer</defaultValue>
      <description></description>
      <id>3e57e566-cd42-4438-8f3e-773348cf06a8</id>
      <masked>false</masked>
      <name>bearer</name>
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

WS.verifyResponseStatusCode(response, 201)

assertThat(response.getStatusCode()).isEqualTo(201)

//Verify username
//WS.verifyElementPropertyValue(response, 'username', '${username}')


</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
