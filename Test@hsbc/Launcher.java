package com.hsbc.storenote;

import java.util.List;

import com.hsbc.notes.TextAndImageNote;
import com.hsbc.notes.TextNote;

public class Launcher   {
	
	 NoteStore ns = new NoteStore();
	
	public void displayTextNotes()
	{
		int i = 1;
		List<TextNote> tn = ns.getAllTextNotes();
		
		for(TextNote t : tn)
		{
			
			System.out.println("Text Note " + i +": " + t.getNotes());
			i++;
		}
	}
	
	public void displayTextAndImageNotes()
	{
		List<TextAndImageNote> tn = ns.getAllTextAndImageNotes();
		int j=1 ;
		for(TextAndImageNote t : tn)
		{
			
			System.out.println("Text and Image Note " + j +": " + t.getNotes() + "," + t.getUrl());
			j++;
		}
	}
	
	public void storenote(String s)
	{
		ns.storeNote(s);
	}
	
	public void storenoteimage(String n , String i)
	{
		ns.storeNote(n,i);
	}
	public static void main(String[] args) {
		
		Launcher l = new Launcher();
		
		l.storenote("Java is a set of computer and specifications developed by James Gosling Sun Microsystems");
		l.storenote("Few books to read - Ikigai , How to win friends and influence people");
		 
		l.displayTextNotes();
		
		l.storenoteimage("The shopping list on my fridge" , "//foo/bar/imageset1.jpg");
		l.storenoteimage("The sixe label of jack shirt" , "//foo/bar/imageset2.jpg");
		
		l.displayTextAndImageNotes();
	}

}
