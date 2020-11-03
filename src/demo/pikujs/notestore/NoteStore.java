package demo.pikujs.notestore;

import java.util.*;
import demo.pikujs.notestore.models.*;

public class NoteStore {
	private List<Note> notes;
	
	public NoteStore() {
		notes = new ArrayList<>();
	}

	public void storeNote(String message) {
		notes.add(new TextNote(message));
	}

	public void storeNote(String message, String url) {
		try {
			notes.add(new TextAndImageNote(message, url));
		} catch (InvalidImageUrlException e) {
			System.out.println(e.getMessage() + " Please Enter Note again.");
		}
	}
	
	public List<TextNote> getTextNotes(){
		List<TextNote> textNotes = new ArrayList<>();
		for(Note n : notes)
			if(n instanceof TextNote)
				textNotes.add((TextNote) n);
		return textNotes;
	}
	
	public List<TextAndImageNote> getTextAndImageNotes(){
		List<TextAndImageNote> textImageNotes = new ArrayList<>();
		for(Note n : notes)
			if(n instanceof TextAndImageNote)
				textImageNotes.add((TextAndImageNote) n);
		return textImageNotes;
	}
}
