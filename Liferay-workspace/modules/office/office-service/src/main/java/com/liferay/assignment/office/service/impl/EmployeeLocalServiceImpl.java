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
import com.liferay.assignment.office.service.base.EmployeeLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the employee local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.assignment.office.service.EmployeeLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.liferay.assignment.office.model.Employee",
	service = AopService.class
)
public class EmployeeLocalServiceImpl extends EmployeeLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.liferay.assignment.office.service.EmployeeLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.liferay.assignment.office.service.EmployeeLocalServiceUtil</code>.
	 */
	
	public Employee addEmployee(long userId, String name, String jobTitle, long phoneNo, long salary,
			long departmentId, long projectId, ServiceContext serviceContext) throws PortalException{
		
		//Group group = groupLocalService.getGroup(groupId);
		
				long groupId= serviceContext.getScopeGroupId();
				User user= userLocalService.getUserById(userId);
				
				
				long employeeId = counterLocalService.increment();
				
				
				Employee employee = employeePersistence.create(employeeId);
				
				employee.setCompanyId(user.getCompanyId());
				employee.setCreateDate(serviceContext.getCreateDate(new Date()));
				employee.setGroupId(groupId);
				employee.setModifiedDate(serviceContext.getModifiedDate(new Date()));
				employee.setUserId(userId);
				employee.setUserName(user.getFullName());
				employee.setUuid(serviceContext.getUuid());
				employee.setExpandoBridgeAttributes(serviceContext);
				//Custom Fields
				employee.setName(name);
				employee.setJobTitle(jobTitle);
				employee.setPhoneNo(phoneNo);
				employee.setSalary(salary);
				employee.setDepartmentId(departmentId);
				employee.setProjectId(projectId);
				
				employeePersistence.update(employee);
		
		return employee;
	}
	
	
	 public Employee updateEmployee(long userId,long employeeId, String name, String jobTitle, long phoneNo, long salary,
	            long departmentId, long projectId, ServiceContext serviceContext)
	        throws PortalException {
	        Employee employee= employeePersistence.findByPrimaryKey(employeeId);
	        User user = userLocalService.getUserById(userId);
	        employee.setUserId(userId);
	        employee.setUserName(user.getFullName());
	        employee.setModifiedDate(serviceContext.getModifiedDate());
	        employee.setExpandoBridgeAttributes(serviceContext);
	        employee.setEmployeeId(employeeId);
	        employee.setName(name);
	        employee.setJobTitle(jobTitle);
	        employee.setPhoneNo(phoneNo);
	        employee.setSalary(salary);
	        employee.setDepartmentId(departmentId);
	        employee.setProjectId(projectId);
	        employeePersistence.update(employee);
	        
	        return employee;
	    }
	 public Employee deleteEmployee(Employee employee)  {
		    employeePersistence.remove(employee);
		    return employee;
		}
	 
	 public Employee deleteEmployee(long employeeId) throws PortalException {
		        Employee employee= employeePersistence.findByPrimaryKey(employeeId);
		        return deleteEmployee(employee);
		    }
	 
	 public Employee getEmployee(long employeeId) throws PortalException{
	        return employeePersistence.findByPrimaryKey(employeeId);
	    }
	 
	 public List<Employee> getNameSalary(String name, long salary){
		    return employeePersistence.findByName_salary(name, salary);
	 }
	 
	 public DynamicQuery getListWithDynamicQuery(long groupId, long userID) {
			
			DynamicQuery employeeQuery= (DynamicQuery) dynamicQuery(dynamicQuery().add(RestrictionsFactoryUtil.eq("groupId", groupId)).add(RestrictionsFactoryUtil.eq("userID", userID)));
				
				return employeeQuery;
		}
	 public List<Employee> getEmployeeByGroupIdAsLocal(String groupId, String userId){
			
			List<Employee> employeeList=employeeLocalService.dynamicQuery(dynamicQuery().add(RestrictionsFactoryUtil.eq("jobTitle", userId)));
				
				return employeeList;
		}
}