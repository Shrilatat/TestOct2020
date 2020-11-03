package com.hsbc.client;

import com.hsbc.dao.NoteStore;
import com.hsbc.model.TextAndImageNote;
import com.hsbc.model.TextNote;

public class Launcher {
	
	public void showTextNotes(NoteStore notes) {
		for (TextNote i : notes.getAllTextNotes()) {
			System.out.println("TextNote: "+ i.getText());

		}

	}

	public void showTextAndImagesNotes(NoteStore notes) {

		for (TextAndImageNote i : notes.getAllTextAndImageNotes()) {
			System.out.println("TextAndImageNote: " + i.getImgText() + " , " + i.getImgUrl());

		}

	}

	public static void main(String[] args) {

		NoteStore notesStore = new NoteStore();
		notesStore.storeNote("Java is a set of computer software and specifications developed by James Gosling at Sun Microsystems.");
		notesStore.storeNote("Few books to read -Ikigai, How to win friends and influence people.");

		notesStore.storeNote("The shopping list on my fridge", "//foo/bar1/bar2/imgset1.jpg");
		notesStore.storeNote("The size label of Jack's shirt", "//foo/bar1/bar2/imgset2.jpg");

		Launcher launch = new Launcher();
		launch.showTextNotes(notesStore);
		launch.showTextAndImagesNotes(notesStore);
	}
}
