package com.liferay.training.employee.ActionCommands;

import com.liferay.assignment.office.model.Employee;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.training.employee.api.EmployeeApi;
import com.liferay.training.employee.constants.EmployeePortletKeys;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(property = { "javax.portlet.name=" + EmployeePortletKeys.EMPLOYEE,
		"mvc.command.name=addEntry",
		"mvc.command.name=/editCurrentEntry"
		}, 
		service = MVCActionCommand.class
		)

public class AddEntryMVCActionCommand extends BaseMVCActionCommand {

@Override
public void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception { // TODO
																						// Auto-generated
																						// method
																						// stub
	ServiceContext serviceContext = ServiceContextFactory.getInstance(Employee.class.getName(), actionRequest);
	String name = ParamUtil.getString(actionRequest, "name");
	String jobTitle = ParamUtil.getString(actionRequest, "jobTitle");
	long phoneNo = ParamUtil.getLong(actionRequest, "phoneNo");
	long salary = ParamUtil.getLong(actionRequest, "salary");
	long departmentId = ParamUtil.getLong(actionRequest, "departmentId");
	long projectId = ParamUtil.getLong(actionRequest, "projectId");
	String edit = actionRequest.getParameter("editEntry").toString();

try {
	
	if(edit.contentEquals("edit")) {
		
		long employeeId = Long.parseLong(actionRequest.getParameter("employeeId").toString());
		String backUrl = actionRequest.getParameter("backUrl").toString();
		System.out.println("Employeed ID"+employeeId);
		_employeeAPI.updateEmployeeOffice(serviceContext.getUserId(), employeeId, name, jobTitle, phoneNo, salary, departmentId, projectId, serviceContext);
			
		System.out.println("Data is updated");
		SessionMessages.add(actionRequest, "employeeUpdated");
		
		sendRedirect(actionRequest, actionResponse, backUrl);
		
	}
	else {
		_employeeAPI.addEmployeeOffice(serviceContext.getUserId(), name, jobTitle, phoneNo, salary, departmentId, projectId,
				serviceContext);
	  actionRequest.setAttribute("jspPath", "/newEmployee.jsp");
	  System.out.println("Data is inserted");
	  SessionMessages.add(actionRequest, "employeeAdded");
	}
	

	
	

} catch (PortalException e) { // TODO Auto-generated catch block
	e.printStackTrace();

}

}

@Reference
EmployeeApi _employeeAPI;

}
