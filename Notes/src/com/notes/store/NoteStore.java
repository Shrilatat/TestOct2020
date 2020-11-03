package com.notes.store;

import java.util.ArrayList;

import com.notes.TextAndImageNote;
import com.notes.TextNote;

public class NoteStore{
	
	ArrayList<TextNote> Textnotes = new ArrayList<>();
	 ArrayList<TextAndImageNote> Textandimagenotes = new ArrayList<>();

	 public void StoreNote(TextNote note) {
	 Textnotes.add(note);
	 }

	 public void StoreNote(TextAndImageNote note) {
	 Textandimagenotes.add(note);
	 }

	 public ArrayList<TextNote> GetAllTextNotes(){
	 return Textnotes;
	 }

	 public ArrayList<TextAndImageNote> GetAllTextAndImageNotes(){
	 return Textandimagenotes;
	 }

}
