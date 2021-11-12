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
 * The base model interface for the Department service. Represents a row in the &quot;offices_Department&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.assignment.office.model.impl.DepartmentModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.assignment.office.model.impl.DepartmentImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Department
 * @generated
 */
@ProviderType
public interface DepartmentModel
	extends BaseModel<Department>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a department model instance should use the {@link Department} interface instead.
	 */

	/**
	 * Returns the primary key of this department.
	 *
	 * @return the primary key of this department
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this department.
	 *
	 * @param primaryKey the primary key of this department
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this department.
	 *
	 * @return the uuid of this department
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this department.
	 *
	 * @param uuid the uuid of this department
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the department ID of this department.
	 *
	 * @return the department ID of this department
	 */
	public long getDepartmentId();

	/**
	 * Sets the department ID of this department.
	 *
	 * @param departmentId the department ID of this department
	 */
	public void setDepartmentId(long departmentId);

	/**
	 * Returns the group ID of this department.
	 *
	 * @return the group ID of this department
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this department.
	 *
	 * @param groupId the group ID of this department
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this department.
	 *
	 * @return the company ID of this department
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this department.
	 *
	 * @param companyId the company ID of this department
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this department.
	 *
	 * @return the user ID of this department
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this department.
	 *
	 * @param userId the user ID of this department
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this department.
	 *
	 * @return the user uuid of this department
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this department.
	 *
	 * @param userUuid the user uuid of this department
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this department.
	 *
	 * @return the user name of this department
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this department.
	 *
	 * @param userName the user name of this department
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this department.
	 *
	 * @return the create date of this department
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this department.
	 *
	 * @param createDate the create date of this department
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this department.
	 *
	 * @return the modified date of this department
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this department.
	 *
	 * @param modifiedDate the modified date of this department
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the dept name of this department.
	 *
	 * @return the dept name of this department
	 */
	@AutoEscape
	public String getDeptName();

	/**
	 * Sets the dept name of this department.
	 *
	 * @param deptName the dept name of this department
	 */
	public void setDeptName(String deptName);

}