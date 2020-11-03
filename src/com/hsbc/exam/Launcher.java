package com.hsbc.exam;

import java.util.ArrayList;

public class Launcher {

	private static NoteStore store = new NoteStore();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// text notes
		store.storeNote(
				"Java is a set of computer software and specifications developed by James Gosling at Sun Microsystems");
		store.storeNote("Few books to read - Ikigai, How to win friends and influence people");

		// text and image notes
		store.storeNote("The shopping list on my fridge", "foo/bar1/bar2/imageset1.jpg");
		store.storeNote("The size label of Jack's shirt", "foo/bar1/bar2/imageset2.jpg");

		// display method
		displayTextNotes();
		displayTextAndImageNotes();
		
	}

	public static void displayTextNotes() {
		System.out.println("All text notes : ");
		ArrayList<TextNote> list = store.getAllTextNotes();
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Text Note " + (i + 1) + " : " + list.get(i).getNote());
		}
		System.out.println("_________");
	}

	public static void displayTextAndImageNotes() {
		System.out.println("All text and image  notes : ");
		ArrayList<TextAndImageNote> list = store.getAllTextAndImageNotes();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(
					"Text and Image Note " + (i + 1) + " : " + list.get(i).getNote() + " , //" + list.get(i).getUrl());
		}
		System.out.println("_________");
	}
}