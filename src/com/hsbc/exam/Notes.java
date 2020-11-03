package com.hsbc.exam;

public abstract class Notes {
	private String text;
	public String typ;
	
	public Notes() {
		
	}
	@Override
	public String toString() {
		return "Notes [text=" + text + "]";
	}
	public Notes(String text) {
		super();
		this.text = text;
	}
	
}
