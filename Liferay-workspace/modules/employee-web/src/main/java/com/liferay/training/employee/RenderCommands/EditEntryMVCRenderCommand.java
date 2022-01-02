package com.liferay.training.employee.RenderCommands;


import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.training.employee.api.EmployeeApi;
import com.liferay.training.employee.constants.EmployeePortletKeys;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	    immediate = true,
	    property = {
	       "javax.portlet.name=" + EmployeePortletKeys.EMPLOYEE,
	       "mvc.command.name=/editEntry"
	    },
	    service = MVCRenderCommand.class
	)
public class EditEntryMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest request, RenderResponse response) throws PortletException {
		
		
		long employeeId = Long.parseLong(request.getParameter("employeeId").toString());
		String backUrl = request.getParameter("backUrl").toString();
		
		try {
			request.setAttribute("employee",_employeeAPI.getEmployeeOffice(employeeId));
			request.setAttribute("currentUrl", backUrl);
		} catch (PortalException e) {
			
			e.printStackTrace();
		}
		
		
		//request.setAttribute("employeeList",employeeList );
		
		SessionMessages.add(request,"employee-form-success");
		 
		
		 System.out.println("Just before");
	//	response.setRenderParameter("mvcPath", "/viewEmployee.jsp");
		
		return "/editEmployee.jsp";
	}

	@Reference
	EmployeeApi _employeeAPI;			
}