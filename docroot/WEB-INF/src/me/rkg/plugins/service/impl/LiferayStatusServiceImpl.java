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

package me.rkg.plugins.service.impl;

import java.text.DecimalFormat;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.portal.util.PortalUtil;

import me.rkg.plugins.service.base.LiferayStatusServiceBaseImpl;

/**
 * The implementation of the liferay status remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link me.rkg.plugins.service.LiferayStatusService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ravi.gupta
 * @see me.rkg.plugins.service.base.LiferayStatusServiceBaseImpl
 * @see me.rkg.plugins.service.LiferayStatusServiceUtil
 */

public class LiferayStatusServiceImpl extends LiferayStatusServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link me.rkg.plugins.service.LiferayStatusServiceUtil} to access the liferay status remote service.
	 */
	@AccessControlled(guestAccessEnabled=true)
	public JSONObject getStatusAsJSON(){
		Runtime runtime = Runtime.getRuntime();
		JSONObject serverStatus = JSONFactoryUtil.createJSONObject();
		serverStatus.put("totalMemory", runtime.totalMemory());
		serverStatus.put("usedMemory", runtime.totalMemory() - runtime.freeMemory());
		return serverStatus;
	}
	
	@AccessControlled(guestAccessEnabled=true)
	public String getStatus(){
		Runtime runtime = Runtime.getRuntime();
		JSONObject serverStatus = JSONFactoryUtil.createJSONObject();
		serverStatus.put("totalMemory", runtime.totalMemory());
		serverStatus.put("usedMemory", runtime.totalMemory() - runtime.freeMemory());
		return serverStatus.toString();
	}
	
	@AccessControlled(guestAccessEnabled=true)
	public double getStatusAsPercentage(){
		
		Runtime runtime = Runtime.getRuntime();
		double total = (double) runtime.totalMemory();
		double used = (double) (runtime.totalMemory() - runtime.freeMemory());
		
		//DecimalFormat format = new DecimalFormat("0.00");
		
		double percentage = 100 * ( used / total );
		return percentage;
	}
	
	@AccessControlled(guestAccessEnabled=true)
	public long getTotalMemory(){
		Runtime runtime = Runtime.getRuntime();
		return runtime.totalMemory();
	}

	@AccessControlled(guestAccessEnabled=true)
	public long getUsedMemory(){
		Runtime runtime = Runtime.getRuntime();
		return runtime.totalMemory() - runtime.freeMemory();
	}
	
}