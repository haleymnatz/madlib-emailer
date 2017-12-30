package com.madlibs;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class StoryMaker {
	
	private static String[] stories = new String[3];
	private static String[] pos = new String[10];
	
	private List<MadLib> madlibs = Arrays.asList(
		new MadLib(1, "Christmas Time", stories[0], 2, new String[] {pos[4], pos[4]}),
		new MadLib(2, "Happy Birthday", stories[1], 2, new String[] {pos[4], pos[0]}),
		new MadLib(3, "Precious Love", stories[2], 4, new String[] {
				pos[0],
				pos[7],
				pos[8],
				pos[9]
		})
	);

			
	static {
		pos[0] = "Adjective";
		pos[1] = "Adverb ";
		pos[2] = "Color"; 
		pos[3] = "Noun";
		pos[4] = "Person\'s name";
		pos[5] = "Place";
		pos[6] = "Plural noun";
		pos[7] = "Verb";
		pos[8] = "Verb (present tense";
		pos[9] = "Body part";
	
		stories[0] = "Hello %1s, my name is %2s.";
		stories[1] = "Happy birthday, %1s! I hope you have a %2s day!";
		stories[2] = "Love is a %1s thing\n" + 
				 	 "It is a feeling that\n" + 
				 	 "makes your heart %2s.\n" + 
				 	 "\n" + 
				 	 "Whether you are far or near\n" + 
				 	 "it is like %3s in my ear.\n" + 
				 	 "\n" + 
				 	 "When you find true love\n" + 
				 	 "it is something you\n" + 
				 	 "keep within your %4s. ";
	
	}
	
//	madlibs.add(new MadLib(1, "Christmas Time", stories[0], 2, new String[] {pos[5], pos[5]}));
//	madlibs.add(new MadLib(2, "Happy Birthday", stories[1], 2, new String[] {pos[5], pos[3]}));
	
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
	
	public String buildStory(MadLib m, Object[] inputs) {
		String libbing = m.getStory();
		return String.format(libbing.toString(), inputs);
	}
	
	public void resetStory(MadLib m) {
		int id = m.getId();
		m.setStory(stories[id-1]);
	}
	
}
