package com.liferay.training.employee.api;


import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.assignment.office.model.Employee;

import java.util.List;

/**
 * @author Administrator
 */
public interface EmployeeApi {
	
	public Employee addEmployeeOffice(long userId, String name, String jobTitle, long phoneNo, long salary, long departmentId,
			long projectId, ServiceContext serviceContext) throws PortalException;

	public Employee updateEmployeeOffice(long userId, long empId, String name, String jobTitle, long phoneNo, int salary,
			long departmentId, long projectId, ServiceContext serviceContext) throws PortalException;
	
	public Employee deleteEmployeeOffice(long employeeId) throws PortalException ;

	public Employee getEmployeeOffice(long employeeId) throws PortalException ;

	public List<Employee> getEmployeeByGroupIdAndUserIdOffice(long userId, long groupId) ;
	
	public List<Employee> getAllEmployeesInformationOffice() ;
	
	
}