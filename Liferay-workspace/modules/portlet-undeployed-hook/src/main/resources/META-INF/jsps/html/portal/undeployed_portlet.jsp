<%@ include file="/html/portal/init.jsp" %>

<portlet:defineObjects />

<%
renderRequest.setAttribute(WebKeys.PORTLET_CONFIGURATOR_VISIBILITY, Boolean.TRUE);
%>

<div class="alert alert-info">
	<span>Hey, customization working !</span>
	<liferay-ui:message key="this-portlet-could-not-be-found.-please-redeploy-it-or-remove-it-from-the-page" />
</div>