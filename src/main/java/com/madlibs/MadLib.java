package com.madlibs;


public class MadLib {
	
//	private String sender;
	private int id;
	private String title;
	private String story;
	private int inputNumber;
	private String tag;
	private String[] wordTypes;
	
	
	public MadLib(int id, String title, String story, int inputNumber, String tag, String[] wordTypes) {
		super();
		this.id = id;
		this.title = title;
		this.story = story;
		this.inputNumber = inputNumber;
		this.wordTypes = wordTypes;
		this.tag = tag;
	}

	public MadLib(int id, String title, String story, int inputNumber, String[] wordTypes) {
		super();
		this.id = id;
		this.title = title;
		this.story = story;
		this.inputNumber = inputNumber;
		this.wordTypes = wordTypes;
	}

	public MadLib(String story, int inputNumber,  String tag, String[] wordTypes) {
		super();
		this.story = story;
		this.inputNumber = inputNumber;
		this.wordTypes = wordTypes;
		this.tag = tag;
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

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

}
