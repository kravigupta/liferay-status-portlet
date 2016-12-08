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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for LiferayStatus. This utility wraps
 * {@link me.rkg.plugins.service.impl.LiferayStatusServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author ravi.gupta
 * @see LiferayStatusService
 * @see me.rkg.plugins.service.base.LiferayStatusServiceBaseImpl
 * @see me.rkg.plugins.service.impl.LiferayStatusServiceImpl
 * @generated
 */
public class LiferayStatusServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link me.rkg.plugins.service.impl.LiferayStatusServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static com.liferay.portal.kernel.json.JSONObject getStatusAsJSON() {
		return getService().getStatusAsJSON();
	}

	public static java.lang.String getStatus() {
		return getService().getStatus();
	}

	public static double getStatusAsPercentage() {
		return getService().getStatusAsPercentage();
	}

	public static long getTotalMemory() {
		return getService().getTotalMemory();
	}

	public static long getUsedMemory() {
		return getService().getUsedMemory();
	}

	public static void clearService() {
		_service = null;
	}

	public static LiferayStatusService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					LiferayStatusService.class.getName());

			if (invokableService instanceof LiferayStatusService) {
				_service = (LiferayStatusService)invokableService;
			}
			else {
				_service = new LiferayStatusServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(LiferayStatusServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(LiferayStatusService service) {
	}

	private static LiferayStatusService _service;
}