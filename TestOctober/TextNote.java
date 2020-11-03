package TestOctober;

public class TextNote{

    private String text;
    
	public TextNote(String txt) {
		this.text = text;
	}

	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}

	public void showDetails() {
		System.out.println("Note [text=" + text + "]");
	}

}
