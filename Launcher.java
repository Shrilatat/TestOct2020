package com.hsbc;

import java.util.ArrayList;

public class Launcher {

	public Launcher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void displayTextNotes(NoteStore temp) {
		int j = 1;
		for (TextNote i : temp.getAllTextNotes()) {
			System.out.println("TextNote " + j + ": " + i.getText());
			j = j + 1;

		}

	}

	public void displayTextAndImagesNotes(NoteStore temp) {
		int j = 1;

		for (TextAndImageNote i : temp.getAllTextAndImageNotes()) {
			System.out.println("TextAndImageNote " + j + ": " + i.getText() + " , " + i.getUrl());
			j = j + 1;

		}

	}

	public static void main(String[] args) {

		NoteStore store = new NoteStore();
		store.storeNote(
				"Java is a set of computer software and specifications developed by James Gosling at Sun Microsystems.");
		store.storeNote("Few books to read -Ikigai, How to win friends and influence people.");

		store.storeNote("The shopping list on my fridge", "//foo/bar1/bar2/imgset1.jpg");
		store.storeNote("The size label of Jack's shirt", "//foo/bar1/bar2/imgset2.jpg");

		Launcher launcher = new Launcher();
		launcher.displayTextNotes(store);
		launcher.displayTextAndImagesNotes(store);
	}

}
