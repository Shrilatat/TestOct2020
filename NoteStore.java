package com.hsbc.Dao;

import java.util.ArrayList;

import com.hsbc.TextAndImageNote;
import com.hsbc.TextNote;



public class NoteStore {

	private ArrayList<TextNote> text_notes = new ArrayList<TextNote>();
	private ArrayList<TextAndImageNote> text_image_notes = new ArrayList<TextAndImageNote>();
	
	
	
	public NoteStore(ArrayList<TextNote> text_notes, ArrayList<TextAndImageNote> text_image_notes) {
		super();
		this.text_notes = text_notes;
		this.text_image_notes = text_image_notes;
	}
	public NoteStore() {
		super();


	}

	public void storeNote(String text)
	{
		TextNote note = new TextNote(text);
		text_notes.add(note);
	}

	public void storeNote(String text, String url)
	{
		TextAndImageNote note = new TextAndImageNote(text, url);
		text_image_notes.add(note);
	}

	public ArrayList<TextNote> getAllTextNotes() {
		return text_notes;

	}


	public ArrayList<TextAndImageNote> getAllTextAndImageNotes() 
	{
		return text_image_notes;

	}


}