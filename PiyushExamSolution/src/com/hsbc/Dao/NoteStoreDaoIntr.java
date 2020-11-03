package com.hsbc.Dao;

import com.hsbc.Notes;

public interface NoteStoreDaoIntr {
	public void storeNote(String note, String imageurl);
	public void storeNote(String note);
	public void getAllTextNotes();
	public void getAllTextAndImageNotes();
}
