<%@include file="/init.jsp"%>
<%
String mvcPath = ParamUtil.getString(request, "mvcPath");
ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
EmployeeModel entry = (EmployeeModel)row.getObject(); 
%>

<liferay-ui:icon-menu>
		<portlet:renderURL var="editURL">
            <portlet:param name="employeeId" value="<%= String.valueOf(entry.getEmployeeId()) %>" />
            <portlet:param name="mvcRenderCommandName" value="/editEntry" />
            <portlet:param name="backUrl" value="${currentUrl}" />
        </portlet:renderURL>

      <liferay-ui:icon image="edit" message="Edit"   url="<%=editURL.toString() %>" />
      
        <portlet:actionURL name="/deleteEntry" var="deleteURL">
            <portlet:param name="employeeId" value="<%= String.valueOf(entry.getEmployeeId()) %>" />
            <portlet:param name="deleteRow"  value="delete" />
            <portlet:param name="backUrl"  value="${currentUrl}"  />
        </portlet:actionURL>
        
       <%--  <portlet:resourceURL id="/deleteEntry" var="deleteURL">
        	<portlet:param name="employeeId" value="<%= String.valueOf(entry.getEmployeeId()) %>" />
            <portlet:param name="deleteRow"  value="delete" />
            <portlet:param name="backUrl"  value="${currentUrl}"  />
        </portlet:resourceURL> --%>


        <liferay-ui:icon image="delete" message="Delete" url="<%=deleteURL.toString() %>" />

</liferay-ui:icon-menu>