package com.hsbc.exam;

import java.util.ArrayList;

public class NoteStore {

	// ArrayList for storing notes
	private ArrayList<TextNote> listText = new ArrayList<>();
	private ArrayList<TextAndImageNote> listTextImage = new ArrayList<>();

	public void storeNote(String note) {
		TextNote noteObj = new TextNote(note);
		listText.add(noteObj);
	}

	public void storeNote(String note, String url) {
		TextAndImageNote noteObj = new TextAndImageNote(note, url);
		listTextImage.add(noteObj);
	}
	
	public ArrayList<TextNote> getAllTextNotes() {
		return listText;
	}
	
	public ArrayList<TextAndImageNote> getAllTextAndImageNotes() {
		return listTextImage;
	}
	

}