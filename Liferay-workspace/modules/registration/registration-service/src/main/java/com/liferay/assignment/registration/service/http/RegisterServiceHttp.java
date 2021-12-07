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
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>RegisterServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author tarun
 * @see RegisterServiceSoap
 * @generated
 */
public class RegisterServiceHttp {

	public static com.liferay.assignment.registration.model.Register
			addRegister(
				HttpPrincipal httpPrincipal, long groupId, String first_name,
				String last_name, String email_address, String user_name,
				String birthday, String gender, String password2,
				long home_phone, Long mobile_phone, String address,
				String address2, String city, String state, String zip,
				String security_question, String security_answer,
				boolean accepted_tou,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				RegisterServiceUtil.class, "addRegister",
				_addRegisterParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, first_name, last_name, email_address,
				user_name, birthday, gender, password2, home_phone,
				mobile_phone, address, address2, city, state, zip,
				security_question, security_answer, accepted_tou,
				serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.assignment.registration.model.Register)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(RegisterServiceHttp.class);

	private static final Class<?>[] _addRegisterParameterTypes0 = new Class[] {
		long.class, String.class, String.class, String.class, String.class,
		String.class, String.class, String.class, long.class, Long.class,
		String.class, String.class, String.class, String.class, String.class,
		String.class, String.class, boolean.class,
		com.liferay.portal.kernel.service.ServiceContext.class
	};

}