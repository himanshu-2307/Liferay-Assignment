<%@ include file="/init.jsp"%>

<portlet:renderURL var="addEntryURL">
	<portlet:param name="mvcPath" value="/addEntry.jsp"></portlet:param>
</portlet:renderURL>

<portlet:renderURL var="deleteEntryURL">
	<portlet:param name="mvcPath" value="/deleteEntry.jsp"></portlet:param>
</portlet:renderURL>

<portlet:renderURL var="viewEntryURL">
	<portlet:param name="mvcRenderCommandName" value="/office/render"></portlet:param>
</portlet:renderURL>

<portlet:renderURL var="searchContainerURL">
    <portlet:param name="mvcRenderCommandName" value="/searchContainer" /> 
</portlet:renderURL>

<aui:button-row>
	<aui:button onClick="<%=addEntryURL.toString()%>"
		value="Register Employee"></aui:button>

	<aui:button onClick="<%=deleteEntryURL.toString()%>"
		value="Delete Employee"></aui:button>

	<aui:button onClick="<%=viewEntryURL.toString()%>"
		value="View All Employees"></aui:button>
	<aui:button onClick="<%= searchContainerURL.toString()%>"
		value="Search Container"></aui:button>
</aui:button-row>