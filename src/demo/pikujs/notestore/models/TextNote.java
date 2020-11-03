package demo.pikujs.notestore.models;

public class TextNote implements Note {
	private int noteId;
	private String text;
	private static int maxId = 0;
	
	public TextNote(String message) {
		this.noteId = ++maxId;
		this.text = message;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	@Override
	public int getNoteId() {
		return noteId;
	}

	@Override
	public String toString() {
		return this.text;
	}

	
	
	
}
