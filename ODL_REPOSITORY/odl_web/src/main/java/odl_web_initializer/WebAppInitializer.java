package odl_web_initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import odl_web_configuration.WebAppConfig;
import odl_web_configuration.WebSecurityConfig;

public class WebAppInitializer implements WebApplicationInitializer {

	

	@Override
	public void onStartup(ServletContext container) {

		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(WebAppConfig.class,WebSecurityConfig.class);
		
		ctx.setServletContext(container);

		ServletRegistration.Dynamic servlet = container.addServlet("dispatcher", new DispatcherServlet(ctx));


		servlet.setLoadOnStartup(1);
		servlet.addMapping("/index");
		//servlet.addMapping("/");
			
				
	}

}
