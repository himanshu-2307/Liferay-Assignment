package com.liferay.training.employee.RenderCommands;

import com.liferay.assignment.office.model.Employee;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.training.employee.api.EmployeeApi;
import com.liferay.training.employee.constants.EmployeePortletKeys;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name="+ EmployeePortletKeys.EMPLOYEE,
			"mvc.command.name=/office/render"
		},
		service = MVCRenderCommand.class
	)

public class ViewEmployeesMVCRenderCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		// TODO Auto-generated method stub
		
		List<Employee> employeeList = _employeeAPI.getAllEmployeesInformationOffice(0,12);
	
		System.out.println(employeeList);
		renderRequest.setAttribute("empList", employeeList);
		//System.out.println(employeeList);
		 SessionMessages.add(renderRequest,"employee-form-success");
		
		
		return "/viewAllEmployees.jsp";
	}
	
	@Reference
	EmployeeApi _employeeAPI;

}
