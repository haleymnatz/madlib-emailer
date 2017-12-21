package com.madlibs;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class StoryMaker {
	
	private static String[] stories = new String[1];
	private static String[] pos = new String[8];
	
	private static List<MadLib> madlibs = new ArrayList<MadLib>();
	
	private Object[] inputs;
			
	static {
		pos[0] = "noun";
		pos[1] = "plural noun";
		pos[2] = "verb"; 
		pos[3] = "adjective";
		pos[4] = "adverb";
		pos[5] = "Person\'s name";
		pos[6] = "place";
		pos[7] = "color";
	
		stories[0] = "Hello %1s, my name is %2s.";
		
		madlibs.add(new MadLib(stories[0], 2, new String[] {pos[5], pos[5]}));
	
	}
	
	public List<MadLib> getMadLibs() {
		return madlibs;
	}
	
	public void buildStory(MadLib m, Object[] inputs) {
		String libbing = m.getStory();
		libbing = String.format(libbing.toString(), inputs);
		System.out.println(libbing);
	}
	
}
