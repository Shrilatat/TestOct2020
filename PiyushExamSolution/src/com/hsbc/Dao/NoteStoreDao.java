package com.hsbc.Dao;

import java.util.ArrayList;

import com.hsbc.Notes;
import com.hsbc.TextAndImageNote;
import com.hsbc.TextNote;

public class NoteStoreDao implements NoteStoreDaoIntr{
	ArrayList<Notes> textnotes = new ArrayList<>();
	ArrayList<Notes> textnotesAndimage = new ArrayList<>();
	public void storeNote(String note) {
		Notes n = new TextNote(note);
		textnotes.add(n);
	}
	public void storeNote(String note, String imageurl) {
		Notes n = new TextAndImageNote(note, imageurl);
		textnotesAndimage.add(n);
	}
	public void getAllTextNotes() {
		if(!textnotes.isEmpty()) {
			for(Notes n: textnotes) {
				System.out.println("Text Note: "+n);
			}
		}else {
			System.out.println("There is no note with only text");
		}
		
	}
	public void getAllTextAndImageNotes() {
		if(!textnotesAndimage.isEmpty()) {
			for(Notes n: textnotesAndimage) {
				System.out.println("Text and Image Note: "+n);
			}
		}else{
			System.out.println("There is no note with text and image");
		}
	}
}
