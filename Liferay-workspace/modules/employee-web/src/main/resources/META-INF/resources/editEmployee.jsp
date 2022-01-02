<%@ include file="init.jsp"%>
<%@page import="com.liferay.assignment.office.model.EmployeeModel" %>
<portlet:renderURL var="viewURL">
	<portlet:param name="mvcPath" value="/view.jsp"></portlet:param>
</portlet:renderURL>




<portlet:actionURL name="/editCurrentEntry" var="editEntryURL">
 	<portlet:param name="editEntry" value="edit" />
 	<portlet:param name="employeeId" value="${employee.employeeId}" />
 	<portlet:param name="backUrl" value="${currentUrl}" />
</portlet:actionURL>

<liferay-ui:success key="employeeUpdated" message="successfully" />
<liferay-ui:success key="employeeAdded" message="successfully" />
<liferay-ui:error key="error-key" message="error"/>

<aui:form action="<%=editEntryURL%>" name="<portlet:namespace />fm">
  <aui:model-context bean="${employee}" model="<%=EmployeeModel.class %>"/>
	<aui:fieldset-group markupView="lexicon">
		<aui:fieldset label="Basic Info">
			<aui:row>
			    <aui:col width="33">
					<aui:input label="Employee ID" name="employeeId"
						 type="text" disabled="true">
						
					</aui:input>
				</aui:col>
				<aui:col width="33">
					<aui:input label="Name" name="name" type="text">
						<aui:validator errorMessage="Please enter the full name"
							name="required"></aui:validator>
						<aui:validator name="alphanum"></aui:validator>
						<aui:validator name="maxLength">50</aui:validator>
					</aui:input>
				</aui:col>
				<aui:col width="33">
					<aui:input label="Job Title" name="jobTitle" type="text">
						<aui:validator name="alphanum"></aui:validator>
						<aui:validator name="maxLength">50</aui:validator>
					</aui:input>
				</aui:col>
			</aui:row>
			<aui:row>
				<aui:col width="33">
					<aui:input label="User ID" name="userId"
						required="true" type="text">
						<aui:validator name="number"></aui:validator>
					</aui:input>
				</aui:col>
				<aui:col width="33">
					<aui:input label="Department ID" name="departmentId"
						required="true" type="text">
						<aui:validator name="number"></aui:validator>
					</aui:input>
				</aui:col>
				<aui:col width="33">
					<aui:input label="Project ID" name="projectId" required="true"
						type="text">
						<aui:validator name="number"></aui:validator>
					</aui:input>
				</aui:col>
			</aui:row>
			<aui:row>
				<aui:col width="50">
					<aui:input label="Phone No" name="phoneNo" type="text">
						<aui:validator name="number"></aui:validator>
						<aui:validator name="rangeLength"
							errorMessage="Please enter 10 digit Home Phone">[10,10]</aui:validator>
					</aui:input>
				</aui:col>
				<aui:col width="50">
					<aui:input label="Salary" name="salary" type="text">
						<aui:validator name="number"></aui:validator>
						
					</aui:input>
				</aui:col>
			</aui:row>
			

		</aui:fieldset>
	</aui:fieldset-group>


	<aui:button-row>
		<aui:button type="submit"></aui:button>
		<aui:button type="cancel" onClick="<%=viewURL.toString()%>"></aui:button>
		
	</aui:button-row>
</aui:form>