<%@ include file="/init.jsp" %>

<portlet:resourceURL id="/captcha" var="captchaURL" />

<liferay-captcha:captcha url="<%= captchaURL %>" />