package com.knowarth.student;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * Portlet implementation class StudentRegistration
 */
public class StudentRegistration extends MVCPortlet {
	private static final Log log=LogFactoryUtil.getLog(StudentRegistration.class);
	@Override
	public void render(RenderRequest arg0, RenderResponse arg1)
			throws PortletException, IOException {
		log.info("render method called");
	
	}

}
