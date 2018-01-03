package com.madlibs;

import java.util.List;
import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class StoryMaker {
	
	private static String[] stories = new String[3];
	private static String[] pos = new String[13];
	
	private List<MadLib> madlibs = Arrays.asList(
		new MadLib(0, "Precious Love", stories[0], 4, "Valentine\'s Day", new String[] {
				pos[0],
				pos[7],
				pos[8],
				pos[9]
		}),
		new MadLib(1, "Mary Had a Little Lamb", stories[1], 6, "Nursery Rhymes Gone Wrong", new String[] {
				pos[10],
				pos[9],
				pos[2],
				pos[3],
				pos[5],
				pos[7]
		}),
		new MadLib(2, "Three Blind Mice", stories[2], 0, "Nursery Rhymes Gone Wrong", new String[] {
				pos[0],
				pos[7],
				pos[11],
				pos[12],
				pos[3]
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
		pos[11] = "Person";
		pos[12] = "Verb - past tense";
	
		stories[0] = "Love is a <span>%1s</span> thing<br/>" + 
				 	 "It is a feeling that <br/>" + 
				 	 "makes your heart <span>%2s</span>.<br/>" + 
				 	 "<br/>" + 
				 	 "Whether you are far or near<br/>" + 
				 	 "it is like <span>%3s</span> in my ear.<br/>" + 
				 	 "<br/>" + 
				 	 "When you find true love<br/>" + 
				 	 "it is something you<br/>" + 
				 	 "keep within your <span>%4s</span>. ";
		
		stories[1] = "Mary had a little %1$s <br/>" +
				"Its %2$s was %3$s as %4$s, <br/>" + 
				"<br/>" + 
				"And every where that Mary went <br/>" + 
				"The %1$s was sure to go.<br/>" + 
				"<br/>" + 
				"He followed her to %5$s one day <br/>" + 
				"That was against the rule, <br/>" + 
				"<br/>" + 
				"It made the children laugh and %6$s, <br/>" +
				"To see a %1$s at %5$s. <br/>";
		
		stories[2] = "Three %1$s mice. Three %1$s mice.<br/>" + 
				"See how they %2$s. See how they %2$s.<br/>" + 
				"They all ran after %3$s,<br/>" + 
				"Who %4$s their tails with a %5$s,<br/>" + 
				"Did you ever see such a sight in your life,<br/>" + 
				"As three %1$s mice?";
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
