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
import com.liferay.assignment.registration.service.base.RegisterLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the register local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.liferay.assignment.registration.service.RegisterLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author tarun
 * @see RegisterLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.liferay.assignment.registration.model.Register",
	service = AopService.class
)
public class RegisterLocalServiceImpl extends RegisterLocalServiceBaseImpl {

	
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.liferay.assignment.registration.service.RegisterLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.liferay.assignment.registration.service.RegisterLocalServiceUtil</code>.
	 */
	
	public Register addRegister(long groupId, String first_name, String last_name, String email_address, String user_name,
			String birthday, String gender, String password2, long home_phone, Long mobile_phone, String address, String address2,
			String city, String state, String zip, String security_question, String security_answer, boolean accepted_tou, ServiceContext serviceContext) throws PortalException {
		
		
		
		//Group group = groupLocalService.getGroup(groupId);
		
		Group group= serviceContext.getScopeGroup();
		long userId = serviceContext.getUserId();
		
		User user = userLocalService.getUser(userId);
		
		// Generate a primary key for the new register
		long registerId = counterLocalService.increment(Register.class.getName());
		
		// Create the assignment using the new primary key
		Register register = createRegister(registerId);
		
		
		
		// Populate field values to the new register object
		
					register.setCompanyId(group.getCompanyId());
					register.setCreateDate(serviceContext.getCreateDate(new Date()));
					register.setGroupId(groupId);
					register.setModifiedDate(serviceContext.getModifiedDate(new Date()));
					register.setUserId(userId);
					register.setUserName(user.getScreenName());
					
		//			custom fields
					register.setFirst_name(first_name);
					register.setLast_name(last_name);
					register.setEmail_address(email_address);
					register.setUser_name(user_name);
					register.setBirthday(new Date());
					register.setGender(gender);
					register.setPassword2(password2);
					register.setHome_phone(home_phone);
					register.setMobile_phone(mobile_phone);
					register.setAddress(address);
					register.setAddress2(address2);
					register.setCity(city);
					register.setState(state);
					register.setZip(zip);
					register.setSecurity_question(security_question);
					register.setSecurity_answer(security_answer);
					register.setAccepted_tou(accepted_tou);
					
					
				
				// Persist it to database
				register= super.addRegister(register);
		
		
		return register;
		
		
	}
	
	
	
}