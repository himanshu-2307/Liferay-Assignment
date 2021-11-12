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
 * Provides a wrapper for {@link DepartmentService}.
 *
 * @author Brian Wing Shun Chan
 * @see DepartmentService
 * @generated
 */
public class DepartmentServiceWrapper
	implements DepartmentService, ServiceWrapper<DepartmentService> {

	public DepartmentServiceWrapper(DepartmentService departmentService) {
		_departmentService = departmentService;
	}

	@Override
	public com.liferay.assignment.office.model.Department addDepartment(
			long userId, String deptName,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _departmentService.addDepartment(
			userId, deptName, serviceContext);
	}

	@Override
	public com.liferay.assignment.office.model.Department deleteDepartment(
			long departmentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _departmentService.deleteDepartment(departmentId);
	}

	@Override
	public com.liferay.assignment.office.model.Department getDepartment(
			long departmentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _departmentService.getDepartment(departmentId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _departmentService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.assignment.office.model.Department updateDepartment(
			long userId, long departmentId, String deptName,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _departmentService.updateDepartment(
			userId, departmentId, deptName, serviceContext);
	}

	@Override
	public DepartmentService getWrappedService() {
		return _departmentService;
	}

	@Override
	public void setWrappedService(DepartmentService departmentService) {
		_departmentService = departmentService;
	}

	private DepartmentService _departmentService;

}