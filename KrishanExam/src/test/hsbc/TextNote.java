package test.hsbc;
/*
 * This is TextNote class which only contains the plainset.
 * Getter and setter methods are used.
 * Constructor which can be initialised with plaintext is there along with the default constructor
 * 
 * 
 */


public class TextNote {

	String plainText;

	public TextNote() {
		
	}
	
	public TextNote(String plainText) {
		super();
		this.plainText = plainText;
	}

	public String getPlainText() {
		return plainText;
	}

	public void setPlainText(String plainText) {
		this.plainText = plainText;
	}
	
}
