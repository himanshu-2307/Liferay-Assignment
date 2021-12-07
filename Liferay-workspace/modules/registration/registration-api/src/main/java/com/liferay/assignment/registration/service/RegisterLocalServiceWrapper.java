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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RegisterLocalService}.
 *
 * @author tarun
 * @see RegisterLocalService
 * @generated
 */
public class RegisterLocalServiceWrapper
	implements RegisterLocalService, ServiceWrapper<RegisterLocalService> {

	public RegisterLocalServiceWrapper(
		RegisterLocalService registerLocalService) {

		_registerLocalService = registerLocalService;
	}

	@Override
	public com.liferay.assignment.registration.model.Register addRegister(
			long groupId, String first_name, String last_name,
			String email_address, String user_name, String birthday,
			String gender, String password2, long home_phone, Long mobile_phone,
			String address, String address2, String city, String state,
			String zip, String security_question, String security_answer,
			boolean accepted_tou,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _registerLocalService.addRegister(
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
	@Override
	public com.liferay.assignment.registration.model.Register addRegister(
		com.liferay.assignment.registration.model.Register register) {

		return _registerLocalService.addRegister(register);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _registerLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new register with the primary key. Does not add the register to the database.
	 *
	 * @param registerId the primary key for the new register
	 * @return the new register
	 */
	@Override
	public com.liferay.assignment.registration.model.Register createRegister(
		long registerId) {

		return _registerLocalService.createRegister(registerId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _registerLocalService.deletePersistedModel(persistedModel);
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
	@Override
	public com.liferay.assignment.registration.model.Register deleteRegister(
			long registerId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _registerLocalService.deleteRegister(registerId);
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
	@Override
	public com.liferay.assignment.registration.model.Register deleteRegister(
		com.liferay.assignment.registration.model.Register register) {

		return _registerLocalService.deleteRegister(register);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _registerLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _registerLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _registerLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _registerLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _registerLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _registerLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.assignment.registration.model.Register fetchRegister(
		long registerId) {

		return _registerLocalService.fetchRegister(registerId);
	}

	/**
	 * Returns the register matching the UUID and group.
	 *
	 * @param uuid the register's UUID
	 * @param groupId the primary key of the group
	 * @return the matching register, or <code>null</code> if a matching register could not be found
	 */
	@Override
	public com.liferay.assignment.registration.model.Register
		fetchRegisterByUuidAndGroupId(String uuid, long groupId) {

		return _registerLocalService.fetchRegisterByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _registerLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _registerLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _registerLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _registerLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _registerLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the register with the primary key.
	 *
	 * @param registerId the primary key of the register
	 * @return the register
	 * @throws PortalException if a register with the primary key could not be found
	 */
	@Override
	public com.liferay.assignment.registration.model.Register getRegister(
			long registerId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _registerLocalService.getRegister(registerId);
	}

	/**
	 * Returns the register matching the UUID and group.
	 *
	 * @param uuid the register's UUID
	 * @param groupId the primary key of the group
	 * @return the matching register
	 * @throws PortalException if a matching register could not be found
	 */
	@Override
	public com.liferay.assignment.registration.model.Register
			getRegisterByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _registerLocalService.getRegisterByUuidAndGroupId(uuid, groupId);
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
	@Override
	public java.util.List<com.liferay.assignment.registration.model.Register>
		getRegisters(int start, int end) {

		return _registerLocalService.getRegisters(start, end);
	}

	/**
	 * Returns all the registers matching the UUID and company.
	 *
	 * @param uuid the UUID of the registers
	 * @param companyId the primary key of the company
	 * @return the matching registers, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.assignment.registration.model.Register>
		getRegistersByUuidAndCompanyId(String uuid, long companyId) {

		return _registerLocalService.getRegistersByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List<com.liferay.assignment.registration.model.Register>
		getRegistersByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.assignment.registration.model.Register>
					orderByComparator) {

		return _registerLocalService.getRegistersByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of registers.
	 *
	 * @return the number of registers
	 */
	@Override
	public int getRegistersCount() {
		return _registerLocalService.getRegistersCount();
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
	@Override
	public com.liferay.assignment.registration.model.Register updateRegister(
		com.liferay.assignment.registration.model.Register register) {

		return _registerLocalService.updateRegister(register);
	}

	@Override
	public RegisterLocalService getWrappedService() {
		return _registerLocalService;
	}

	@Override
	public void setWrappedService(RegisterLocalService registerLocalService) {
		_registerLocalService = registerLocalService;
	}

	private RegisterLocalService _registerLocalService;

}