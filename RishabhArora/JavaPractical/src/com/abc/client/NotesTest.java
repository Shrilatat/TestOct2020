package com.abc.client;

import java.util.ArrayList;
import java.util.List;

import com.abc.dao.NoteStore;
import com.abc.model.Notes;

public class NotesTest {
	public static void main(String[] args) {
		NoteStore ns = new NoteStore();
		ns.storeNote("Java is a set of computer software and applications developed by James Gosling at Sun.", null);	
		ns.storeNote("few books to read - Ikigai, How to win freinds and influence people.", null);
		ns.storeNote("The shopping list is on my fridge.", "//foo/bar1/bar2/imgset1.jpg");
		ns.storeNote("The size label of jacks shirt.", "//foo/bar1/bar2/imgset2.jpg");
		
		List<Notes> allTAndINotes = ns.getAllTextAndImagesNotes();
		List<Notes> allTextNotes = ns.getAllTextNotes();
		
		int i = 1;
		for (Notes n : allTextNotes) {
			System.out.println("Text Note "+i+". "+n.displayNote());
			i = i +1;
		}
		
		i = 1;
		for (Notes n : allTAndINotes) {
			System.out.println("Text and Image Note "+i+". "+n.displayNote());
			i = i +1;
		}
	}
}
