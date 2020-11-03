package com.hsbc.dao;


import com.hsbc.method.TextAndImageNote;
import com.hsbc.method.TextNote;
import java.util.ArrayList;
import java.util.Scanner;



public class NoteStoreDao implements NoteStoreDaoIntf{
	
	private ArrayList<TextNote> textnotes = new ArrayList<>();
	private ArrayList<TextAndImageNote> textandimage = new ArrayList<>();
	
	

	public ArrayList<TextNote> getTextnotes() {
		return textnotes;
	}

	public void setTextnotes(ArrayList<TextNote> textnotes) {
		this.textnotes = textnotes;
	}

	public ArrayList<TextAndImageNote> getTextandimage() {
		return textandimage;
	}

	public void setTextandimage(ArrayList<TextAndImageNote> textandimage) {
		this.textandimage = textandimage;
	}

	@Override
	public void storeNote() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Your Option!!");
		System.out.println("1. Want to store a TextNote!!");
		System.out.println("2. Want to store a TextAndImageNote!!");
		int option = sc.nextInt();
		if(option == 1) {
			System.out.println("Enter Your TextNote");
			String text = sc.next();
			textnotes.add(new TextNote(text));
			System.out.println("Done");
		}
		else {
			System.out.println("Enter Your TextNote");
			String text = sc.next();
			System.out.println("Enter Your TextAndImageNote");
			String imageurl = sc.next();
			textandimage.add(new TextAndImageNote(text,imageurl));
			System.out.println("Done");
		}
		
	}

	@Override
	public void getAllTextNotes() {
		int id = 0;
		for(TextNote i : textnotes) {
			id++;
			String msg = i.display();
			System.out.println("Text Note " + id + " : " + msg);
		}	
	}

	@Override
	public void getAllTextAndImageNotes() {
		int id = 0;
		for(TextAndImageNote i : textandimage) {
			id++;
			String msg = i.display();
			System.out.println("Text And Image Note " + id + " : " + msg);
		}
		// TODO Auto-generated method stub
		
	}

}
