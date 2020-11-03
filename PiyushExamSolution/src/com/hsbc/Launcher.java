package com.hsbc;

import com.hsbc.Dao.NoteStoreDao;

public class Launcher {
	public static void main(String[] args) {
		NoteStoreDao nsd = new NoteStoreDao();
		nsd.storeNote("Java is a set of computer software and specifications developed by James Gosling at Sun Microsystem");
		nsd.storeNote("Few books to read-Ikigai, How to win friends and influence people");
		nsd.storeNote("The shopping list on my fridge", "//foo/bar1/bar2/imgset1.jpg");
		nsd.storeNote("The size label of Jack's shirt", "//foo/bar1/bar2/imgset2.jpg");
		nsd.getAllTextAndImageNotes();
		nsd.getAllTextNotes();
	}
}
