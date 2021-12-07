<%@ include file="/init.jsp" %>

<portlet:renderURL var="addEntryURL">
    <portlet:param name="mvcPath" value="/new_registration.jsp"></portlet:param>
</portlet:renderURL>


<aui:button-row>
    <aui:button onClick="<%= addEntryURL.toString()%>" value="Registration"></aui:button>
</aui:button-row>