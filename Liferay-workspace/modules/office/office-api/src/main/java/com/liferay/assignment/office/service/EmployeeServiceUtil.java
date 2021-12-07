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

import com.liferay.assignment.office.model.Employee;
import com.liferay.portal.kernel.exception.PortalException;

import java.util.List;

/**
 * Provides the remote service utility for Employee. This utility wraps
 * <code>com.liferay.assignment.office.service.impl.EmployeeServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeService
 * @generated
 */
public class EmployeeServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.assignment.office.service.impl.EmployeeServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Employee addEmployee(
			long userId, String name, String jobTitle, long phoneNo,
			long salary, long departmentId, long projectId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addEmployee(
			userId, name, jobTitle, phoneNo, salary, departmentId, projectId,
			serviceContext);
	}

	public static Employee deleteEmployee(long employeeId)
		throws PortalException {

		return getService().deleteEmployee(employeeId);
	}

	public static List<Employee> getAllEmployeesInformation() {
		return getService().getAllEmployeesInformation();
	}

	public static Employee getEmployee(long employeeId) throws PortalException {
		return getService().getEmployee(employeeId);
	}

	public static List<Employee> getEmployeeByGroupId(
		long groupId, long userId) {

		return getService().getEmployeeByGroupId(groupId, userId);
	}

	public static List<Employee> getEmployeeByGroupIdAndUserIdAsRemote(
		long userId, long groupId) {

		return getService().getEmployeeByGroupIdAndUserIdAsRemote(
			userId, groupId);
	}

	public static List<Employee> getNameSalary(String name, long salary) {
		return getService().getNameSalary(name, salary);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static Employee updateEmployee(
			long userId, long employeeId, String name, String jobTitle,
			long phoneNo, long salary, long departmentId, long projectId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updateEmployee(
			userId, employeeId, name, jobTitle, phoneNo, salary, departmentId,
			projectId, serviceContext);
	}

	public static EmployeeService getService() {
		return _service;
	}

	private static volatile EmployeeService _service;

}