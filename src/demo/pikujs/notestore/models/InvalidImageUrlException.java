package demo.pikujs.notestore.models;

public class InvalidImageUrlException extends Exception {

	@Override
	public String getMessage() {
		return "We only accept JPG(.jpg) and PNG(.png) Images.";
	}
	
}
