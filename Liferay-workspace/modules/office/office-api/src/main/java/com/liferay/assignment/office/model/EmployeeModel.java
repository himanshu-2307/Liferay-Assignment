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

package com.liferay.assignment.office.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Employee service. Represents a row in the &quot;offices_Employee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.assignment.office.model.impl.EmployeeModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.assignment.office.model.impl.EmployeeImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Employee
 * @generated
 */
@ProviderType
public interface EmployeeModel
	extends BaseModel<Employee>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a employee model instance should use the {@link Employee} interface instead.
	 */

	/**
	 * Returns the primary key of this employee.
	 *
	 * @return the primary key of this employee
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this employee.
	 *
	 * @param primaryKey the primary key of this employee
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this employee.
	 *
	 * @return the uuid of this employee
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this employee.
	 *
	 * @param uuid the uuid of this employee
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the employee ID of this employee.
	 *
	 * @return the employee ID of this employee
	 */
	public long getEmployeeId();

	/**
	 * Sets the employee ID of this employee.
	 *
	 * @param employeeId the employee ID of this employee
	 */
	public void setEmployeeId(long employeeId);

	/**
	 * Returns the group ID of this employee.
	 *
	 * @return the group ID of this employee
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this employee.
	 *
	 * @param groupId the group ID of this employee
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this employee.
	 *
	 * @return the company ID of this employee
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this employee.
	 *
	 * @param companyId the company ID of this employee
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this employee.
	 *
	 * @return the user ID of this employee
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this employee.
	 *
	 * @param userId the user ID of this employee
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this employee.
	 *
	 * @return the user uuid of this employee
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this employee.
	 *
	 * @param userUuid the user uuid of this employee
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this employee.
	 *
	 * @return the user name of this employee
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this employee.
	 *
	 * @param userName the user name of this employee
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this employee.
	 *
	 * @return the create date of this employee
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this employee.
	 *
	 * @param createDate the create date of this employee
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this employee.
	 *
	 * @return the modified date of this employee
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this employee.
	 *
	 * @param modifiedDate the modified date of this employee
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this employee.
	 *
	 * @return the name of this employee
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this employee.
	 *
	 * @param name the name of this employee
	 */
	public void setName(String name);

	/**
	 * Returns the job title of this employee.
	 *
	 * @return the job title of this employee
	 */
	@AutoEscape
	public String getJobTitle();

	/**
	 * Sets the job title of this employee.
	 *
	 * @param jobTitle the job title of this employee
	 */
	public void setJobTitle(String jobTitle);

	/**
	 * Returns the phone no of this employee.
	 *
	 * @return the phone no of this employee
	 */
	public long getPhoneNo();

	/**
	 * Sets the phone no of this employee.
	 *
	 * @param phoneNo the phone no of this employee
	 */
	public void setPhoneNo(long phoneNo);

	/**
	 * Returns the salary of this employee.
	 *
	 * @return the salary of this employee
	 */
	public long getSalary();

	/**
	 * Sets the salary of this employee.
	 *
	 * @param salary the salary of this employee
	 */
	public void setSalary(long salary);

	/**
	 * Returns the project ID of this employee.
	 *
	 * @return the project ID of this employee
	 */
	public long getProjectId();

	/**
	 * Sets the project ID of this employee.
	 *
	 * @param projectId the project ID of this employee
	 */
	public void setProjectId(long projectId);

	/**
	 * Returns the department ID of this employee.
	 *
	 * @return the department ID of this employee
	 */
	public long getDepartmentId();

	/**
	 * Sets the department ID of this employee.
	 *
	 * @param departmentId the department ID of this employee
	 */
	public void setDepartmentId(long departmentId);

}