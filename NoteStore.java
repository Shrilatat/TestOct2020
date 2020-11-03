package com.req2.a;

import java.util.ArrayList;

import com.req1.a.TextNote;
import com.req1.b.TextAndImageNote;

public class NoteStore {
	
	TextNote tNote;
	TextAndImageNote imgNote;
	
	ArrayList<TextNote> tNoteList= new ArrayList<>();
	ArrayList<TextAndImageNote> imageNoteList= new ArrayList<>();
	
	public void storeNote(String ptext) {
		tNoteList.add(new TextNote(ptext));
	}
	
	public void storeNote(String ptext, String imagetext) {
		imageNoteList.add(new TextAndImageNote(ptext, imagetext));
	}
	
	public ArrayList<TextNote> getAllTextNotes() {
		return tNoteList;
	}
	
	public ArrayList<TextAndImageNote> getAllTextAndImageNotes() {
		return imageNoteList;
	}
	
	
}
