package com.madlibs;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MadLibController {
	
	@Autowired
	StoryMaker storymaker;
	
	 private Logger logger = Logger.getLogger(MadLibController.class);
	
	@RequestMapping(value = "/*", method = RequestMethod.GET)
	public String showIndex() {
        logger.info("This is an info log entry");
        logger.error("This is an error log entry");
		return "index";
	}
	
	@RequestMapping(value = "/*", method = RequestMethod.POST)
	public String fillOutForm(@RequestParam String name, @RequestParam String color, ModelMap model) {
        model.put("name", name);
        model.put("color", color);
        model.addAttribute("madlibs", storymaker.getMadLibs());
        List<MadLib> madlibs = storymaker.getMadLibs();
        Object[] inputs = new Object[2];
        inputs[0] = name;
        inputs[1] = color;
        storymaker.buildStory(madlibs.get(0), inputs);
		return "temp";
	}

}
