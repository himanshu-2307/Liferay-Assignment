package com.liferay.training.employee;


import com.liferay.assignment.office.service.EmployeeLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.training.employee.api.EmployeeApi;
import com.liferay.assignment.office.model.Employee;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Administrator
 */

 @Component(
		 immediate = true,
		 property = {},
				 service = EmployeeApi.class 
		 )

public class EmployeeService implements EmployeeApi {

	   @Override
		public Employee addEmployeeOffice(long userId, String name, String jobTitle, long phoneNo, long salary,
				long departmentId, long projectId, ServiceContext serviceContext) throws PortalException {
			
			return employeeLocalService.addEmployee(userId, name, jobTitle, phoneNo, salary, departmentId, projectId, serviceContext);
		}

		@Override
		public Employee updateEmployeeOffice(long userId, long employeeId, String name, String jobTitle, long phoneNo,
				int salary, long departmentId, long projectId, ServiceContext serviceContext) throws PortalException {
			// TODO Auto-generated method stub
			return employeeLocalService.updateEmployee(userId, employeeId, name, jobTitle, phoneNo, salary, departmentId, projectId, serviceContext);
		}

		
		@Override
		public Employee deleteEmployeeOffice(long employeeId) throws PortalException {
			// TODO Auto-generated method stub
			return employeeLocalService.deleteEmployee(employeeId);
		}

		@Override
		public Employee getEmployeeOffice(long employeeId) throws PortalException {
			// TODO Auto-generated method stub
			return employeeLocalService.getEmployee(employeeId);
		}

		

		@Override
		public List<Employee> getEmployeeByGroupIdAndUserIdOffice(long userId, long groupId) {
			// TODO Auto-generated method stub
			return employeeLocalService.getEmployeeByGroupIdAndUserIdAsLocal(userId, groupId);
		}
		
		@Override
		public List<Employee> getAllEmployeesInformationOffice() {
			// TODO Auto-generated method stub
			return employeeLocalService.getAllEmployeesInformationAsLocal();
		}
		

		@Reference
		EmployeeLocalService employeeLocalService;

	}