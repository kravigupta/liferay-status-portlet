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

package me.rkg.plugins.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LiferayStatusService}.
 *
 * @author ravi.gupta
 * @see LiferayStatusService
 * @generated
 */
public class LiferayStatusServiceWrapper implements LiferayStatusService,
	ServiceWrapper<LiferayStatusService> {
	public LiferayStatusServiceWrapper(
		LiferayStatusService liferayStatusService) {
		_liferayStatusService = liferayStatusService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _liferayStatusService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_liferayStatusService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _liferayStatusService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject getStatusAsJSON() {
		return _liferayStatusService.getStatusAsJSON();
	}

	@Override
	public java.lang.String getStatus() {
		return _liferayStatusService.getStatus();
	}

	@Override
	public double getStatusAsPercentage() {
		return _liferayStatusService.getStatusAsPercentage();
	}

	@Override
	public long getTotalMemory() {
		return _liferayStatusService.getTotalMemory();
	}

	@Override
	public long getUsedMemory() {
		return _liferayStatusService.getUsedMemory();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LiferayStatusService getWrappedLiferayStatusService() {
		return _liferayStatusService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLiferayStatusService(
		LiferayStatusService liferayStatusService) {
		_liferayStatusService = liferayStatusService;
	}

	@Override
	public LiferayStatusService getWrappedService() {
		return _liferayStatusService;
	}

	@Override
	public void setWrappedService(LiferayStatusService liferayStatusService) {
		_liferayStatusService = liferayStatusService;
	}

	private LiferayStatusService _liferayStatusService;
}