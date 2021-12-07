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
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Register. This utility wraps
 * <code>com.liferay.assignment.registration.service.impl.RegisterLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author tarun
 * @see RegisterLocalService
 * @generated
 */
public class RegisterLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.assignment.registration.service.impl.RegisterLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
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
	 * Adds the register to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RegisterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param register the register
	 * @return the register that was added
	 */
	public static Register addRegister(Register register) {
		return getService().addRegister(register);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new register with the primary key. Does not add the register to the database.
	 *
	 * @param registerId the primary key for the new register
	 * @return the new register
	 */
	public static Register createRegister(long registerId) {
		return getService().createRegister(registerId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the register with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RegisterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param registerId the primary key of the register
	 * @return the register that was removed
	 * @throws PortalException if a register with the primary key could not be found
	 */
	public static Register deleteRegister(long registerId)
		throws PortalException {

		return getService().deleteRegister(registerId);
	}

	/**
	 * Deletes the register from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RegisterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param register the register
	 * @return the register that was removed
	 */
	public static Register deleteRegister(Register register) {
		return getService().deleteRegister(register);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.assignment.registration.model.impl.RegisterModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.assignment.registration.model.impl.RegisterModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static Register fetchRegister(long registerId) {
		return getService().fetchRegister(registerId);
	}

	/**
	 * Returns the register matching the UUID and group.
	 *
	 * @param uuid the register's UUID
	 * @param groupId the primary key of the group
	 * @return the matching register, or <code>null</code> if a matching register could not be found
	 */
	public static Register fetchRegisterByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchRegisterByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the register with the primary key.
	 *
	 * @param registerId the primary key of the register
	 * @return the register
	 * @throws PortalException if a register with the primary key could not be found
	 */
	public static Register getRegister(long registerId) throws PortalException {
		return getService().getRegister(registerId);
	}

	/**
	 * Returns the register matching the UUID and group.
	 *
	 * @param uuid the register's UUID
	 * @param groupId the primary key of the group
	 * @return the matching register
	 * @throws PortalException if a matching register could not be found
	 */
	public static Register getRegisterByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getRegisterByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the registers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.assignment.registration.model.impl.RegisterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of registers
	 * @param end the upper bound of the range of registers (not inclusive)
	 * @return the range of registers
	 */
	public static List<Register> getRegisters(int start, int end) {
		return getService().getRegisters(start, end);
	}

	/**
	 * Returns all the registers matching the UUID and company.
	 *
	 * @param uuid the UUID of the registers
	 * @param companyId the primary key of the company
	 * @return the matching registers, or an empty list if no matches were found
	 */
	public static List<Register> getRegistersByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getRegistersByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of registers matching the UUID and company.
	 *
	 * @param uuid the UUID of the registers
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of registers
	 * @param end the upper bound of the range of registers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching registers, or an empty list if no matches were found
	 */
	public static List<Register> getRegistersByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Register> orderByComparator) {

		return getService().getRegistersByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of registers.
	 *
	 * @return the number of registers
	 */
	public static int getRegistersCount() {
		return getService().getRegistersCount();
	}

	/**
	 * Updates the register in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RegisterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param register the register
	 * @return the register that was updated
	 */
	public static Register updateRegister(Register register) {
		return getService().updateRegister(register);
	}

	public static RegisterLocalService getService() {
		return _service;
	}

	private static volatile RegisterLocalService _service;

}