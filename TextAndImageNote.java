package exam;

public class TextAndImageNote {
	String text, url;

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

	public TextAndImageNote(String text, String url) {
		super();
		this.text = text;
		this.url = url;
	}

	@Override
	public String toString() {
		return " : " +  text + ", " + url ;
	}

}
