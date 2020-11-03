package com.demo.dao;

import java.util.*;

import com.demo.bean.Note;

public interface NoteStoreIntf {
	
	
	public ArrayList getAllTextNotes();
	public ArrayList getAllTextAndImageNotes();
	public void storeNote(Note note1);
}
