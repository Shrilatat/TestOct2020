package examProject;
import java.util.*;
public class Launcher extends NoteStore{
	
	
	public Launcher() {
	}

	public void displayTextNotes(NoteStore ns) {
		List<TextNote> answer = ns.getAllTextNotes();
		for(Notes no:answer) {
			no.displayTextNotes();
		}
	}
	
	public void displayTextAndImageNotes(NoteStore ns) {
		List<TextAndImageNote> answer = ns.getAllTextAndImageNotes();
		for(Notes no:answer) {
			no.displayTextAndImageNotes();
		}
	}
	
	public static void main(String[] args) {
		Notes n1 = new TextNote("First Notes welcome");
		Notes n2 = new TextNote("Second TextNote Heloo");
		
		Notes n3 = new TextAndImageNote("first image note","abs.bd");
		Notes n4 = new TextAndImageNote("second image note","and/gh");
		
		NoteStore dao = new NoteStore();
		dao.Storenote(n1);
		dao.Storenote(n2);
		dao.Storenote(n3);
		dao.Storenote(n4);
		
		Launcher lon = new Launcher();
		lon.displayTextNotes(dao);
		lon.displayTextAndImageNotes(dao);
		
	}	

}
