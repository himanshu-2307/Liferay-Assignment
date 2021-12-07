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

package com.liferay.assignment.registration.service;

import com.liferay.assignment.registration.model.Register;
import com.liferay.portal.kernel.exception.PortalException;

/**
 * Provides the remote service utility for Register. This utility wraps
 * <code>com.liferay.assignment.registration.service.impl.RegisterServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author tarun
 * @see RegisterService
 * @generated
 */
public class RegisterServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.assignment.registration.service.impl.RegisterServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Register addRegister(
			long groupId, String first_name, String last_name,
			String email_address, String user_name, String birthday,
			String gender, String password2, long home_phone, Long mobile_phone,
			String address, String address2, String city, String state,
			String zip, String security_question, String security_answer,
			boolean accepted_tou,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addRegister(
			groupId, first_name, last_name, email_address, user_name, birthday,
			gender, password2, home_phone, mobile_phone, address, address2,
			city, state, zip, security_question, security_answer, accepted_tou,
			serviceContext);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static RegisterService getService() {
		return _service;
	}

	private static volatile RegisterService _service;

}