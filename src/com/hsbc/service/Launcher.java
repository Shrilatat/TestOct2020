package com.hsbc.service;

import java.util.ArrayList;
import com.hsbc.dao.NoteStore;
import com.hsbc.model.Notes;
import com.hsbc.model.TextAndImageNote;

public class Launcher {
	
	
	public void displayTextNotes(NoteStore store) {
		
			ArrayList<Notes> text_list = store.getAllTextNotes();
			
			int count =1;
			for(Notes note : text_list) {
				System.out.println("Text Note " + count + ": ");
				note.display();
				count = count+1;
			}
		
	}
	
	public void displayTextAndImageNotes(NoteStore store) {
		
		ArrayList<Notes> text_list = store.getAllTextAndImageNotes();
		
		System.out.println();
		
		
		int count =1;
		for(Notes note : text_list) { 
			
			System.out.println("Text and Image Note " + count + ": " );
			note.display(); 
			count = count+1;
		}
		
		
	}

	
	public static void main(String[] args) {
		
		
		NoteStore mystore = new NoteStore();
		
		
		mystore.storeNote("Java is a set of computer software and specifications");
		mystore.storeNote("Few books to Read");
		mystore.storeNote("My shopping list", "bin/myimage.jpg");
		mystore.storeNote("Size label", "bin/size.jpg");
		
		
		Launcher myclient = new Launcher();
		
		
		myclient.displayTextNotes(mystore);
		myclient.displayTextAndImageNotes(mystore);
		
		
		
		
		
	}
}
