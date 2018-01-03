package com.madlibs;

import java.util.List;
import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class StoryMaker {
	
	private static String[] stories = new String[2];
	private static String[] pos = new String[11];
	
	private List<MadLib> madlibs = Arrays.asList(
		new MadLib(0, "Precious Love", stories[0], 4, new String[] {
				pos[0],
				pos[7],
				pos[8],
				pos[9]
		}),
		new MadLib(1, "Mary Had a Little Lamb", stories[1], 6, new String[] {
				pos[10],
				pos[9],
				pos[2],
				pos[3],
				pos[5],
				pos[7]
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
		pos[8] = "Verb ending in \"ing\"";
		pos[9] = "Body part";
		pos[10] = "Animal";
	
		stories[0] = "Love is a %1s thing<br/>" + 
				 	 "It is a feeling that <br/>" + 
				 	 "makes your heart %2s.<br/>" + 
				 	 "<br/>" + 
				 	 "Whether you are far or near<br/>" + 
				 	 "it is like %3s in my ear.<br/>" + 
				 	 "<br/>" + 
				 	 "When you find true love<br/>" + 
				 	 "it is something you<br/>" + 
				 	 "keep within your %4s. ";
		
		stories[1] = "Mary had a little %1$s <br/>" +
				"Its %2$s was %3$s as %4$s, <br/>" + 
				"And every where that Mary went <br/>" + 
				"<br/>" + 
				"The %1$s was sure to go.<br/>" + 
				"He followed her to %5$s one day <br/>" + 
				"<br/>" + 
				"That was against the rule, <br/>" + 
				"It made the children laugh and %6$s, <br/>" +
				"<br/>" + 
				"To see a %1$s at %5$s. <br/>";
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
	
	public String buildStory(MadLib m, Object[] inputs) {
		String unfinishedStory = m.getStory();
		return String.format(unfinishedStory.toString(), inputs);
	}
	
}
