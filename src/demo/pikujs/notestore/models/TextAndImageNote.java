package demo.pikujs.notestore.models;

public class TextAndImageNote implements Note {
	private int noteId;
	private String text, url;
	private static int maxId = 0;
	
	public TextAndImageNote(String message, String url) {
		this.noteId = ++maxId;
		this.text = message;
		this.url = url;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public int getNoteId() {
		return noteId;
	}

	@Override
	public String toString() {
		return text + ", " + url;
	}
	
	

}
