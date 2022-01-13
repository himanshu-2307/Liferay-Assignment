package com.liferay.custombag;

import com.liferay.portal.deploy.hot.CustomJspBag;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.url.URLContainer;

import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;


@Component(
	    immediate = true,
	    property = {
	    	"context.id=PortletUndeployedHook",
	        "context.name=Portlet undeployed hook",
	    	"service.ranking:Integer=100"
	    },
	    service=CustomJspBag.class
	)

public class PortletUndeployedHook implements CustomJspBag {

	@Override
	public String getCustomJspDir() {
		// TODO Auto-generated method stub
		return "META-INF/jsps";
	}

	@Override
	public List<String> getCustomJsps() {
		// TODO Auto-generated method stub
		return _customJsps;
	}

	@Override
	public URLContainer getURLContainer() {
		// TODO Auto-generated method stub
		return _urlContainer;
	}
	
	private final URLContainer _urlContainer = new URLContainer() {

	    @Override
	    public URL getResource(String name) {
	    	_log.info(" name : "+name);
	        return _bundle.getEntry(name);
	    }

		@Override
		public Set<String> getResources(String path) {
			// TODO Auto-generated method stub
			return null;
		}

	    

	};
	@Override
	public boolean isCustomJspGlobal() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Activate
	protected void activate(BundleContext bundleContext) {
        _bundle = bundleContext.getBundle();

        _customJsps = new ArrayList<>();

        Enumeration<URL> entries = _bundle.findEntries(
            getCustomJspDir(), "*.jsp", true);

        while (entries.hasMoreElements()) {
            URL url = entries.nextElement();

            _customJsps.add(url.getPath());
        }
		
		
	}
	
	
	private Bundle _bundle;
	private List<String> _customJsps;
	
	
	private static Log _log=LogFactoryUtil.getLog(PortletUndeployedHook.class);

}
