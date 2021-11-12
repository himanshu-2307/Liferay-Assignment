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

package com.liferay.assignment.office.service.http;

import com.liferay.assignment.office.service.EmployeeServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * <code>EmployeeServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>com.liferay.assignment.office.model.EmployeeSoap</code>. If the method in the
 * service utility returns a
 * <code>com.liferay.assignment.office.model.Employee</code>, that is translated to a
 * <code>com.liferay.assignment.office.model.EmployeeSoap</code>. Methods that SOAP
 * cannot safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeServiceHttp
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class EmployeeServiceSoap {

	public static com.liferay.assignment.office.model.EmployeeSoap addEmployee(
			long userId, String name, String jobTitle, long phoneNo,
			long salary, long departmentId, long projectId,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.liferay.assignment.office.model.Employee returnValue =
				EmployeeServiceUtil.addEmployee(
					userId, name, jobTitle, phoneNo, salary, departmentId,
					projectId, serviceContext);

			return com.liferay.assignment.office.model.EmployeeSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.assignment.office.model.EmployeeSoap
			updateEmployee(
				long userId, long employeeId, String name, String jobTitle,
				long phoneNo, long salary, long departmentId, long projectId,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.liferay.assignment.office.model.Employee returnValue =
				EmployeeServiceUtil.updateEmployee(
					userId, employeeId, name, jobTitle, phoneNo, salary,
					departmentId, projectId, serviceContext);

			return com.liferay.assignment.office.model.EmployeeSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.assignment.office.model.EmployeeSoap
			deleteEmployee(long employeeId)
		throws RemoteException {

		try {
			com.liferay.assignment.office.model.Employee returnValue =
				EmployeeServiceUtil.deleteEmployee(employeeId);

			return com.liferay.assignment.office.model.EmployeeSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.assignment.office.model.EmployeeSoap getEmployee(
			long employeeId)
		throws RemoteException {

		try {
			com.liferay.assignment.office.model.Employee returnValue =
				EmployeeServiceUtil.getEmployee(employeeId);

			return com.liferay.assignment.office.model.EmployeeSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.assignment.office.model.EmployeeSoap[]
			getNameSalary(String name, long salary)
		throws RemoteException {

		try {
			java.util.List<com.liferay.assignment.office.model.Employee>
				returnValue = EmployeeServiceUtil.getNameSalary(name, salary);

			return com.liferay.assignment.office.model.EmployeeSoap.
				toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.liferay.assignment.office.model.EmployeeSoap[]
			getEmployeeByGroupId(String groupId, String userId)
		throws RemoteException {

		try {
			java.util.List<com.liferay.assignment.office.model.Employee>
				returnValue = EmployeeServiceUtil.getEmployeeByGroupId(
					groupId, userId);

			return com.liferay.assignment.office.model.EmployeeSoap.
				toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(EmployeeServiceSoap.class);

}