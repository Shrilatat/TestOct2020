package com.demo.bean;

public class TextNote extends Note{
	private String text;

	public TextNote(String text) {
		super("typeNote");
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "TextNote [text=" + text + "]";
	}
	
	
}
