package TestOctober;

public class Launcher {

		
	public void displayTextNotes(NoteStore notes) {
		int x = 1;
		for(TextNote i : notes.getAllTextNotes()) {
			System.out.println("Note " + x + " : " + i.getText());
			x++;
		}
	}

	public void displayImageAndTextNotes(NoteStore notes) {
		int x = 1;
		for(TextAndImageNote i : notes.getAllTextAndImageNotes()) {
			System.out.println("Note " + x + " : " + i.getText() + " and image URL is : " + i.getImgURL());
			x++;
		}
	}
	
	private void mains() {
		NoteStore notes = new NoteStore();
		notes.storeNote("Java is a set of computer software and specifications developed by james Gosling at Sun Microsysytems.");
		notes.storeNote("Few books to read - Ikagai, how to win friends and influence people");
		notes.storeNote("The shopping list is on my fridge.", "//foo/bar1/bar2/imgset1.jpg");
		notes.storeNote("The size label of Jack's shirt.",  "//foo/bar1/bar2/imgset2.jpg");
		
		Launcher launcher = new Launcher();
		launcher.displayTextNotes(notes);
		launcher.displayImageAndTextNotes(notes);
	}

}
