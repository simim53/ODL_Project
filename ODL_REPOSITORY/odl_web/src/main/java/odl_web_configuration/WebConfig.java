package odl_web_configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

	 @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry
	          .addResourceHandler("/resources/**")
	          .addResourceLocations("/resources/"); 
	    }
	 
	  @Override
	  public void configureViewResolvers(ViewResolverRegistry registry) {
	    registry.jsp().prefix("/WEB-INF/views/").suffix(".html");
	  }

	  @Override
	  public void addViewControllers(ViewControllerRegistry registry) {
	    registry.addViewController("/index").setViewName("index");
	    registry.addViewController("/login").setViewName("login");
	    registry.addViewController("/getAllUtilisateurs").setViewName("getAllUtilisateurs");

	    registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
	  }
	  
	  
	
}