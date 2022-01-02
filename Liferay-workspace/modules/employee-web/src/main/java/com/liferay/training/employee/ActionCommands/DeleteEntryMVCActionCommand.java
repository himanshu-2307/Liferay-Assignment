
  package com.liferay.training.employee.ActionCommands;
  
  import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
  import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand; import
  com.liferay.portal.kernel.servlet.SessionErrors; import
  com.liferay.portal.kernel.servlet.SessionMessages; import
  com.liferay.training.employee.api.EmployeeApi; import
  com.liferay.training.employee.constants.EmployeePortletKeys;
  
  import javax.portlet.ActionRequest; import javax.portlet.ActionResponse;
  import javax.portlet.PortletException;
  
  import org.osgi.service.component.annotations.Component; import
  org.osgi.service.component.annotations.Reference;
  
  @Component(property = { "javax.portlet.name=" + EmployeePortletKeys.EMPLOYEE,
  "mvc.command.name=/deleteEntry" }, service = MVCActionCommand.class)
  
  public class DeleteEntryMVCActionCommand extends BaseMVCActionCommand {
  
  
  
  @Override public void doProcessAction(ActionRequest actionRequest,
  ActionResponse actionResponse) throws PortletException { // TODO
  
  System.out.println("Hello Delete");
  
  long employeeId =
  Long.parseLong(actionRequest.getParameter("employeeId").toString()); String
  deleteRow =actionRequest.getParameter("deleteRow").toString(); String backUrl
  =actionRequest.getParameter("backUrl").toString();
  
  try {
  
  //_employeeAPI.deleteEmployeeOffice(employeeId);
  System.out.println("Data is deleted"); 
  SessionMessages.add(actionRequest, "remove");
  
  
  if(deleteRow.isEmpty()) actionRequest.setAttribute("jspPath",
  "/deleteEntry.jsp");
  
  else { sendRedirect(actionRequest, actionResponse,backUrl);
  
  }
  
  
  } catch (Exception e) { // TODO Auto-generated catch block
  SessionErrors.add(actionRequest, "delete-key");
  System.out.println("The error " + e); System.err.println(e);
  e.printStackTrace(); }
  
  }
  
  @Reference EmployeeApi _employeeAPI;
  
  }
 