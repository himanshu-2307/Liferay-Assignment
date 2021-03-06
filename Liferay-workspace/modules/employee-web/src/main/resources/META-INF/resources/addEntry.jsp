<%@ include file="init.jsp" %>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addEntry" var="addEntryURL"></portlet:actionURL>


<aui:form action="<%= addEntryURL %>" name="<portlet:namespace />fm">
        <aui:fieldset>
            
            <aui:input name="name"></aui:input>
            <aui:input name="jobTitle"></aui:input>
            <aui:input name="phoneNo"></aui:input>
            <aui:input name="salary"></aui:input>
            <aui:input name="departmentId"></aui:input>
            <aui:input name="projectId"></aui:input>
        </aui:fieldset>

        <aui:button-row>
            <aui:button type="submit"></aui:button>
            <aui:button type="cancel" onClick="<%= viewURL.toString() %>"></aui:button>
        </aui:button-row>
</aui:form>