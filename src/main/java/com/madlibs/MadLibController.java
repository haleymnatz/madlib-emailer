package com.madlibs;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MadLibController {
	
	private Logger logger = Logger.getLogger(MadLibController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public String helloWorld() {
        logger.info("This is an info log entry");
        logger.error("This is an error log entry");
		return "Hello World!";
	}

}
