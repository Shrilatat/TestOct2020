package exam;

import java.util.ArrayList;

public class Launcher {
	
	public static void displayTextNotes(NoteStore store) {
		ArrayList<TextNote> TN = store.GetAllTextNotes();
		int i = 1;
		for (TextNote tn : TN) {
			System.out.print("Text Note ");
			System.out.print(i);
			System.out.println(tn);
			i++;
		}
	}
	
	public static void displayTextAndImageNotes(NoteStore store) {
		ArrayList<TextAndImageNote> TI = store.GetAllTextAndImageNotes();		
		int i = 1;
		for (TextAndImageNote ti : TI) {
			System.out.print("Text And Image Note ");
			System.out.print(i);
			System.out.println(ti);
			i++;
		}
	}
	
	
	public static void main(String[] args) {
		
		TextNote TN1 = new TextNote("Java is a set of computer software and specifications developed by James Gosling at Sun Microsystems.");
		TextNote TN2 = new TextNote("few Books to read - Ikigai, How to win friends and influence people");
		
		TextAndImageNote TI1 = new TextAndImageNote("The shopping list on my fridge","//foo/bar/bar1/bar2/imgset1.jpg");
		TextAndImageNote TI2 = new TextAndImageNote("The size label of Jack's shirt","//foo/bar/bar1/bar2/imgset2.jpg");
		
		NoteStore store = new NoteStore();
		
		store.StoreNote(TN1);
		store.StoreNote(TN2);
		
		store.StoreNote(TI1);
		store.StoreNote(TI2);	
		
		displayTextNotes(store);
		displayTextAndImageNotes(store);
		
	}

}
