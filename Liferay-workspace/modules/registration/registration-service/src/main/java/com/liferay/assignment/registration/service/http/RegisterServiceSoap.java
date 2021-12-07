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

package com.liferay.assignment.registration.service.http;

import com.liferay.assignment.registration.service.RegisterServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * <code>RegisterServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>com.liferay.assignment.registration.model.RegisterSoap</code>. If the method in the
 * service utility returns a
 * <code>com.liferay.assignment.registration.model.Register</code>, that is translated to a
 * <code>com.liferay.assignment.registration.model.RegisterSoap</code>. Methods that SOAP
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
 * @author tarun
 * @see RegisterServiceHttp
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class RegisterServiceSoap {

	public static com.liferay.assignment.registration.model.RegisterSoap
			addRegister(
				long groupId, String first_name, String last_name,
				String email_address, String user_name, String birthday,
				String gender, String password2, long home_phone,
				Long mobile_phone, String address, String address2, String city,
				String state, String zip, String security_question,
				String security_answer, boolean accepted_tou,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {

		try {
			com.liferay.assignment.registration.model.Register returnValue =
				RegisterServiceUtil.addRegister(
					groupId, first_name, last_name, email_address, user_name,
					birthday, gender, password2, home_phone, mobile_phone,
					address, address2, city, state, zip, security_question,
					security_answer, accepted_tou, serviceContext);

			return com.liferay.assignment.registration.model.RegisterSoap.
				toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(RegisterServiceSoap.class);

}