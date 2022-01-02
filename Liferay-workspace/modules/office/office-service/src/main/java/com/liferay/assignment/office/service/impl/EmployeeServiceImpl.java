/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.assignment.office.service.impl;

import com.liferay.assignment.office.model.Employee;
import com.liferay.assignment.office.service.base.EmployeeServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the employee remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.assignment.office.service.EmployeeService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=office",
		"json.web.service.context.path=Employee"
	},
	service = AopService.class
)
public class EmployeeServiceImpl extends EmployeeServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>com.liferay.assignment.office.service.EmployeeServiceUtil</code> to access the employee remote service.
	 */
	
	
	
	public Employee addEmployee(long userId, String name, String jobTitle, long phoneNo, long salary, long departmentId, long projectId, ServiceContext serviceContext) throws PortalException{
						
				return employeeLocalService.addEmployee(userId, name, jobTitle, phoneNo, salary, departmentId, projectId, serviceContext);
	}
	
	public Employee updateEmployee(long userId,long employeeId, String name, String jobTitle, long phoneNo, long salary, 
			long departmentId, long projectId, ServiceContext serviceContext) throws PortalException {
		
				return employeeLocalService.updateEmployee(userId, employeeId, name, jobTitle, phoneNo, salary, departmentId, projectId, serviceContext);
	}
	
	public Employee deleteEmployee(long employeeId) throws PortalException {
		return employeeLocalService.deleteEmployee(employeeId);
	}
	
	public Employee getEmployee(long employeeId) throws PortalException {
		return employeeLocalService.getEmployee(employeeId);
	}
	
	 public List<Employee> getNameSalary(String name, long salary){
		    return employeeLocalService.getNameSalary(name, salary);
	}
	 public List<Employee> getEmployeeByGroupId(long groupId,long userId){
			
			return employeeLocalService.getEmployeeByGroupIdAsLocal(groupId, userId);
    }
	 
	 public List<Employee> getEmployeeByGroupIdAndUserIdAsRemote( long userId, long groupId){
	 		return employeeLocalService.getEmployeeByGroupIdAndUserIdAsLocal(userId, groupId);
	 }
	//Custom SQL Query
		public List<Employee> getAllEmployeesInformation(int start, int end) {
			return employeeLocalService.getAllEmployeesInformationAsLocal(start, end);
		}
	 
}