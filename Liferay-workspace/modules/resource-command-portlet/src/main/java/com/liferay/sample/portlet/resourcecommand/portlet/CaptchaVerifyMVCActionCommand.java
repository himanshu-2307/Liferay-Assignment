package com.liferay.sample.portlet.resourcecommand.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.sample.portlet.resourcecommand.constants.CaptchaPortletKeys;

import java.util.Enumeration;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletRequest;
import javax.portlet.PortletSession;

import org.osgi.service.component.annotations.Component;

@Component(property = {"javax.portlet.name=" + CaptchaPortletKeys.CAPTCHA,
		"mvc.command.name=/captchaVerify"
		}, 
		service = MVCActionCommand.class)

public class CaptchaVerifyMVCActionCommand extends BaseMVCActionCommand {

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * try { CaptchaUtil.check(actionRequest);
		 * System.out.println("Captcha Verifyied"); }catch(PortalException e) {
		 * e.printStackTrace(); }
		 */
		
		System.out.println("inside validateCaptcha method...");
		  
	      String userEnteredCaptcha = ParamUtil.getString(actionRequest, "captchaText");
	      System.out.println("userEnteredCaptcha value:::"+userEnteredCaptcha);
	      try {
	            boolean captchaMatched = checkCaptcha(actionRequest, userEnteredCaptcha);
	            if(!captchaMatched){
	             SessionErrors.add(actionRequest, "Message");
	            }else{
	             System.out.println("Captcha Validated Successfully");
	            }
	         } catch (Exception e) {
	      e.printStackTrace();
	  }
	 }
	 
	 /*code for matching userEntered captcha text with loaded captcha text, if matched return true else false*/
	  private boolean checkCaptcha(PortletRequest request,String enteredCaptchaText) throws Exception {
	   boolean captchaMatched = false;
	   PortletSession session = request.getPortletSession();
	      String captchaTextFromSession = getCaptchaValueFromSession(session);
	     
	         if (Validator.isNotNull(captchaTextFromSession)) {
	             if(enteredCaptchaText.equals(captchaTextFromSession)){
	               captchaMatched = true;
	           }
	         }
	        return captchaMatched;
	   }
	 
	      /*code for getting loaded captcha text from session*/
	   private String getCaptchaValueFromSession(PortletSession session) {
	         Enumeration<String> atNames = session.getAttributeNames();
	         while (atNames.hasMoreElements()) {
	             String name = atNames.nextElement();
	             if (name.contains("CAPTCHA_TEXT")) {
	                 String captchaValueFromSession = (String) session.getAttribute(name);
	              return captchaValueFromSession;
	             }
	         }
	         return null;
	   }
		
		

}
