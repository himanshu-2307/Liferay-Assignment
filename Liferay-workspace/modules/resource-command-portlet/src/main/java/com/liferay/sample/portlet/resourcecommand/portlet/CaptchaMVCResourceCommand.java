package com.liferay.sample.portlet.resourcecommand.portlet;

import com.liferay.captcha.util.CaptchaUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.sample.portlet.resourcecommand.constants.CaptchaPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + CaptchaPortletKeys.CAPTCHA,
			"mvc.command.name=/captcha"
		},
		service = MVCResourceCommand.class
	)

public class CaptchaMVCResourceCommand implements MVCResourceCommand {
	private static final Log _log = LogFactoryUtil.getLog(
			CaptchaMVCResourceCommand.class);

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		// TODO Auto-generated method stub
		//if (_log.isInfoEnabled())
		 
			_log.info("get captcha resource ");
			
			
		
		
		try {
			CaptchaUtil.serveImage(resourceRequest, resourceResponse);
			

			return false;
		}
		catch (Exception exception) {
			_log.error(exception.getMessage(), exception);

			return true;
		}
	}
	
	
	
}
