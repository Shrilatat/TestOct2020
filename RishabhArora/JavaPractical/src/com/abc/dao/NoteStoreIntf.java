package com.abc.dao;

import java.util.List;

import com.abc.model.Notes;


public interface NoteStoreIntf {
	public void storeNote(String text,String imgUrl);
	public List<Notes> getAllTextNotes();
	public List<Notes> getAllTextAndImagesNotes();
}
