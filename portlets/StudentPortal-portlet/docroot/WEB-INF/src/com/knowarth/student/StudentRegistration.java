package com.knowarth.student;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
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
	super.render(arg0, arg1);
	}

	@ProcessAction(name="addFaculty")
	public void addEmployee(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {

		String studentName=ParamUtil.getString(actionRequest,"studentName");
		log.info("add faculty is called in clg method");
		log.info(studentName);
	}
	@ProcessAction(name="addCollege")
	public void addCollege(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {

		log.info("add college is called  again conflict");
		log.info("hello world");
		log.info("add college is called");

	}


}
