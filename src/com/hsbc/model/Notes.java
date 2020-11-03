package com.hsbc.model;

public class Notes {
	
	private String text;
	
	public Notes(String text) {
		
		this.text = text;
	}

	public Notes() {
		
	}
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	
	public void display() {
		System.out.println(text); ;
	}
	
	public int nytpe() {
		return 0;
	}

	
	

}
