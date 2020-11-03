package test;

public class Launcher {

	public void displayTxtAndImageNote(NoteStore temp) {
		int j = 1;

		for (TextAndImageNote i : temp.getTextAndImageNotes()) {
			System.out.println("TextAndImageNote " + j + ": " + i.getTxt() + " , " + i.getImgTxt());
			j = j + 1;

		}

	}
	
	public void displayTxtNote(NoteStore temp) {
		int j = 1;
		for (TextNote i : temp.getTextNotes()) {
			System.out.println("TextNote " + j + ": " + i.getTxt());
			j = j + 1;

		}

	}

	public static void main(String[] args) {

		NoteStore noteStores = new NoteStore();
		noteStores.storeNote("Java is a set of computer software and specifications developed by James Gosling at Sun Microsystems.");
		noteStores.storeNote("Few books to read -Ikigai, How to win friends and influence people.");

		noteStores.storeNote("The shopping list on my fridge", "//foo/bar1/bar2/imgset1.jpg");
		noteStores.storeNote("The size label of Jack's shirt", "//foo/bar1/bar2/imgset2.jpg");

		Launcher launcher = new Launcher();
		launcher.displayTxtNote(noteStores);
		launcher.displayTxtAndImageNote(noteStores);
	}

}
