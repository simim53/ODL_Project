package odl_web_controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
class IndexController {

	final Logger logger = LogManager.getLogger(IndexController.class);

	@RequestMapping(value = "/index")
	public ModelAndView index() {
		logger.debug("TEST Affichage page index");
		return new ModelAndView("index");		
	}

	@RequestMapping(value = "/construction")
	public ModelAndView construction() {
			logger.debug("TEST Affichage page construction");
			return new ModelAndView("construction");		
			
		}

}
