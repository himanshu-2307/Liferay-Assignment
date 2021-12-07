package com.liferay.training.employee.ActionCommands;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.training.employee.api.EmployeeApi;
import com.liferay.training.employee.constants.EmployeePortletKeys;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(property = { "javax.portlet.name=" + EmployeePortletKeys.EMPLOYEE,
"mvc.command.name=deleteEntry" }, service = MVCActionCommand.class)

public class DeleteEntryMVCActionCommand implements MVCActionCommand {


	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
		// TODO Auto-generated method stub
		
		long employeeId = ParamUtil.getLong(actionRequest, "employeeId");
		try {
			// ServiceContext serviceContext =
			// ServiceContextFactory.getInstance(Employee.class.getName(), request);
			// _employeeLocalService.deleteEmployee(empId);
			_employeeAPI.deleteEmployeeOffice(employeeId);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	@Reference
	EmployeeApi _employeeAPI;

}