package com.liferay.assignment.registration.portlet.portlet;

import com.liferay.assignment.registration.model.Register;
import com.liferay.assignment.registration.portlet.constants.RegistrationPortletKeys;
import com.liferay.assignment.registration.service.RegisterLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Argil DX
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Registration",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + RegistrationPortletKeys.REGISTRATION,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class RegistrationPortlet extends MVCPortlet {
	
	public void addEntry(ActionRequest request, ActionResponse response) throws PortalException, SystemException {

		
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Register.class.getName(), request);

			long groupId = themeDisplay.getScopeGroupId();
			
		    String first_name = ParamUtil.getString(request,"first_name");
		    String last_name = ParamUtil.getString(request,"last_name");
		    String email_address = ParamUtil.getString(request,"email_address");
		    String user_name = ParamUtil.getString(request,"user_name");
		    String birthday = ParamUtil.getString(request,"birthday");
		    String gender = ParamUtil.getString(request,"gender");
		    String password2 = ParamUtil.getString(request,"password2");
		    long home_phone = ParamUtil.getLong(request,"home_phone");
		    Long mobile_phone = ParamUtil.getLong(request,"mobile_phone");
		    String address = ParamUtil.getString(request,"address");
		    String address2 = ParamUtil.getString(request,"address2");
		    String city = ParamUtil.getString(request,"city") ;
		    String state = ParamUtil.getString(request,"state");
		    String zip = ParamUtil.getString(request,"zip");
		    String security_question = ParamUtil.getString(request,"security_question");
		    String security_answer = ParamUtil.getString(request,"security_answer");
		    boolean accepted_tou = true;
		    
		    
		    
		    try {
		    	_registerLocalService.addRegister(groupId, first_name, last_name, email_address, user_name,
		    			birthday, gender, password2, home_phone, mobile_phone, address, address2, city, state, zip, security_question, security_answer, accepted_tou, serviceContext);
		    	
		    	System.out.println("Data is inserted");
		    	SessionMessages.add(request, "registrationAdded");
		    	 
		    	 
		    } catch (Exception e) {
		        SessionErrors.add(request, e.getClass().getName());
	        	System.out.println("The error "+e);
	        	System.err.println(e);
		    }
		
		
		
	}
	
	@Reference
	private RegisterLocalService _registerLocalService;
}