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

package com.liferay.assignment.registration.model.impl;

import com.liferay.assignment.registration.model.Register;
import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Register in entity cache.
 *
 * @author tarun
 * @generated
 */
public class RegisterCacheModel
	implements CacheModel<Register>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RegisterCacheModel)) {
			return false;
		}

		RegisterCacheModel registerCacheModel = (RegisterCacheModel)object;

		if (registerId == registerCacheModel.registerId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, registerId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(59);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", registerId=");
		sb.append(registerId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", first_name=");
		sb.append(first_name);
		sb.append(", last_name=");
		sb.append(last_name);
		sb.append(", email_address=");
		sb.append(email_address);
		sb.append(", user_name=");
		sb.append(user_name);
		sb.append(", birthday=");
		sb.append(birthday);
		sb.append(", gender=");
		sb.append(gender);
		sb.append(", password2=");
		sb.append(password2);
		sb.append(", home_phone=");
		sb.append(home_phone);
		sb.append(", mobile_phone=");
		sb.append(mobile_phone);
		sb.append(", address=");
		sb.append(address);
		sb.append(", address2=");
		sb.append(address2);
		sb.append(", city=");
		sb.append(city);
		sb.append(", state=");
		sb.append(state);
		sb.append(", zip=");
		sb.append(zip);
		sb.append(", security_question=");
		sb.append(security_question);
		sb.append(", security_answer=");
		sb.append(security_answer);
		sb.append(", accepted_tou=");
		sb.append(accepted_tou);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Register toEntityModel() {
		RegisterImpl registerImpl = new RegisterImpl();

		if (uuid == null) {
			registerImpl.setUuid("");
		}
		else {
			registerImpl.setUuid(uuid);
		}

		registerImpl.setRegisterId(registerId);
		registerImpl.setGroupId(groupId);
		registerImpl.setCompanyId(companyId);
		registerImpl.setUserId(userId);

		if (userName == null) {
			registerImpl.setUserName("");
		}
		else {
			registerImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			registerImpl.setCreateDate(null);
		}
		else {
			registerImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			registerImpl.setModifiedDate(null);
		}
		else {
			registerImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (first_name == null) {
			registerImpl.setFirst_name("");
		}
		else {
			registerImpl.setFirst_name(first_name);
		}

		if (last_name == null) {
			registerImpl.setLast_name("");
		}
		else {
			registerImpl.setLast_name(last_name);
		}

		if (email_address == null) {
			registerImpl.setEmail_address("");
		}
		else {
			registerImpl.setEmail_address(email_address);
		}

		if (user_name == null) {
			registerImpl.setUser_name("");
		}
		else {
			registerImpl.setUser_name(user_name);
		}

		if (birthday == Long.MIN_VALUE) {
			registerImpl.setBirthday(null);
		}
		else {
			registerImpl.setBirthday(new Date(birthday));
		}

		if (gender == null) {
			registerImpl.setGender("");
		}
		else {
			registerImpl.setGender(gender);
		}

		if (password2 == null) {
			registerImpl.setPassword2("");
		}
		else {
			registerImpl.setPassword2(password2);
		}

		registerImpl.setHome_phone(home_phone);
		registerImpl.setMobile_phone(mobile_phone);

		if (address == null) {
			registerImpl.setAddress("");
		}
		else {
			registerImpl.setAddress(address);
		}

		if (address2 == null) {
			registerImpl.setAddress2("");
		}
		else {
			registerImpl.setAddress2(address2);
		}

		if (city == null) {
			registerImpl.setCity("");
		}
		else {
			registerImpl.setCity(city);
		}

		if (state == null) {
			registerImpl.setState("");
		}
		else {
			registerImpl.setState(state);
		}

		if (zip == null) {
			registerImpl.setZip("");
		}
		else {
			registerImpl.setZip(zip);
		}

		if (security_question == null) {
			registerImpl.setSecurity_question("");
		}
		else {
			registerImpl.setSecurity_question(security_question);
		}

		if (security_answer == null) {
			registerImpl.setSecurity_answer("");
		}
		else {
			registerImpl.setSecurity_answer(security_answer);
		}

		registerImpl.setAccepted_tou(accepted_tou);
		registerImpl.setStatus(status);
		registerImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			registerImpl.setStatusByUserName("");
		}
		else {
			registerImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			registerImpl.setStatusDate(null);
		}
		else {
			registerImpl.setStatusDate(new Date(statusDate));
		}

		registerImpl.resetOriginalValues();

		return registerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		registerId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		first_name = objectInput.readUTF();
		last_name = objectInput.readUTF();
		email_address = objectInput.readUTF();
		user_name = objectInput.readUTF();
		birthday = objectInput.readLong();
		gender = objectInput.readUTF();
		password2 = objectInput.readUTF();

		home_phone = objectInput.readLong();

		mobile_phone = objectInput.readLong();
		address = objectInput.readUTF();
		address2 = objectInput.readUTF();
		city = objectInput.readUTF();
		state = objectInput.readUTF();
		zip = objectInput.readUTF();
		security_question = objectInput.readUTF();
		security_answer = objectInput.readUTF();

		accepted_tou = objectInput.readBoolean();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(registerId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (first_name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(first_name);
		}

		if (last_name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(last_name);
		}

		if (email_address == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email_address);
		}

		if (user_name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(user_name);
		}

		objectOutput.writeLong(birthday);

		if (gender == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(gender);
		}

		if (password2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(password2);
		}

		objectOutput.writeLong(home_phone);

		objectOutput.writeLong(mobile_phone);

		if (address == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (address2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address2);
		}

		if (city == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(city);
		}

		if (state == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(state);
		}

		if (zip == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(zip);
		}

		if (security_question == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(security_question);
		}

		if (security_answer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(security_answer);
		}

		objectOutput.writeBoolean(accepted_tou);

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);
	}

	public String uuid;
	public long registerId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String first_name;
	public String last_name;
	public String email_address;
	public String user_name;
	public long birthday;
	public String gender;
	public String password2;
	public long home_phone;
	public long mobile_phone;
	public String address;
	public String address2;
	public String city;
	public String state;
	public String zip;
	public String security_question;
	public String security_answer;
	public boolean accepted_tou;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;

}