/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.liferay.blogs.render.portlet;

import com.liferay.portal.kernel.util.PortletKeys;

import java.io.IOException;
import javax.portlet.filter.FilterChain;
import javax.portlet.filter.FilterConfig;
import javax.portlet.filter.PortletFilter;
import javax.portlet.filter.RenderFilter;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.PortletException;
import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
		"javax.portlet.name=blade_portlet_filter_BlogsRenderPortlet",
		"javax.portlet.name=" +PortletKeys.BLOGS,
		"javax.portlet.name=" + PortletKeys.MEDIA_GALLERY_DISPLAY
	},
	service = PortletFilter.class
)
public class BlogsRenderRenderFilter implements RenderFilter {

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(
			RenderRequest request, RenderResponse response, FilterChain chain)
		throws IOException, PortletException {

		System.out.println("Before filter");
		request.setAttribute("CUSTOM_ATTRIBUTE", "My Custom Attribute Value");
		chain.doFilter(request, response);
		System.out.println("After filter");
		response.getWriter().write("Custom potlet filter");
	}

	@Override
	public void init(FilterConfig filterConfig) throws PortletException {
	}
}