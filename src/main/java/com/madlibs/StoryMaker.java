package com.madlibs;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class StoryMaker {
	
	private static String[] stories = new String[2];
	private static String[] pos = new String[8];
	
	private static List<MadLib> madlibs = new ArrayList<MadLib>();

			
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
		stories[1] = "Happy birthday, %1s! I hope you have a %2s day!";
		
		madlibs.add(new MadLib(1, "Christmas Time", stories[0], 2, new String[] {pos[5], pos[5]}));
		madlibs.add(new MadLib(2, "Happy Birthday", stories[1], 2, new String[] {pos[5], pos[3]}));
	
	}
	
	public List<MadLib> getMadLibs() {
		return madlibs;
	}
	
	public MadLib retrieveMadLib(int id) {
		for (MadLib m : madlibs) {
			if (m.getId() == id) {
				return m;
			}
		}
		return null;
	}
	
	public void buildStory(MadLib m, Object[] inputs) {
		String libbing = m.getStory();
		m.setStory(String.format(libbing.toString(), inputs));
	}
	
	public void resetStory(MadLib m) {
		int id = m.getId();
		m.setStory(stories[id-1]);
	}
	
}
