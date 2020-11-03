package com.demo.dao;

import java.util.ArrayList;

import com.demo.bean.Note;

public class NoteStore implements NoteStoreIntf{

	private ArrayList<Note> allNotes = new ArrayList<>();
	
	public void storeNote(Note note) {
		allNotes.add(note);
	}
	
	public ArrayList getAllTextNotes() {
		ArrayList<Note> alltext = new ArrayList<>();
		for(Note n:allNotes) {
			if(n.getType()=="typeNote") {
				alltext.add(n);
			}
		}
		return alltext;
	}
	
	
	public ArrayList getAllTextAndImageNotes() {
		ArrayList<Note> alltextimg = new ArrayList<>();
		for(Note n:allNotes) {
			if(n.getType()=="typeImage") {
				alltextimg.add(n);
			}
		}
		return alltextimg;
	}
}
