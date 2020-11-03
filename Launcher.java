package com.req3;

import java.util.ArrayList;

import com.req1.a.TextNote;
import com.req1.b.TextAndImageNote;
import com.req2.a.NoteStore;

//Launcher class to execute the operations of the Note Store class
public class Launcher {
	
	public void displayTextNotes(NoteStore notes) {
		ArrayList<TextNote> tnotes=notes.getAllTextNotes();
		
		int i=1;
		for(TextNote tnote: tnotes) {
			System.out.println("Text Note "+ i + " : " + tnote.getPtext());
			i++;
		}
	}
	
	public void displayTextAndImageNotes(NoteStore notes) {	
		ArrayList<TextAndImageNote> imagenotes=notes.getAllTextAndImageNotes();
		
		int i=1;
		for(TextAndImageNote imagenote: imagenotes) {
			System.out.println("Text And Image Note "+ i + " : " + imagenote.getPtext() + "," + imagenote.getImage_url());
			i++;
		}
	}
	
	public static void main(String[] args) {
		NoteStore notes=new NoteStore();
		Launcher launch=new Launcher();
		
		notes.storeNote("Only Plain Text 1");
		notes.storeNote("Only Plain Text 2");
		
		notes.storeNote("Plain Text 1", "image.url1");
		notes.storeNote("Plain Text 2", "image.url2");
		
		launch.displayTextNotes(notes);
		launch.displayTextAndImageNotes(notes);
	}
}
