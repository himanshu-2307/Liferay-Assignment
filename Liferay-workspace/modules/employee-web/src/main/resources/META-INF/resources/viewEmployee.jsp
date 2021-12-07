<%@include file="init.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 


<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/view.jsp"></portlet:param>
</portlet:renderURL>

<div class="container">
	<!-- <table border="1" width="500"> -->
	<table >
		<tr>
			<th>uuid_</th>
			<th>employeeId</th>
			<th>groupId</th>
			<th>companyId</th>
			<th>name</th>
			<th>userName</th>
			<th>userId</th>
			<th>jobTitle</th>
			<th>phoneNo</th>
			<th>salary</th>
			<th>departmentId</th>
			<th>projectId</th>
			<th>createDate</th>
			<th>modifiedDate</th>
		</tr>
		
	<c:forEach items="${employeeList}" var="employee">  
  			<tr> 
    		<td>${employee.uuid}</td>
			<td>${employee.employeeId}</td>
			<td>${employee.groupId}</td>
			<td>${employee.companyId}</td>
			<td>${employee.name}</td>
			<td>${employee.userName}</td>
			<td>${employee.userId}</td>
			<td>${employee.jobTitle}</td>
			<td>${employee.phoneNo}</td>
			<td>${employee.salary}</td>
			<td>${employee.departmentId}</td>
			<td>${employee.projectId}</td>
			<td>${employee.createDate}</td>
			<td>${employee.modifiedDate}</td>
		</tr>
        
</c:forEach> 

	</table>
	<aui:button type="cancel" onClick="<%=viewURL.toString()%>"></aui:button>
</div>


