
public class Launcher {

	public static void main(String[] args) {
		NoteStore n = new NoteStore();
		
		n.storeNote("image note 1", "url 1");
		n.storeNote("image note 2", "url 2");
		n.storeNote("text note 1");
		n.storeNote("text note 1");
		
		n.getAllTextNotes();
		n.getAllTextAndImagesNotes();
	}
}
