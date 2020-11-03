package com.demo.test;

import java.util.ArrayList;

import com.demo.bean.Note;
import com.demo.bean.TextAndImageNote;
import com.demo.bean.TextNote;
import com.demo.dao.NoteStore;
import com.demo.dao.NoteStoreIntf;

public class Launcher {
	
	
	
	public static void main(String[] args) {
		
		NoteStoreIntf noteStore = new NoteStore();
		
		
		String text1 = "Java is a set of computer software and specifications";
		String text2 = "Few books to read - Ikigai, How to win friends and influence people";
		
		String text3 = "The shopping list on my fridge";
		String imageUrl1 = "//foo/bar1/bar2/imgset1.jpg";
		
		String text4 = "The size label of Jack's shirt";
		String imageUrl2 = "//foo/bar1/bar2/imgset2.jpg\"";
		
		Note note1 = new TextNote(text1);
		Note note2 = new TextNote(text2);
		
		Note note3 = new TextAndImageNote(text3,imageUrl1);
		Note note4 = new TextAndImageNote(text4,imageUrl2);
		
		
		
		noteStore.storeNote(note1);
		noteStore.storeNote(note2);
		noteStore.storeNote(note3);
		noteStore.storeNote(note4);
		
		
		ArrayList<Note> a = new ArrayList<>();
		a = noteStore.getAllTextNotes();
		
		ArrayList<Note> b = new ArrayList<>();
		b = noteStore.getAllTextAndImageNotes();
		
		System.out.println(note4);
		
		for(Note i:a) {
			System.out.println(i);
		}
		
		for(Note j:b) {
			System.out.println(j);
		}
		
		
		
	}
}
