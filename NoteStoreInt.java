package examProject;

public interface NoteStoreInt {
	
	public void StoreNote(TextNote notes);
	
	public void Storenote(TextAndImageNote notes);
	
	public TextNote getAllTextNotes();
	
	public TextAndImageNote getAllTextAndImageNotes();

}
