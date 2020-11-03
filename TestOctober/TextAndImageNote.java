package TestOctober;

public class TextAndImageNote {
	
	private String text, imgURL;

	public TextAndImageNote(String text, String imgURL) {
		this.text = text;
		this.imgURL = imgURL;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getImgURL() {
		return imgURL;
	}

	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}

	public void showDetails() {
		System.out.println("TextAndImageNote [text=" + text + ", imgURL=" + imgURL + "]");
	}
	

}
