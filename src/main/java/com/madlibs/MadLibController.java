package com.madlibs;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@SessionAttributes("madlibs")
public class MadLibController {
	
	@Autowired
	StoryMaker storymaker;
	
//	 private Logger logger = Logger.getLogger(MadLibController.class);
	 
	@RequestMapping(value = "/*", method = RequestMethod.GET)
	public String home() {
		return "redirect:index";
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String showIndex(ModelMap model) {
        List<MadLib> madlibs = storymaker.getMadLibs();
        model.put("madlibs", madlibs);
		return "index";
	}
	
	@RequestMapping(value = "/storyForm", method = RequestMethod.GET)
	public String showStoryForm(ModelMap model, @RequestParam int id) {
        MadLib m = storymaker.retrieveMadLib(id);

        model.addAttribute("madlib", m);
		return "storyForm";
	}
	
	@RequestMapping(value = "/*", method = RequestMethod.POST)
	public String fillOutForm(ModelMap model, @RequestParam String[] userInputs, @RequestParam int id, RedirectAttributes redir) {
		
		MadLib m = storymaker.retrieveMadLib(id);
		
		String newStory = storymaker.buildStory(m, userInputs);
		redir.addAttribute("newStory", newStory);

		redir.addAttribute("id", id);
		return "redirect:/temp";
	}
	
	@RequestMapping(value = "/temp", method = RequestMethod.GET)
	public String temp(ModelMap model, @RequestParam int id, RedirectAttributes redir, @RequestParam String newStory) {
        MadLib m = storymaker.retrieveMadLib(id);
        model.addAttribute("newStory", newStory);
        model.addAttribute("madlib", m);
        redir.addAttribute("id", id);
		return "temp";
	}

}
