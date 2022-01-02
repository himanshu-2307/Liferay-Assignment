
  package com.liferay.training.employee.ActionCommands;
  
  import com.liferay.assignment.office.model.Employee; import
  com.liferay.portal.kernel.exception.PortalException; import
  com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand; import
  com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import
  com.liferay.training.employee.api.EmployeeApi; import
  com.liferay.training.employee.constants.EmployeePortletKeys;
  
  import javax.portlet.ActionRequest; import javax.portlet.ActionResponse;
  
  import java.util.List;
  
  import org.osgi.service.component.annotations.Component; import
  org.osgi.service.component.annotations.Reference;
  
  
  @Component(property = { "javax.portlet.name=" + EmployeePortletKeys.EMPLOYEE,
  "mvc.command.name=/searchKeyword" }, service = MVCActionCommand.class)
  
  public class SearchKeywordMVCActionCommand extends BaseMVCActionCommand {
  
  @Override protected void doProcessAction(ActionRequest actionRequest,
  ActionResponse actionResponse) throws Exception {
  
  System.out.println("Hello Search");
  
		/*
		 * long employeeId =
		 * Long.parseLong(actionRequest.getParameter("employeeId").toString()); String
		 * backUrl =actionRequest.getParameter("backUrl").toString();
		 */ 
  //String keywords =  ParamUtil.getString(actionRequest, "keywords");
  String keywords = actionRequest.getParameter("keywords").toString();
  
  
  //_employeeAPI.getSearchKeywordEmployeeList(0, 10, keywords);
  
  System.out.println(_employeeAPI.getSearchKeywordEmployeeList(0, 10, keywords));
  
  //sendRedirect(actionRequest, actionResponse, backUrl);
  

  
 
		  
  }
  @Reference 
  EmployeeApi _employeeAPI;
  
  
  }
  
  
  
  
  
 