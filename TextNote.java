package examProject;

public class TextNote extends Notes{
	
	
	public TextNote() {
		super();
	}

	public TextNote(String text) {
		super(text);
	}

	public void displayTextNotes() {
		System.out.println(super.getText());
	}

}
