package com.abc.entities;

import com.abc.model.Notes;

public class TextNote implements Notes{
	
	private String text;
	
	public TextNote() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TextNote(String text) {
		super();
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String displayNote() {
		return text;
	}

	@Override
	public int noteType() { //noteType 0 for text notes.
		return 0;
	}

}
