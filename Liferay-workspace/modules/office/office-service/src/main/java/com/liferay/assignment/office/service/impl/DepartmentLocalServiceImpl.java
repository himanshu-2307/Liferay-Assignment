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

import com.liferay.assignment.office.model.Department;
import com.liferay.assignment.office.service.base.DepartmentLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the department local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.assignment.office.service.DepartmentLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DepartmentLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.liferay.assignment.office.model.Department",
	service = AopService.class
)
public class DepartmentLocalServiceImpl extends DepartmentLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.liferay.assignment.office.service.DepartmentLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.liferay.assignment.office.service.DepartmentLocalServiceUtil</code>.
	 */
	
	
	public Department addDepartment(long userId, String deptName, ServiceContext serviceContext) throws PortalException {
			
			long groupId= serviceContext.getScopeGroupId();
			
			User user= userLocalService.getUserById(userId);
			
			long departmentId= counterLocalService.increment();
			
			Department department= departmentPersistence.create(departmentId);
			
			department.setUserUuid(serviceContext.getUuid());
			department.setUserId(userId);
			department.setGroupId(groupId);
			department.setCompanyId(user.getCompanyId());
			department.setUserName(user.getFullName());
			department.setCreateDate(serviceContext.getCreateDate());
			department.setModifiedDate(serviceContext.getModifiedDate());
			department.setExpandoBridgeAttributes(serviceContext);
			department.setDeptName(deptName);
			department.setDepartmentId(departmentId);
			
			departmentPersistence.update(department);
			
			return department;
			
		}
		
		public Department updateDepartment(long userId,long departmentId, String deptName, ServiceContext serviceContext)
			throws PortalException {
			
			Department department= departmentPersistence.findByPrimaryKey(departmentId);
			
			User user = userLocalService.getUserById(userId);
			
			department.setUserId(userId);
			department.setUserName(user.getFullName());
			department.setModifiedDate(serviceContext.getModifiedDate());
			department.setExpandoBridgeAttributes(serviceContext);
			department.setDepartmentId(departmentId);
			department.setDeptName(deptName);
			
			departmentPersistence.update(department);
			
			return department;
		}
		
		public Department deleteDepartment(Department department) throws PortalException  {
			
			departmentPersistence.remove(department);
		
		return department;
		}
		public Department deleteDepartment(long departmentId) throws PortalException {
			
			Department department= departmentPersistence.findByPrimaryKey(departmentId);
			
			return deleteDepartment(department);
			
		}
		public Department getDepartment(long departmentId) throws PortalException{
			
			return departmentPersistence.findByPrimaryKey(departmentId);
		}
		
		
		
	
}