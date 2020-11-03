package TestOctober;

import java.util.ArrayList;
import java.util.Scanner;

public class NoteStore {
	
	ArrayList<TextNote> txtNotes;
	ArrayList<TextAndImageNote> txtImageNotes;
	
	public NoteStore(ArrayList<TextNote> txtNotes, ArrayList<TextAndImageNote> txtImageNotes) {
		super();
		this.txtNotes = txtNotes;
		this.txtImageNotes = txtImageNotes;
	}

	public NoteStore() {
		super();
	}
	
	public void storeNote(String txt) {
		TextNote note = new TextNote(txt);
		txtNotes.add(note);
	}
	
	public void storeNote(String txt, String imgUrl) {
		TextAndImageNote note = new TextAndImageNote(txt, imgUrl);
		txtImageNotes.add(note);
	}
	
	public ArrayList<TextNote> getAllTextNotes(){
		return txtNotes;
	}
	
	public ArrayList<TextAndImageNote> getAllTextAndImageNotes(){
		return txtImageNotes;
	}
	
}
