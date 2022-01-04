package com.liferay.office.employee.application;

import java.util.Collections;

import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants;

import com.liferay.assignment.office.model.Employee;
import com.liferay.assignment.office.service.EmployeeLocalService;
import com.liferay.portal.kernel.json.JSONFactoryUtil;

/**
 * @author Administrator
 */
@Component(
	property = {
		JaxrsWhiteboardConstants.JAX_RS_APPLICATION_BASE + "=/greetings",
		JaxrsWhiteboardConstants.JAX_RS_NAME + "=Greetings.Rest"
	},
	service = Application.class
)
public class MyRestServiceApplication extends Application {

	public Set<Object> getSingletons() {
		return Collections.<Object>singleton(this);
	}
	
	 @Reference(unbind="-")
     public void setLeaveLocalService(EmployeeLocalService employeeLocalService){
         this.employeeLocalService=employeeLocalService;
      }
	 
	 @GET

	   @Path("/Employee-info/{employeeId}")

	   @Produces(MediaType.APPLICATION_JSON)

	  public String getLeave(@PathParam("employeeId") long employeeId){

	       Employee employee = null;

	       String jsonString = null;

	     try {

	    	 employee = employeeLocalService.getEmployee(employeeId);

	                jsonString = JSONFactoryUtil.serialize(employee);

	        } catch (Exception e) {

	         e.printStackTrace();

	       }

	     return jsonString;

	    }
	 
	@GET
	@Produces("text/plain")
	public String working() {
		return "It works!";
	}

	@GET
	@Path("/morning")
	@Produces("text/plain")
	public String hello() {
		return "Good morning!";
	}

	@GET
	@Path("/morning/{name}")
	@Produces("text/plain")
	public String morning(
		@PathParam("name") String name,
		@QueryParam("drink") String drink) {

		String greeting = "Good Morning " + name;

		if (drink != null) {
			greeting += ". Would you like some " + drink + "?";
		}

		return greeting;
	}
	
	@Reference
	EmployeeLocalService employeeLocalService;

}