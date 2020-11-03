package test.hsbc;
/*
 * This is TextAndImageNote class which only contains the text and url as strings.
 * Getter and setter methods are used.
 * Constructor which can be initialised with text and url is there along with the default constructor
 * 
 * 
 */

public class TextAndImageNote {

	String text,url;


	public TextAndImageNote() {
		
	}
	
	
	public TextAndImageNote(String text, String url) {
		super();
		this.text = text;
		this.url = url;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}
	
}
