package com.hsbc.storenote;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.notes.TextAndImageNote;
import com.hsbc.notes.TextNote;

public class NoteStore {
	
	private List<TextAndImageNote> tain = new ArrayList<>();
	private List<TextNote> tn = new ArrayList<>();
	
	public void storeNote(String note)
	{
		TextNote a = new TextNote(note);
		tn.add(a);
	}
	
	
	public void storeNote(String note , String url)
	{
		TextAndImageNote a = new TextAndImageNote(note,url);
		
		tain.add(a);
		
	}


	public List<TextAndImageNote> getAllTextAndImageNotes() {
		return tain;
	}

	public List<TextNote> getAllTextNotes() {
		return tn;
	}


	
	
	

}
