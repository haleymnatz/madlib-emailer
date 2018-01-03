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
		
		stories[1] = "Mary had a little <span>%1$s</span> <br/>" +
				"Its <span>%2$s</span> was <span>%3$s</span> as <span>%4$s</span>, <br/>" + 
				"<br/>" + 
				"And every where that Mary went <br/>" + 
				"The <span>%1$s</span> was sure to go.<br/>" + 
				"<br/>" + 
				"He followed her to <span>%5$s</span> one day <br/>" + 
				"That was against the rule, <br/>" + 
				"<br/>" + 
				"It made the children laugh and <span>%6$s</span>, <br/>" +
				"To see a <span>%1$s</span> at <span>%5$s</span>. <br/>";
		
		stories[2] = "Three <span>%1$s</span> mice. Three <span>%1$s</span> mice.<br/>" + 
				"See how they <span>%2$s</span>. See how they <span>%2$s</span>.<br/>" + 
				"They all ran after <span>%3$s</span>,<br/>" + 
				"Who <span>%4$s</span> their tails with a <span>%5$s</span>,<br/>" + 
				"Did you ever see such a sight in your life,<br/>" + 
				"As three <span>%1$s</span> mice?";
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
