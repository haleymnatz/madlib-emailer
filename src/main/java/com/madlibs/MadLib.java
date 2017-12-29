package com.madlibs;

import java.util.Arrays;

public class MadLib {
	
//	private String sender;
	private int id;
	private String title;
	private String story;
	private int inputNumber;
	private String[] wordTypes;
	private String[] userInputs;
	
	
	public MadLib(int id, String title, String story, int inputNumber, String[] wordTypes, String[] userInputs) {
		super();
		this.id = id;
		this.title = title;
		this.story = story;
		this.inputNumber = inputNumber;
		this.wordTypes = wordTypes;
		this.userInputs = userInputs;
	}

	public MadLib(int id, String title, String story, int inputNumber, String[] wordTypes) {
		super();
		this.id = id;
		this.title = title;
		this.story = story;
		this.inputNumber = inputNumber;
		this.wordTypes = wordTypes;
	}

	public MadLib(String story, int inputNumber, String[] wordTypes, String[] userInputs) {
		super();
		this.story = story;
		this.inputNumber = inputNumber;
		this.wordTypes = wordTypes;
		this.userInputs = userInputs;
	}

	public MadLib(String story, int inputNumber, String[] wordTypes) {
		super();
		this.story = story;
		this.inputNumber = inputNumber;
		this.wordTypes = wordTypes;
	}
	
	public MadLib() {}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String[] getUserInputs() {
		return userInputs;
	}

	public void setUserInputs(String[] userInputs) {
		this.userInputs = userInputs;
	}

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
