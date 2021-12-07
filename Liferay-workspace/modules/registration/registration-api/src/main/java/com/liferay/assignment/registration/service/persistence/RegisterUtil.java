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

package com.liferay.assignment.registration.service.persistence;

import com.liferay.assignment.registration.model.Register;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the register service. This utility wraps <code>com.liferay.assignment.registration.service.persistence.impl.RegisterPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tarun
 * @see RegisterPersistence
 * @generated
 */
public class RegisterUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Register register) {
		getPersistence().clearCache(register);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Register> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Register> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Register> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Register> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Register> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Register update(Register register) {
		return getPersistence().update(register);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Register update(
		Register register, ServiceContext serviceContext) {

		return getPersistence().update(register, serviceContext);
	}

	/**
	 * Returns all the registers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching registers
	 */
	public static List<Register> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the registers where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegisterModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of registers
	 * @param end the upper bound of the range of registers (not inclusive)
	 * @return the range of matching registers
	 */
	public static List<Register> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the registers where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegisterModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of registers
	 * @param end the upper bound of the range of registers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching registers
	 */
	public static List<Register> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Register> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the registers where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegisterModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of registers
	 * @param end the upper bound of the range of registers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching registers
	 */
	public static List<Register> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Register> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first register in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching register
	 * @throws NoSuchRegisterException if a matching register could not be found
	 */
	public static Register findByUuid_First(
			String uuid, OrderByComparator<Register> orderByComparator)
		throws com.liferay.assignment.registration.exception.
			NoSuchRegisterException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first register in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching register, or <code>null</code> if a matching register could not be found
	 */
	public static Register fetchByUuid_First(
		String uuid, OrderByComparator<Register> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last register in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching register
	 * @throws NoSuchRegisterException if a matching register could not be found
	 */
	public static Register findByUuid_Last(
			String uuid, OrderByComparator<Register> orderByComparator)
		throws com.liferay.assignment.registration.exception.
			NoSuchRegisterException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last register in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching register, or <code>null</code> if a matching register could not be found
	 */
	public static Register fetchByUuid_Last(
		String uuid, OrderByComparator<Register> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the registers before and after the current register in the ordered set where uuid = &#63;.
	 *
	 * @param registerId the primary key of the current register
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next register
	 * @throws NoSuchRegisterException if a register with the primary key could not be found
	 */
	public static Register[] findByUuid_PrevAndNext(
			long registerId, String uuid,
			OrderByComparator<Register> orderByComparator)
		throws com.liferay.assignment.registration.exception.
			NoSuchRegisterException {

		return getPersistence().findByUuid_PrevAndNext(
			registerId, uuid, orderByComparator);
	}

	/**
	 * Removes all the registers where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of registers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching registers
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the register where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchRegisterException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching register
	 * @throws NoSuchRegisterException if a matching register could not be found
	 */
	public static Register findByUUID_G(String uuid, long groupId)
		throws com.liferay.assignment.registration.exception.
			NoSuchRegisterException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the register where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching register, or <code>null</code> if a matching register could not be found
	 */
	public static Register fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the register where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching register, or <code>null</code> if a matching register could not be found
	 */
	public static Register fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the register where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the register that was removed
	 */
	public static Register removeByUUID_G(String uuid, long groupId)
		throws com.liferay.assignment.registration.exception.
			NoSuchRegisterException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of registers where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching registers
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the registers where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching registers
	 */
	public static List<Register> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the registers where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegisterModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of registers
	 * @param end the upper bound of the range of registers (not inclusive)
	 * @return the range of matching registers
	 */
	public static List<Register> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the registers where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegisterModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of registers
	 * @param end the upper bound of the range of registers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching registers
	 */
	public static List<Register> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Register> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the registers where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegisterModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of registers
	 * @param end the upper bound of the range of registers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching registers
	 */
	public static List<Register> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Register> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first register in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching register
	 * @throws NoSuchRegisterException if a matching register could not be found
	 */
	public static Register findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Register> orderByComparator)
		throws com.liferay.assignment.registration.exception.
			NoSuchRegisterException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first register in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching register, or <code>null</code> if a matching register could not be found
	 */
	public static Register fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Register> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last register in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching register
	 * @throws NoSuchRegisterException if a matching register could not be found
	 */
	public static Register findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Register> orderByComparator)
		throws com.liferay.assignment.registration.exception.
			NoSuchRegisterException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last register in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching register, or <code>null</code> if a matching register could not be found
	 */
	public static Register fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Register> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the registers before and after the current register in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param registerId the primary key of the current register
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next register
	 * @throws NoSuchRegisterException if a register with the primary key could not be found
	 */
	public static Register[] findByUuid_C_PrevAndNext(
			long registerId, String uuid, long companyId,
			OrderByComparator<Register> orderByComparator)
		throws com.liferay.assignment.registration.exception.
			NoSuchRegisterException {

		return getPersistence().findByUuid_C_PrevAndNext(
			registerId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the registers where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of registers where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching registers
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the registers where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching registers
	 */
	public static List<Register> findByG(long groupId) {
		return getPersistence().findByG(groupId);
	}

	/**
	 * Returns a range of all the registers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegisterModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of registers
	 * @param end the upper bound of the range of registers (not inclusive)
	 * @return the range of matching registers
	 */
	public static List<Register> findByG(long groupId, int start, int end) {
		return getPersistence().findByG(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the registers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegisterModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of registers
	 * @param end the upper bound of the range of registers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching registers
	 */
	public static List<Register> findByG(
		long groupId, int start, int end,
		OrderByComparator<Register> orderByComparator) {

		return getPersistence().findByG(groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the registers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegisterModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of registers
	 * @param end the upper bound of the range of registers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching registers
	 */
	public static List<Register> findByG(
		long groupId, int start, int end,
		OrderByComparator<Register> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByG(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first register in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching register
	 * @throws NoSuchRegisterException if a matching register could not be found
	 */
	public static Register findByG_First(
			long groupId, OrderByComparator<Register> orderByComparator)
		throws com.liferay.assignment.registration.exception.
			NoSuchRegisterException {

		return getPersistence().findByG_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first register in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching register, or <code>null</code> if a matching register could not be found
	 */
	public static Register fetchByG_First(
		long groupId, OrderByComparator<Register> orderByComparator) {

		return getPersistence().fetchByG_First(groupId, orderByComparator);
	}

	/**
	 * Returns the last register in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching register
	 * @throws NoSuchRegisterException if a matching register could not be found
	 */
	public static Register findByG_Last(
			long groupId, OrderByComparator<Register> orderByComparator)
		throws com.liferay.assignment.registration.exception.
			NoSuchRegisterException {

		return getPersistence().findByG_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last register in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching register, or <code>null</code> if a matching register could not be found
	 */
	public static Register fetchByG_Last(
		long groupId, OrderByComparator<Register> orderByComparator) {

		return getPersistence().fetchByG_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the registers before and after the current register in the ordered set where groupId = &#63;.
	 *
	 * @param registerId the primary key of the current register
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next register
	 * @throws NoSuchRegisterException if a register with the primary key could not be found
	 */
	public static Register[] findByG_PrevAndNext(
			long registerId, long groupId,
			OrderByComparator<Register> orderByComparator)
		throws com.liferay.assignment.registration.exception.
			NoSuchRegisterException {

		return getPersistence().findByG_PrevAndNext(
			registerId, groupId, orderByComparator);
	}

	/**
	 * Removes all the registers where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByG(long groupId) {
		getPersistence().removeByG(groupId);
	}

	/**
	 * Returns the number of registers where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching registers
	 */
	public static int countByG(long groupId) {
		return getPersistence().countByG(groupId);
	}

	/**
	 * Caches the register in the entity cache if it is enabled.
	 *
	 * @param register the register
	 */
	public static void cacheResult(Register register) {
		getPersistence().cacheResult(register);
	}

	/**
	 * Caches the registers in the entity cache if it is enabled.
	 *
	 * @param registers the registers
	 */
	public static void cacheResult(List<Register> registers) {
		getPersistence().cacheResult(registers);
	}

	/**
	 * Creates a new register with the primary key. Does not add the register to the database.
	 *
	 * @param registerId the primary key for the new register
	 * @return the new register
	 */
	public static Register create(long registerId) {
		return getPersistence().create(registerId);
	}

	/**
	 * Removes the register with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param registerId the primary key of the register
	 * @return the register that was removed
	 * @throws NoSuchRegisterException if a register with the primary key could not be found
	 */
	public static Register remove(long registerId)
		throws com.liferay.assignment.registration.exception.
			NoSuchRegisterException {

		return getPersistence().remove(registerId);
	}

	public static Register updateImpl(Register register) {
		return getPersistence().updateImpl(register);
	}

	/**
	 * Returns the register with the primary key or throws a <code>NoSuchRegisterException</code> if it could not be found.
	 *
	 * @param registerId the primary key of the register
	 * @return the register
	 * @throws NoSuchRegisterException if a register with the primary key could not be found
	 */
	public static Register findByPrimaryKey(long registerId)
		throws com.liferay.assignment.registration.exception.
			NoSuchRegisterException {

		return getPersistence().findByPrimaryKey(registerId);
	}

	/**
	 * Returns the register with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param registerId the primary key of the register
	 * @return the register, or <code>null</code> if a register with the primary key could not be found
	 */
	public static Register fetchByPrimaryKey(long registerId) {
		return getPersistence().fetchByPrimaryKey(registerId);
	}

	/**
	 * Returns all the registers.
	 *
	 * @return the registers
	 */
	public static List<Register> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the registers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegisterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of registers
	 * @param end the upper bound of the range of registers (not inclusive)
	 * @return the range of registers
	 */
	public static List<Register> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the registers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegisterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of registers
	 * @param end the upper bound of the range of registers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of registers
	 */
	public static List<Register> findAll(
		int start, int end, OrderByComparator<Register> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the registers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RegisterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of registers
	 * @param end the upper bound of the range of registers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of registers
	 */
	public static List<Register> findAll(
		int start, int end, OrderByComparator<Register> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the registers from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of registers.
	 *
	 * @return the number of registers
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static RegisterPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<RegisterPersistence, RegisterPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(RegisterPersistence.class);

		ServiceTracker<RegisterPersistence, RegisterPersistence>
			serviceTracker =
				new ServiceTracker<RegisterPersistence, RegisterPersistence>(
					bundle.getBundleContext(), RegisterPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}