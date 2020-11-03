package com.hsbc.launcher;

import java.util.ArrayList;
import java.util.Scanner;

import com.hsbc.dao.NoteStoreDao;
import com.hsbc.method.TextAndImageNote;
import com.hsbc.method.TextNote;

public class Launcher {
	private NoteStoreDao work = new NoteStoreDao();
	
	public NoteStoreDao getWork() {
		return work;
	}

	public void setWork(NoteStoreDao work) {
		this.work = work;
	}

	public void displayTextNotes() {
		
		work.getAllTextNotes();
		
	}
	
	public void displayTextandImageNotes() {
		work.getAllTextAndImageNotes();
	}
	
	public static void main(String[] args) {
		
		Launcher test = new Launcher();
		
		NoteStoreDao samp = test.getWork();
		
		samp.getTextnotes().add(new TextNote("Hello World!!"));
		samp.getTextnotes().add(new TextNote("How are you doing !!"));
		
		samp.getTextandimage().add(new TextAndImageNote("This is url of a picture of sun","https://www.google.com/imgres?imgurl=https%3A%2F%2Fupload.wikimedia.org%2Fwikipedia%2Fcommons%2Fthumb%2Fb%2Fb4%2FThe_Sun_by_the_Atmospheric_Imaging_Assembly_of_NASA%2527s_Solar_Dynamics_Observatory_-_20100819.jpg%2F220px-The_Sun_by_the_Atmospheric_Imaging_Assembly_of_NASA%2527s_Solar_Dynamics_Observatory_-_20100819.jpg&imgrefurl=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FSun&tbnid=RvaNwK_t3Ie5XM&vet=12ahUKEwjFsJj_o-bsAhVsk0sFHY9jCb0QMygBegUIARDRAQ..i&docid=aeRgGJIjF3qNpM&w=220&h=210&q=sun%20pictures&ved=2ahUKEwjFsJj_o-bsAhVsk0sFHY9jCb0QMygBegUIARDRAQ"));
		samp.getTextandimage().add(new TextAndImageNote("This is url of a picture of moon","https://www.google.com/imgres?imgurl=https%3A%2F%2Fcdn.pixabay.com%2Fphoto%2F2016%2F11%2F25%2F23%2F15%2Fmoon-1859616__340.jpg&imgrefurl=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fmoon%2F&tbnid=Y2GJ4MszDlUu5M&vet=12ahUKEwjSspyfpObsAhX9nEsFHQEIDr4QMygCegUIARDYAQ..i&docid=dlfeLKbgAWwO9M&w=510&h=340&q=moon%20pictures&ved=2ahUKEwjSspyfpObsAhX9nEsFHQEIDr4QMygCegUIARDYAQ"));
		
		test.displayTextNotes();
		test.displayTextandImageNotes();
		
		int cur = 1;
		
		System.out.println("Do you want to add any notes? Press 1 if YES else press 2!");
		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();
		if(opt==1) {
			System.out.println("How many notes you want to add?");
			int num = sc.nextInt();
			while(num>0) {
				samp.storeNote();
				num--;
			}
		}
		
		
		
		
	}
}
