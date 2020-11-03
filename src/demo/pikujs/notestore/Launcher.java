package demo.pikujs.notestore;

import demo.pikujs.notestore.models.*;
public class Launcher {
	private static NoteStore noteStore;
	
	public static void displayTextNotes() {
		int i = 0;
		for(Note n : noteStore.getTextNotes())
			System.out.println("Text Note " + ++i + ": " + n);
	}
	
	public static void displayTextAndImageNotes() {
		int i = 0;
		for(Note n : noteStore.getTextAndImageNotes())
			System.out.println("Text and Image Note " + ++i + ": " + n);
	}
	
	public static void main(String[] args) {
		noteStore = new NoteStore();
		
		noteStore.storeNote("Java is a set of Computer...");
		noteStore.storeNote("Few Books to read...");
		
		noteStore.storeNote("The size label of...", "//foo/bar1/imgset1");
		noteStore.storeNote("The shopping list...", "//foo/bar2/imgset2.jpg");
		noteStore.storeNote("The size label of...", "//foo/bar3/imgset3.png");
		
		displayTextNotes();
		displayTextAndImageNotes();
	}
}
