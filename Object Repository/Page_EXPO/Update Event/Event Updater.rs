<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Event Updater</name>
   <tag></tag>
   <elementGuidId>c9820c00-d2a8-4619-ba17-b4c354da8b85</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;id\&quot;: 1940,\n  \&quot;user\&quot;: 1980,\n  \&quot;name\&quot;: \&quot;Event that Auto Updates Yo\&quot;,\n  \&quot;date_from\&quot;: \&quot;2020-09-30T00:00:00-05:00\&quot;,\n  \&quot;date_to\&quot;: \&quot;2020-09-29T23:59:59.999999-05:00\&quot;,\n  \&quot;venue\&quot;: \&quot;YO YO YO\&quot;,\n  \&quot;venue_url\&quot;: \&quot;\&quot;,\n  \&quot;markup_fee\&quot;: 0,\n  \&quot;exhibitor_only\&quot;: false,\n  \&quot;street\&quot;: \&quot;3900 North Damen Ave.\&quot;,\n  \&quot;city\&quot;: \&quot;Chicago\&quot;,\n  \&quot;state\&quot;: \&quot;IL\&quot;,\n  \&quot;country\&quot;: \&quot;United States\&quot;,\n  \&quot;website\&quot;: \&quot;\&quot;,\n  \&quot;payment_provider\&quot;: \&quot;stripe\&quot;,\n  \&quot;is_gdpr_enabled\&quot;: null,\n  \&quot;logo\&quot;: \&quot;https://s3.amazonaws.com/expo-images/11583ae13149f335eb12d0c3e91835a2.jpeg\&quot;,\n  \&quot;cover_screen_logo\&quot;: \&quot;https://s3.amazonaws.com/expo-images/11583ae13149f335eb12d0c3e91835a2.jpeg\&quot;,\n  \&quot;code\&quot;: \&quot;VSJ639\&quot;,\n  \&quot;zip_code\&quot;: \&quot;60618\&quot;,\n  \&quot;timezone_name\&quot;: \&quot;America/Chicago\&quot;,\n  \&quot;venue_phone_number\&quot;: \&quot;(847) 409-0246\&quot;,\n  \&quot;payment_type\&quot;: 1,\n  \&quot;rule_type\&quot;: \&quot;no_custom_id\&quot;,\n  \&quot;initial_fee\&quot;: 250,\n  \&quot;user_fee\&quot;: 50,\n  \&quot;exhibitor_user_fee\&quot;: 50,\n  \&quot;updated_at\&quot;: \&quot;2020-09-29T21:23:57.197338+00:00\&quot;,\n  \&quot;shortdate_from\&quot;: \&quot;2020-09-30\&quot;,\n  \&quot;shortdate_to\&quot;: \&quot;2020-09-30\&quot;,\n  \&quot;date_from_raw\&quot;: {\n    \&quot;month\&quot;: 9,\n    \&quot;minute\&quot;: 0,\n    \&quot;day\&quot;: 30,\n    \&quot;hour\&quot;: 0,\n    \&quot;year\&quot;: 2020\n  },\n  \&quot;date_to_raw\&quot;: {\n    \&quot;month\&quot;: 9,\n    \&quot;minute\&quot;: 59,\n    \&quot;day\&quot;: 30,\n    \&quot;hour\&quot;: 23,\n    \&quot;year\&quot;: 2020\n  },\n  \&quot;lead_retrieval_fee\&quot;: 250,\n  \&quot;time_zone\&quot;: \&quot;-0500\&quot;,\n  \&quot;cover_screen\&quot;: {\n    \&quot;id\&quot;: 1673,\n    \&quot;background_url\&quot;: null,\n    \&quot;overlay_type\&quot;: \&quot;light\&quot;,\n    \&quot;text_color_type\&quot;: \&quot;light\&quot;,\n    \&quot;default_image_id\&quot;: 1,\n    \&quot;conference\&quot;: 1940,\n    \&quot;display_image_url\&quot;: \&quot;https://s3.amazonaws.com/expo-static/resources/default_cover_screens/conference_background_0.png\&quot;\n  },\n  \&quot;features\&quot;: {\n    \&quot;has_registration\&quot;: false,\n    \&quot;check_in\&quot;: false,\n    \&quot;badge\&quot;: false,\n    \&quot;id\&quot;: \&quot;1940\&quot;,\n    \&quot;on_site_registration\&quot;: false\n  }\n}&quot;,
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
      <value>Basic cmlja0BleHBvcGFzcy5jb206UGFzc3dvcmQx</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${url}/api/v1.1/conference/1940/</restUrl>
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
WS.verifyElementPropertyValue(response, 'username', '${username}')


</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
