package com.liferay.training.employee.ActionCommands;

import com.liferay.assignment.office.model.Employee;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.training.employee.api.EmployeeApi;
import com.liferay.training.employee.constants.EmployeePortletKeys;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(property = { "javax.portlet.name=" + EmployeePortletKeys.EMPLOYEE,
"mvc.command.name=addEntry" }, service = MVCActionCommand.class)

public class AddEntryMVCActionCommand implements MVCActionCommand {

@Override
public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) { // TODO
																						// Auto-generated
																						// method
																						// stub

try {
	ServiceContext serviceContext = ServiceContextFactory.getInstance(Employee.class.getName(), actionRequest);
	String name = ParamUtil.getString(actionRequest, "name");
	String jobTitle = ParamUtil.getString(actionRequest, "jobTitle");
	long phoneNo = ParamUtil.getLong(actionRequest, "phoneNo");
	long salary = ParamUtil.getLong(actionRequest, "salary");
	long departmentId = ParamUtil.getLong(actionRequest, "departmentId");
	long projectId = ParamUtil.getLong(actionRequest, "projectId");

	_employeeAPI.addEmployeeOffice(serviceContext.getUserId(), name, jobTitle, phoneNo, salary, departmentId, projectId,
			serviceContext);
	return true;

} catch (PortalException e) { // TODO Auto-generated catch block
	e.printStackTrace();
	return false;
}

}

@Reference
EmployeeApi _employeeAPI;

}
