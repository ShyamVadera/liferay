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
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

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
		int age=ParamUtil.getInteger(actionRequest,"age");
		log.info(age);

		
		String stdName=studentName;
		log.info("add faculty is called in clg method");
		log.info(studentName);
		log.info(stdName);
	}
	@ProcessAction(name="addColleges")
	public void addColleges(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {

		log.info("add college is called  again conflict");
		log.info("hello worlds");
		log.info("add college is called");

	}
	@ProcessAction(name="addAddress")
	public void addAddress(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		
	}
	@Override
	public void serveResource(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException,
			PortletException {
		log.info("serve resource added");
		super.serveResource(resourceRequest, resourceResponse);
	}
}

