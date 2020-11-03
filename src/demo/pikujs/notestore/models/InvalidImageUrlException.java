package demo.pikujs.notestore.models;

public class InvalidImageUrlException extends Exception {

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "We only accept JPG(.jpg) and PNG(.png) Images.";
	}
	
}
