package liferay.dynamic.include.post.web.portlet;

import com.liferay.portal.kernel.servlet.taglib.DynamicInclude;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		service = DynamicInclude.class
	)

public class DynamicIncPost implements DynamicInclude {

	@Override
	public void include(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, String key)
			throws IOException {
		// TODO Auto-generated method stub
		
		PrintWriter printWriter = httpServletResponse.getWriter();
		printWriter.write("<h1> post content added here");
		
	}

	@Override
	public void register(DynamicIncludeRegistry dynamicIncludeRegistry) {
		// TODO Auto-generated method stub
		
		dynamicIncludeRegistry.register("liferay.dynamic.include.web#view.jsp#post");
		
	}

}
