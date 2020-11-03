package com.hsbc;

import java.util.ArrayList;

import com.hsbc.Dao.NoteStore;


public class Launcher {

	public Launcher() {
		super();
	}

	public static void main(String[] args) {

		NoteStore store = new NoteStore();
		
		store.storeNote("The shopping list on my fridge", "//foo/bar1/bar2/imgset1.jpg");
		store.storeNote("The size label of Jack's shirt", "//foo/bar1/bar2/imgset2.jpg");
		
		store.storeNote("Java is a set of computer software and specifications developed by James Gosling at Sun Microsystems.");
		store.storeNote("Few books to read -Ikigai, How to win friends and influence people.");

		

		Launcher launcher = new Launcher();
		launcher.displayTextNotes(store);
		launcher.displayTextAndImagesNotes(store);
	}

	public void displayTextAndImagesNotes(NoteStore x) {
		int j = 1;

		for (TextAndImageNote t : x.getAllTextAndImageNotes()) {
			System.out.println("textAndImageNote " + j + " " +  t.getText() + "  " + ((TextAndImageNote) t).getUrl());
			j = j++;
		}
		

	}
	public void displayTextNotes(NoteStore x) {
		int j = 1;
		for (TextNote t : x.getAllTextNotes()) {
			System.out.println("textnote " + j + " " + t.getText());
			j = j++;
		}

	}


}