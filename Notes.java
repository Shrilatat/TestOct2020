package examProject;

public class Notes {
	private String text;
	private String image;

	public Notes() {
	}

	public Notes(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setText(String text) {
		this.text = text;
	}
}
