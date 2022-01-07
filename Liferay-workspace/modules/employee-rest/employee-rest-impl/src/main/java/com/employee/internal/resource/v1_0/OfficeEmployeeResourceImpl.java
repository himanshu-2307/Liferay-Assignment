package com.employee.internal.resource.v1_0;

import com.employee.resource.v1_0.OfficeEmployeeResource;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author Administrator
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/office-employee.properties",
	scope = ServiceScope.PROTOTYPE, service = OfficeEmployeeResource.class
)
public class OfficeEmployeeResourceImpl extends BaseOfficeEmployeeResourceImpl {

	/*
	 * @Override public EmployeeDetails getEmployee(Long employeeId) throws
	 * Exception { // TODO Auto-generated method stub long emp =
	 * Long.parseLong(employeeId.toString()); Employee employee =
	 * employeeLocalService.getEmployee(emp);
	 * 
	 * 
	 * EmployeeDetails employeeDetails= new EmployeeDetails();
	 * employeeDetails.setName(employee.getName());
	 * employeeDetails.setEmployeeId(employeeId);
	 * employeeDetails.setJobTitle(employee.getJobTitle());
	 * employeeDetails.setDepartmentId(employee.getDepartmentId());
	 * employeeDetails.setSalary(employee.getSalary());
	 * 
	 * return employeeDetails; }
	 * 
	 * @Reference EmployeeLocalService employeeLocalService;
	 */
	
}