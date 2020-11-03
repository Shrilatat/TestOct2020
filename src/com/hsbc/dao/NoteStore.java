package com.hsbc.dao;

import java.util.ArrayList;

import com.hsbc.model.Notes;
import com.hsbc.model.TextAndImageNote;
import com.hsbc.model.TextNote;

public class NoteStore {
	
	ArrayList<Notes> store = new ArrayList<>();
	
	
	public void storeNote(String msg) {
		
		TextNote newtext = new TextNote(msg);
		store.add(newtext);
		
	}
	
	public void storeNote(String msg, String url ) {
		
		
		TextAndImageNote newimage = new TextAndImageNote(msg, url);
		
		store.add(newimage);
		
	}
	
	public ArrayList<Notes> getAllTextNotes(){
		
		ArrayList<Notes> mylist = new ArrayList<>();
		
		for(Notes n : mylist) {
			if(n.nytpe() == 1) {
				mylist.add(n);
				
			}
		}
		
		
		return mylist;
		
	}
	public ArrayList<Notes> getAllTextAndImageNotes(){
		
		ArrayList<Notes> mylist= new ArrayList<>();
		
		for(Notes n : mylist) {
			if(n.nytpe() == 2) {
				System.out.println(" check");
				mylist.add(n);
				
			}
		}
		
		
		
		return mylist;
		
	}
	
	

}
