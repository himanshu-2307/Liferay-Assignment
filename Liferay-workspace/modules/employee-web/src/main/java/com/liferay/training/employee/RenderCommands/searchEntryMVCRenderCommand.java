package com.liferay.training.employee.RenderCommands;

import com.liferay.assignment.office.model.Employee;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.training.employee.api.EmployeeApi;
import com.liferay.training.employee.constants.EmployeePortletKeys;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	    immediate = true,
	    property = {
	       "javax.portlet.name=" + EmployeePortletKeys.EMPLOYEE,
	       "mvc.command.name=/searchContainer"
	    },
	    service = MVCRenderCommand.class
	)
public class searchEntryMVCRenderCommand implements MVCRenderCommand {
	
	private static Log log = LogFactoryUtil.getLog(searchEntryMVCRenderCommand.class);
	
	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		PortletURL iteratorURL=PortletURLFactoryUtil.create(renderRequest, themeDisplay.getPortletDisplay().getId(), themeDisplay.getPlid(), PortletRequest.RENDER_PHASE);
		iteratorURL.setParameter("mvcRenderCommandName", "/searchContainer");
		
		SearchContainer<Employee> searchContainer = null;
		
		
		searchContainer = new SearchContainer<>(renderRequest, null, null, SearchContainer.DEFAULT_CUR_PARAM, SearchContainer.DEFAULT_DELTA, iteratorURL, null, "");
		searchContainer.setEmptyResultsMessage("There are no records to display");
		
		
		
		List<Employee> employeeList=_employeeAPI.getAllEmployeesInformationOffice(searchContainer.getStart(),searchContainer.getEnd());
		

		
		int count= _employeeAPI.getAllEmployeesInformationOfficeCount();
		
		searchContainer.setResults(employeeList);
		searchContainer.setTotal(count);
		
		renderRequest.setAttribute("searchContainer", searchContainer);
		renderRequest.setAttribute("currentUrl", iteratorURL);
		
			
		
//		renderRequest.setAttribute("employeeList",employeeList );
//		renderRequest.setAttribute("count",count );
		
		 SessionMessages.add(renderRequest,"employee-form-success");
		 log.info("Added employeelist and count attribute to search container"); 
		
		//System.out.println("Hello search container");
	//	response.setRenderParameter("mvcPath", "/viewEmployee.jsp");
		
		// renderRequest.setAttribute("jspPath", "/searchContainer.jsp");
		return "/searchContainer.jsp";
	}

	@Reference
	EmployeeApi _employeeAPI;
}