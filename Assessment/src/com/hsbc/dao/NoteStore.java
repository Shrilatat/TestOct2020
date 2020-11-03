package com.hsbc.dao;

import java.util.ArrayList;

import com.hsbc.model.TextAndImageNote;
import com.hsbc.model.TextNote;

public class NoteStore{
	
	private ArrayList<TextNote> textNotes = new ArrayList<>();
	private ArrayList<TextAndImageNote> textAndImgNotes = new ArrayList<>();
	
	public NoteStore(ArrayList<TextNote> textNotes, ArrayList<TextAndImageNote> textAndImgNotes) {
		super();
		this.textNotes = textNotes;
		this.textAndImgNotes = textAndImgNotes;
	}
	

	public NoteStore() {
		// TODO Auto-generated constructor stub
	}


	public void storeNote(String msg) {
		TextNote note = new TextNote(msg);
		textNotes.add(note);	
	}
	
	public void storeNote(String msg, String url) {
		TextAndImageNote note = new TextAndImageNote(msg, url);
		textAndImgNotes.add(note);
		
	}

	public ArrayList<TextNote> getAllTextNotes() {
		return  textNotes;
	}

	public ArrayList<TextAndImageNote> getAllTextAndImageNotes() {
		return textAndImgNotes;
	}
	
	
}
