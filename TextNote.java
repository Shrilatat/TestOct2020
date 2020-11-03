package exam;

public class TextNote {
	
	String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public TextNote(String text) {
		super();
		this.text = text;
	}

	@Override
	public String toString() {
		
		return " : " + text ;
	}


}
