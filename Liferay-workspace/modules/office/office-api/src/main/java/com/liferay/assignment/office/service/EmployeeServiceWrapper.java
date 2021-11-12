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

package com.liferay.assignment.office.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EmployeeService}.
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeService
 * @generated
 */
public class EmployeeServiceWrapper
	implements EmployeeService, ServiceWrapper<EmployeeService> {

	public EmployeeServiceWrapper(EmployeeService employeeService) {
		_employeeService = employeeService;
	}

	@Override
	public com.liferay.assignment.office.model.Employee addEmployee(
			long userId, String name, String jobTitle, long phoneNo,
			long salary, long departmentId, long projectId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeService.addEmployee(
			userId, name, jobTitle, phoneNo, salary, departmentId, projectId,
			serviceContext);
	}

	@Override
	public com.liferay.assignment.office.model.Employee deleteEmployee(
			long employeeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeService.deleteEmployee(employeeId);
	}

	@Override
	public com.liferay.assignment.office.model.Employee getEmployee(
			long employeeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeService.getEmployee(employeeId);
	}

	@Override
	public java.util.List<com.liferay.assignment.office.model.Employee>
		getEmployeeByGroupId(String groupId, String userId) {

		return _employeeService.getEmployeeByGroupId(groupId, userId);
	}

	@Override
	public java.util.List<com.liferay.assignment.office.model.Employee>
		getNameSalary(String name, long salary) {

		return _employeeService.getNameSalary(name, salary);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _employeeService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.assignment.office.model.Employee updateEmployee(
			long userId, long employeeId, String name, String jobTitle,
			long phoneNo, long salary, long departmentId, long projectId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _employeeService.updateEmployee(
			userId, employeeId, name, jobTitle, phoneNo, salary, departmentId,
			projectId, serviceContext);
	}

	@Override
	public EmployeeService getWrappedService() {
		return _employeeService;
	}

	@Override
	public void setWrappedService(EmployeeService employeeService) {
		_employeeService = employeeService;
	}

	private EmployeeService _employeeService;

}