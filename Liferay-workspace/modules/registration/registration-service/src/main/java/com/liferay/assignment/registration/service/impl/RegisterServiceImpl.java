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

package com.liferay.assignment.registration.service.impl;

import com.liferay.assignment.registration.model.Register;
import com.liferay.assignment.registration.service.base.RegisterServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the register remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.assignment.registration.service.RegisterService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author tarun
 * @see RegisterServiceBaseImpl
 */
@Component(
	property = {
		"json.web.service.context.name=rgs",
		"json.web.service.context.path=Register"
	},
	service = AopService.class
)
public class RegisterServiceImpl extends RegisterServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use <code>com.liferay.assignment.registration.service.RegisterServiceUtil</code> to access the register remote service.
	 */
	
	public Register addRegister(long groupId, String first_name, String last_name, String email_address, String user_name,
			String birthday, String gender, String password2, long home_phone, Long mobile_phone, String address, String address2,
			String city, String state, String zip, String security_question, String security_answer, boolean accepted_tou, ServiceContext serviceContext) throws PortalException {
	
		return registerLocalService.addRegister(groupId, first_name, last_name, email_address, user_name, birthday, gender, password2, home_phone, mobile_phone, address, address2, city, state, zip, security_question, security_answer, accepted_tou, serviceContext);
	}
	
	
}