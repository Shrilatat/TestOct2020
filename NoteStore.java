package exam;

import java.util.ArrayList;

public class NoteStore {
	
	ArrayList<TextNote> Textnotes = new ArrayList<>();
	ArrayList<TextAndImageNote> Textandimagenotes = new ArrayList<>();
	
	void StoreNote(TextNote note) {
		Textnotes.add(note);
	}
	
	void StoreNote(TextAndImageNote note) {
		Textandimagenotes.add(note);
	}
	
	ArrayList<TextNote> GetAllTextNotes(){
		return Textnotes;
	}
	
	ArrayList<TextAndImageNote> GetAllTextAndImageNotes(){
		return Textandimagenotes;
	}

}
