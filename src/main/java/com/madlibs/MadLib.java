package com.madlibs;

import java.util.Arrays;

public class MadLib {
	
//	private String sender;
	private String story;
	private int inputNumber;
	private String[] wordTypes;

	
	public MadLib(String story, int inputNumber, String[] wordTypes) {
		super();
		this.story = story;
		this.inputNumber = inputNumber;
		this.wordTypes = wordTypes;
	}
	
	public MadLib() {}

	public int getInputNumber() {
		return inputNumber;
	}

	public void setInputNumber(int inputNumber) {
		this.inputNumber = inputNumber;
	}

	public String[] getWordTypes() {
		return wordTypes;
	}

	public void setWordTypes(String[] wordTypes) {
		this.wordTypes = wordTypes;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

}
