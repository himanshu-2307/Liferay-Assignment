//
//  package com.liferay.training.employee.ResourceCommands;
//  
//  import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCResourceCommand;
//  import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
//  import com.liferay.portal.kernel.servlet.SessionErrors; import
//  com.liferay.portal.kernel.servlet.SessionMessages; import
//  com.liferay.training.employee.constants.EmployeePortletKeys;
//  
//  import javax.portlet.PortletException; import javax.portlet.ResourceRequest;
//  import javax.portlet.ResourceResponse;
//  
//  import org.osgi.service.component.annotations.Component;
//  
//  
//  @Component(property = { "javax.portlet.name=" + EmployeePortletKeys.EMPLOYEE,
//  "mvc.command.name=/deleteEntry" }, service = MVCResourceCommand.class)
//  
//  public class DeleteEntryMVCResourceCommand extends BaseMVCResourceCommand{
//  
//  @Override protected void doServeResource(ResourceRequest resourceRequest,
//  ResourceResponse resourceResponse) throws PortletException {
//  
//  System.out.println("Hello Delete Resource"); // TODO Auto-generated method
// 
//  
//  long employeeId =
//  Long.parseLong(resourceRequest.getParameter("employeeId").toString()); String
//  deleteRow =resourceRequest.getParameter("deleteRow").toString(); String
//  backUrl =resourceRequest.getParameter("backUrl").toString();
//  
//  try {
//  
//  //_employeeAPI.deleteEmployeeOffice(employeeId);
//  System.out.println("Data is deleted"); SessionMessages.add(resourceRequest,
//  "remove");
//  
//  
//  if(deleteRow.isEmpty()) resourceRequest.setAttribute("jspPath",
//  "/deleteEntry.jsp");
//  
//  else {
//  
//  include(resourceRequest, resourceResponse, backUrl); }
//  
//  
//  } catch (Exception e) { // TODO Auto-generated catch block
//  SessionErrors.add(resourceRequest, "delete-key");
//  System.out.println("The error " + e); System.err.println(e);
//  e.printStackTrace(); }
//  
//  
//  }
//  
//  }
// 