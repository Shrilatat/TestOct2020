/* Title : Launcher
 * Use : To test the NoteStore operations
 * By : Arjun Dev
 * Date : 11/03/2020
 */

public class Launcher {
	
	public void displayTextNotes(NoteStore n) {        //method to print text notes
		n.getAllTextNotes();
	}
	
	public void displayTextAndImageNotes(NoteStore n) {     //method to print text and image notes
		n.getAllTextAndImageNotes();
	}
	
	public static void main(String[] args) {              //main method to test the Notestore methods
		NoteStore n1 = new NoteStore();
		n1.storeNote("Text and Image Note1", "url1");
		n1.storeNote("Text Note1", "");
	    n1.storeNote("Text and Image Note2", "url2");
	    n1.storeNote("Text Note2", "");
	    
	    Launcher l = new Launcher();
	    l.displayTextNotes(n1);
	    l.displayTextAndImageNotes(n1);
	    
	}

}
