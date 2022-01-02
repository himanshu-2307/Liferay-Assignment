<%@include file="init.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@page import="java.util.List"%>
<%@page import="com.liferay.assignment.office.model.Employee" %>
<%@page import="com.liferay.portal.kernel.util.ListUtil" %>



<%-- <liferay-portlet:renderURL varImpl="searchURL">
        <portlet:param name="mvcRenderCommandName" value="/searchKeyword" />
</liferay-portlet:renderURL> --%>

<portlet:actionURL name="/searchKeyword" var="searchURL"></portlet:actionURL>



<aui:form action="<%= searchURL %>"  name="fm">
    <%-- <liferay-portlet:renderURLParams varImpl="searchURL" /> --%>
    
    <div class="search-form">
        <span class="aui-search-bar">
            <aui:input inlineField="<%= true %>" label="" name="keywords" size="30" title="search-entries" type="text" />

            <aui:button type="submit" value="search" />
        </span>
    </div>
</aui:form>

<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/view.jsp"></portlet:param>
</portlet:renderURL>


	
	<liferay-portlet:renderURL varImpl="iteratorURL">
			<portlet:param name="mvcPath" value="/searchContainer.jsp"/>	
	</liferay-portlet:renderURL>
	
	    
	    
    <liferay-ui:search-container searchContainer="${searchContainer}">
    <liferay-ui:search-container-results results="${searchContainer.results}" />
	<liferay-ui:search-container-row className="com.liferay.assignment.office.model.EmployeeModel" keyProperty="employeeId" modelVar="aEmployeeModel">
	
	<liferay-ui:search-container-column-text property="employeeId" name="Employee ID" value="${aEmployeeModel.employeeId}" />
	<liferay-ui:search-container-column-text property="groupId" name="Group ID" value="${aEmployeeModel.groupId}" />
	<liferay-ui:search-container-column-text property="companyId" name="Company ID" value="${aEmployeeModel.companyId}" />
	<liferay-ui:search-container-column-text property="name" name="Name" value="${aEmployeeModel.name}" />
	<liferay-ui:search-container-column-text property="userName" name="Username" value="${aEmployeeModel.userName}" />
	<liferay-ui:search-container-column-text property="userId" name="User ID" value="${aEmployeeModel.userId}" />
	<liferay-ui:search-container-column-text property="jobTitle" name="Job Title" value="${aEmployeeModel.jobTitle}" />
	<liferay-ui:search-container-column-text property="phoneNo" name="Phone No" value="${aEmployeeModel.phoneNo}" />
	<liferay-ui:search-container-column-text property="salary" name="Salary" value="${aEmployeeModel.salary}" />
	<liferay-ui:search-container-column-text property="departmentId" name="Department ID" value="${aEmployeeModel.departmentId}" />
	<liferay-ui:search-container-column-text property="projectId" name="Project ID" value="${aEmployeeModel.projectId}" />
	<liferay-ui:search-container-column-text property="createDate" name="Create Date" value="${aEmployeeModel.createDate}" />
	<liferay-ui:search-container-column-text property="modifiedDate" name="Modified Date" value="${aEmployeeModel.modifiedDate}" />	
	<liferay-ui:search-container-column-jsp align="right" path="/entry_actions.jsp" />
	 
	</liferay-ui:search-container-row>
	 <liferay-ui:search-iterator searchContainer="${searchContainer}" markupView="lexicon" />
	
	</liferay-ui:search-container>
	<aui:button type="cancel" onClick="<%=viewURL.toString()%>"></aui:button>