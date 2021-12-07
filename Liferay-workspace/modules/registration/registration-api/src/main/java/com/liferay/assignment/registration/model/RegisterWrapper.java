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

package com.liferay.assignment.registration.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Register}.
 * </p>
 *
 * @author tarun
 * @see Register
 * @generated
 */
public class RegisterWrapper
	extends BaseModelWrapper<Register>
	implements ModelWrapper<Register>, Register {

	public RegisterWrapper(Register register) {
		super(register);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("registerId", getRegisterId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("first_name", getFirst_name());
		attributes.put("last_name", getLast_name());
		attributes.put("email_address", getEmail_address());
		attributes.put("user_name", getUser_name());
		attributes.put("birthday", getBirthday());
		attributes.put("gender", getGender());
		attributes.put("password2", getPassword2());
		attributes.put("home_phone", getHome_phone());
		attributes.put("mobile_phone", getMobile_phone());
		attributes.put("address", getAddress());
		attributes.put("address2", getAddress2());
		attributes.put("city", getCity());
		attributes.put("state", getState());
		attributes.put("zip", getZip());
		attributes.put("security_question", getSecurity_question());
		attributes.put("security_answer", getSecurity_answer());
		attributes.put("accepted_tou", isAccepted_tou());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long registerId = (Long)attributes.get("registerId");

		if (registerId != null) {
			setRegisterId(registerId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String first_name = (String)attributes.get("first_name");

		if (first_name != null) {
			setFirst_name(first_name);
		}

		String last_name = (String)attributes.get("last_name");

		if (last_name != null) {
			setLast_name(last_name);
		}

		String email_address = (String)attributes.get("email_address");

		if (email_address != null) {
			setEmail_address(email_address);
		}

		String user_name = (String)attributes.get("user_name");

		if (user_name != null) {
			setUser_name(user_name);
		}

		Date birthday = (Date)attributes.get("birthday");

		if (birthday != null) {
			setBirthday(birthday);
		}

		String gender = (String)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		String password2 = (String)attributes.get("password2");

		if (password2 != null) {
			setPassword2(password2);
		}

		Long home_phone = (Long)attributes.get("home_phone");

		if (home_phone != null) {
			setHome_phone(home_phone);
		}

		Long mobile_phone = (Long)attributes.get("mobile_phone");

		if (mobile_phone != null) {
			setMobile_phone(mobile_phone);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String address2 = (String)attributes.get("address2");

		if (address2 != null) {
			setAddress2(address2);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String state = (String)attributes.get("state");

		if (state != null) {
			setState(state);
		}

		String zip = (String)attributes.get("zip");

		if (zip != null) {
			setZip(zip);
		}

		String security_question = (String)attributes.get("security_question");

		if (security_question != null) {
			setSecurity_question(security_question);
		}

		String security_answer = (String)attributes.get("security_answer");

		if (security_answer != null) {
			setSecurity_answer(security_answer);
		}

		Boolean accepted_tou = (Boolean)attributes.get("accepted_tou");

		if (accepted_tou != null) {
			setAccepted_tou(accepted_tou);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}
	}

	/**
	 * Returns the accepted_tou of this register.
	 *
	 * @return the accepted_tou of this register
	 */
	@Override
	public boolean getAccepted_tou() {
		return model.getAccepted_tou();
	}

	/**
	 * Returns the address of this register.
	 *
	 * @return the address of this register
	 */
	@Override
	public String getAddress() {
		return model.getAddress();
	}

	/**
	 * Returns the address2 of this register.
	 *
	 * @return the address2 of this register
	 */
	@Override
	public String getAddress2() {
		return model.getAddress2();
	}

	/**
	 * Returns the birthday of this register.
	 *
	 * @return the birthday of this register
	 */
	@Override
	public Date getBirthday() {
		return model.getBirthday();
	}

	/**
	 * Returns the city of this register.
	 *
	 * @return the city of this register
	 */
	@Override
	public String getCity() {
		return model.getCity();
	}

	/**
	 * Returns the company ID of this register.
	 *
	 * @return the company ID of this register
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this register.
	 *
	 * @return the create date of this register
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email_address of this register.
	 *
	 * @return the email_address of this register
	 */
	@Override
	public String getEmail_address() {
		return model.getEmail_address();
	}

	/**
	 * Returns the first_name of this register.
	 *
	 * @return the first_name of this register
	 */
	@Override
	public String getFirst_name() {
		return model.getFirst_name();
	}

	/**
	 * Returns the gender of this register.
	 *
	 * @return the gender of this register
	 */
	@Override
	public String getGender() {
		return model.getGender();
	}

	/**
	 * Returns the group ID of this register.
	 *
	 * @return the group ID of this register
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the home_phone of this register.
	 *
	 * @return the home_phone of this register
	 */
	@Override
	public Long getHome_phone() {
		return model.getHome_phone();
	}

	/**
	 * Returns the last_name of this register.
	 *
	 * @return the last_name of this register
	 */
	@Override
	public String getLast_name() {
		return model.getLast_name();
	}

	/**
	 * Returns the mobile_phone of this register.
	 *
	 * @return the mobile_phone of this register
	 */
	@Override
	public Long getMobile_phone() {
		return model.getMobile_phone();
	}

	/**
	 * Returns the modified date of this register.
	 *
	 * @return the modified date of this register
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the password2 of this register.
	 *
	 * @return the password2 of this register
	 */
	@Override
	public String getPassword2() {
		return model.getPassword2();
	}

	/**
	 * Returns the primary key of this register.
	 *
	 * @return the primary key of this register
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the register ID of this register.
	 *
	 * @return the register ID of this register
	 */
	@Override
	public long getRegisterId() {
		return model.getRegisterId();
	}

	/**
	 * Returns the security_answer of this register.
	 *
	 * @return the security_answer of this register
	 */
	@Override
	public String getSecurity_answer() {
		return model.getSecurity_answer();
	}

	/**
	 * Returns the security_question of this register.
	 *
	 * @return the security_question of this register
	 */
	@Override
	public String getSecurity_question() {
		return model.getSecurity_question();
	}

	/**
	 * Returns the state of this register.
	 *
	 * @return the state of this register
	 */
	@Override
	public String getState() {
		return model.getState();
	}

	/**
	 * Returns the status of this register.
	 *
	 * @return the status of this register
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status by user ID of this register.
	 *
	 * @return the status by user ID of this register
	 */
	@Override
	public long getStatusByUserId() {
		return model.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this register.
	 *
	 * @return the status by user name of this register
	 */
	@Override
	public String getStatusByUserName() {
		return model.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this register.
	 *
	 * @return the status by user uuid of this register
	 */
	@Override
	public String getStatusByUserUuid() {
		return model.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this register.
	 *
	 * @return the status date of this register
	 */
	@Override
	public Date getStatusDate() {
		return model.getStatusDate();
	}

	/**
	 * Returns the user_name of this register.
	 *
	 * @return the user_name of this register
	 */
	@Override
	public String getUser_name() {
		return model.getUser_name();
	}

	/**
	 * Returns the user ID of this register.
	 *
	 * @return the user ID of this register
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this register.
	 *
	 * @return the user name of this register
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this register.
	 *
	 * @return the user uuid of this register
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this register.
	 *
	 * @return the uuid of this register
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the zip of this register.
	 *
	 * @return the zip of this register
	 */
	@Override
	public String getZip() {
		return model.getZip();
	}

	/**
	 * Returns <code>true</code> if this register is accepted_tou.
	 *
	 * @return <code>true</code> if this register is accepted_tou; <code>false</code> otherwise
	 */
	@Override
	public boolean isAccepted_tou() {
		return model.isAccepted_tou();
	}

	/**
	 * Returns <code>true</code> if this register is approved.
	 *
	 * @return <code>true</code> if this register is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return model.isApproved();
	}

	/**
	 * Returns <code>true</code> if this register is denied.
	 *
	 * @return <code>true</code> if this register is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return model.isDenied();
	}

	/**
	 * Returns <code>true</code> if this register is a draft.
	 *
	 * @return <code>true</code> if this register is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return model.isDraft();
	}

	/**
	 * Returns <code>true</code> if this register is expired.
	 *
	 * @return <code>true</code> if this register is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return model.isExpired();
	}

	/**
	 * Returns <code>true</code> if this register is inactive.
	 *
	 * @return <code>true</code> if this register is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return model.isInactive();
	}

	/**
	 * Returns <code>true</code> if this register is incomplete.
	 *
	 * @return <code>true</code> if this register is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return model.isIncomplete();
	}

	/**
	 * Returns <code>true</code> if this register is pending.
	 *
	 * @return <code>true</code> if this register is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return model.isPending();
	}

	/**
	 * Returns <code>true</code> if this register is scheduled.
	 *
	 * @return <code>true</code> if this register is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled() {
		return model.isScheduled();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets whether this register is accepted_tou.
	 *
	 * @param accepted_tou the accepted_tou of this register
	 */
	@Override
	public void setAccepted_tou(boolean accepted_tou) {
		model.setAccepted_tou(accepted_tou);
	}

	/**
	 * Sets the address of this register.
	 *
	 * @param address the address of this register
	 */
	@Override
	public void setAddress(String address) {
		model.setAddress(address);
	}

	/**
	 * Sets the address2 of this register.
	 *
	 * @param address2 the address2 of this register
	 */
	@Override
	public void setAddress2(String address2) {
		model.setAddress2(address2);
	}

	/**
	 * Sets the birthday of this register.
	 *
	 * @param birthday the birthday of this register
	 */
	@Override
	public void setBirthday(Date birthday) {
		model.setBirthday(birthday);
	}

	/**
	 * Sets the city of this register.
	 *
	 * @param city the city of this register
	 */
	@Override
	public void setCity(String city) {
		model.setCity(city);
	}

	/**
	 * Sets the company ID of this register.
	 *
	 * @param companyId the company ID of this register
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this register.
	 *
	 * @param createDate the create date of this register
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email_address of this register.
	 *
	 * @param email_address the email_address of this register
	 */
	@Override
	public void setEmail_address(String email_address) {
		model.setEmail_address(email_address);
	}

	/**
	 * Sets the first_name of this register.
	 *
	 * @param first_name the first_name of this register
	 */
	@Override
	public void setFirst_name(String first_name) {
		model.setFirst_name(first_name);
	}

	/**
	 * Sets the gender of this register.
	 *
	 * @param gender the gender of this register
	 */
	@Override
	public void setGender(String gender) {
		model.setGender(gender);
	}

	/**
	 * Sets the group ID of this register.
	 *
	 * @param groupId the group ID of this register
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the home_phone of this register.
	 *
	 * @param home_phone the home_phone of this register
	 */
	@Override
	public void setHome_phone(Long home_phone) {
		model.setHome_phone(home_phone);
	}

	/**
	 * Sets the last_name of this register.
	 *
	 * @param last_name the last_name of this register
	 */
	@Override
	public void setLast_name(String last_name) {
		model.setLast_name(last_name);
	}

	/**
	 * Sets the mobile_phone of this register.
	 *
	 * @param mobile_phone the mobile_phone of this register
	 */
	@Override
	public void setMobile_phone(Long mobile_phone) {
		model.setMobile_phone(mobile_phone);
	}

	/**
	 * Sets the modified date of this register.
	 *
	 * @param modifiedDate the modified date of this register
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the password2 of this register.
	 *
	 * @param password2 the password2 of this register
	 */
	@Override
	public void setPassword2(String password2) {
		model.setPassword2(password2);
	}

	/**
	 * Sets the primary key of this register.
	 *
	 * @param primaryKey the primary key of this register
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the register ID of this register.
	 *
	 * @param registerId the register ID of this register
	 */
	@Override
	public void setRegisterId(long registerId) {
		model.setRegisterId(registerId);
	}

	/**
	 * Sets the security_answer of this register.
	 *
	 * @param security_answer the security_answer of this register
	 */
	@Override
	public void setSecurity_answer(String security_answer) {
		model.setSecurity_answer(security_answer);
	}

	/**
	 * Sets the security_question of this register.
	 *
	 * @param security_question the security_question of this register
	 */
	@Override
	public void setSecurity_question(String security_question) {
		model.setSecurity_question(security_question);
	}

	/**
	 * Sets the state of this register.
	 *
	 * @param state the state of this register
	 */
	@Override
	public void setState(String state) {
		model.setState(state);
	}

	/**
	 * Sets the status of this register.
	 *
	 * @param status the status of this register
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this register.
	 *
	 * @param statusByUserId the status by user ID of this register
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		model.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this register.
	 *
	 * @param statusByUserName the status by user name of this register
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		model.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this register.
	 *
	 * @param statusByUserUuid the status by user uuid of this register
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		model.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this register.
	 *
	 * @param statusDate the status date of this register
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		model.setStatusDate(statusDate);
	}

	/**
	 * Sets the user_name of this register.
	 *
	 * @param user_name the user_name of this register
	 */
	@Override
	public void setUser_name(String user_name) {
		model.setUser_name(user_name);
	}

	/**
	 * Sets the user ID of this register.
	 *
	 * @param userId the user ID of this register
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this register.
	 *
	 * @param userName the user name of this register
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this register.
	 *
	 * @param userUuid the user uuid of this register
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this register.
	 *
	 * @param uuid the uuid of this register
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the zip of this register.
	 *
	 * @param zip the zip of this register
	 */
	@Override
	public void setZip(String zip) {
		model.setZip(zip);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected RegisterWrapper wrap(Register register) {
		return new RegisterWrapper(register);
	}

}