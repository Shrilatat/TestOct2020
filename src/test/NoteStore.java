package test;
import java.util.ArrayList;

public class NoteStore {
	
	private ArrayList<TextAndImageNote> textImageNote = new ArrayList<TextAndImageNote>();
	
	private ArrayList<TextNote> textNote = new ArrayList<TextNote>();
	
	public NoteStore(ArrayList<TextAndImageNote> textImageNote, ArrayList<TextNote> textNote ) {
		super();
		this.textImageNote = textImageNote;
		this.textNote = textNote;
	}
	
	public NoteStore() {
		super();
	}
	
	public void storeNote(String text, String url)
	{
		TextAndImageNote note = new TextAndImageNote(text, url);
		textImageNote.add(note);
	}
	
	public void storeNote(String text)
	{
		TextNote note = new TextNote(text);
		textNote.add(note);
	}
	
	public ArrayList<TextAndImageNote> getTextAndImageNotes() 
	{
		return textImageNote;
		
	}
	
	
	public ArrayList<TextNote> getTextNotes() {
		return textNote;
		
	}
	

}
