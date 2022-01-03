<%@ include file="/init.jsp" %>

<portlet:resourceURL id="/captcha" var="captchaURL" />


<portlet:actionURL name="/captchaVerify" var="captchaVerify"></portlet:actionURL>


<liferay-ui:error key="Message" message="Invalid captcha text. Please re-Enter"/>




		
<aui:form action="<%=captchaVerify %>" method="post" name="fm">  
   <liferay-captcha:captcha url="<%= captchaURL %>" />
   <aui:button-row>
    <aui:button 
		type="submit" value="Submit"></aui:button>
   </aui:button-row>

</aui:form>