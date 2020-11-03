package com.notes.launcher;

import java.util.ArrayList;

import com.notes.TextAndImageNote;
import com.notes.TextNote;
import com.notes.store.NoteStore;

public class Launcher {
	
	NoteStore store = new NoteStore();

public static void displayTextNotes(NoteStore store) {
ArrayList<TextNote> T = store.GetAllTextNotes();
int i = 1;
for (TextNote tn : T) {
System.out.print("Text Note ");
System.out.print(i);
System.out.println(tn);
i++;
}
}

public static void displayTextAndImageNotes(NoteStore store) {
ArrayList<TextAndImageNote> T = store.GetAllTextAndImageNotes();
int i = 1;
for (TextAndImageNote ti : T) {
System.out.print("Text And Image Note ");
System.out.print(i);
System.out.println(ti);
i++;
}
}


public static void main(String[] args) {

TextNote T1 = new TextNote("Java is a set of computer software and specifications developed by James Gosling at Sun Microsystems.");
TextNote T2 = new TextNote("few Books to read - Ikigai, How to win friends and influence people");

TextAndImageNote TI1 = new TextAndImageNote("The shopping list on my fridge","//foo/bar/bar1/bar2/imgset1.jpg");
TextAndImageNote TI2 = new TextAndImageNote("The size label of Jack's shirt","//foo/bar/bar1/bar2/imgset2.jpg");

NoteStore store = new NoteStore();

store.StoreNote(TI1);
store.StoreNote(TI2);

store.StoreNote(T1);
store.StoreNote(T2);


displayTextNotes(store);
displayTextAndImageNotes(store);

}

}
