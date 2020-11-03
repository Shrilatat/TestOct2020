import java.util.ArrayList;

public class NoteStore {

	
	private ArrayList<Notes> allNotes = new ArrayList<>();

	
	public void storeNote(String text) {
		Notes note = new TextNote(text);
		allNotes.add(note);
	}
	
	public void storeNote(String text, String imgUrl) {
		Notes note = new TextAndImageNote(text,imgUrl);
		allNotes.add(note);
	}
	
	
	public void getAllTextNotes() {
	
		for (Notes n :allNotes) {
			if(n.type() == "TEXT") {
				System.out.println(n);
			}
		}
	
	}

	
	public void getAllTextAndImagesNotes() {
		
		for (Notes n : allNotes) {
			if(n.type() == "IMAGE") {
				System.out.println(n);
			}
		}
		
	}


	
	
	
}
