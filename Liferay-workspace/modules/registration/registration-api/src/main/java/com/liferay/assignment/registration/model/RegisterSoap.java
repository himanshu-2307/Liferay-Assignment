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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.assignment.registration.service.http.RegisterServiceSoap}.
 *
 * @author tarun
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class RegisterSoap implements Serializable {

	public static RegisterSoap toSoapModel(Register model) {
		RegisterSoap soapModel = new RegisterSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setRegisterId(model.getRegisterId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setFirst_name(model.getFirst_name());
		soapModel.setLast_name(model.getLast_name());
		soapModel.setEmail_address(model.getEmail_address());
		soapModel.setUser_name(model.getUser_name());
		soapModel.setBirthday(model.getBirthday());
		soapModel.setGender(model.getGender());
		soapModel.setPassword2(model.getPassword2());
		soapModel.setHome_phone(model.getHome_phone());
		soapModel.setMobile_phone(model.getMobile_phone());
		soapModel.setAddress(model.getAddress());
		soapModel.setAddress2(model.getAddress2());
		soapModel.setCity(model.getCity());
		soapModel.setState(model.getState());
		soapModel.setZip(model.getZip());
		soapModel.setSecurity_question(model.getSecurity_question());
		soapModel.setSecurity_answer(model.getSecurity_answer());
		soapModel.setAccepted_tou(model.isAccepted_tou());
		soapModel.setStatus(model.getStatus());
		soapModel.setStatusByUserId(model.getStatusByUserId());
		soapModel.setStatusByUserName(model.getStatusByUserName());
		soapModel.setStatusDate(model.getStatusDate());

		return soapModel;
	}

	public static RegisterSoap[] toSoapModels(Register[] models) {
		RegisterSoap[] soapModels = new RegisterSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RegisterSoap[][] toSoapModels(Register[][] models) {
		RegisterSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RegisterSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RegisterSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RegisterSoap[] toSoapModels(List<Register> models) {
		List<RegisterSoap> soapModels = new ArrayList<RegisterSoap>(
			models.size());

		for (Register model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RegisterSoap[soapModels.size()]);
	}

	public RegisterSoap() {
	}

	public long getPrimaryKey() {
		return _registerId;
	}

	public void setPrimaryKey(long pk) {
		setRegisterId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getRegisterId() {
		return _registerId;
	}

	public void setRegisterId(long registerId) {
		_registerId = registerId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getFirst_name() {
		return _first_name;
	}

	public void setFirst_name(String first_name) {
		_first_name = first_name;
	}

	public String getLast_name() {
		return _last_name;
	}

	public void setLast_name(String last_name) {
		_last_name = last_name;
	}

	public String getEmail_address() {
		return _email_address;
	}

	public void setEmail_address(String email_address) {
		_email_address = email_address;
	}

	public String getUser_name() {
		return _user_name;
	}

	public void setUser_name(String user_name) {
		_user_name = user_name;
	}

	public Date getBirthday() {
		return _birthday;
	}

	public void setBirthday(Date birthday) {
		_birthday = birthday;
	}

	public String getGender() {
		return _gender;
	}

	public void setGender(String gender) {
		_gender = gender;
	}

	public String getPassword2() {
		return _password2;
	}

	public void setPassword2(String password2) {
		_password2 = password2;
	}

	public Long getHome_phone() {
		return _home_phone;
	}

	public void setHome_phone(Long home_phone) {
		_home_phone = home_phone;
	}

	public Long getMobile_phone() {
		return _mobile_phone;
	}

	public void setMobile_phone(Long mobile_phone) {
		_mobile_phone = mobile_phone;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getAddress2() {
		return _address2;
	}

	public void setAddress2(String address2) {
		_address2 = address2;
	}

	public String getCity() {
		return _city;
	}

	public void setCity(String city) {
		_city = city;
	}

	public String getState() {
		return _state;
	}

	public void setState(String state) {
		_state = state;
	}

	public String getZip() {
		return _zip;
	}

	public void setZip(String zip) {
		_zip = zip;
	}

	public String getSecurity_question() {
		return _security_question;
	}

	public void setSecurity_question(String security_question) {
		_security_question = security_question;
	}

	public String getSecurity_answer() {
		return _security_answer;
	}

	public void setSecurity_answer(String security_answer) {
		_security_answer = security_answer;
	}

	public boolean getAccepted_tou() {
		return _accepted_tou;
	}

	public boolean isAccepted_tou() {
		return _accepted_tou;
	}

	public void setAccepted_tou(boolean accepted_tou) {
		_accepted_tou = accepted_tou;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public long getStatusByUserId() {
		return _statusByUserId;
	}

	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	public String getStatusByUserName() {
		return _statusByUserName;
	}

	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;
	}

	public Date getStatusDate() {
		return _statusDate;
	}

	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	private String _uuid;
	private long _registerId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _first_name;
	private String _last_name;
	private String _email_address;
	private String _user_name;
	private Date _birthday;
	private String _gender;
	private String _password2;
	private Long _home_phone;
	private Long _mobile_phone;
	private String _address;
	private String _address2;
	private String _city;
	private String _state;
	private String _zip;
	private String _security_question;
	private String _security_answer;
	private boolean _accepted_tou;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserName;
	private Date _statusDate;

}