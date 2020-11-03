/* Title : TextAndImageNote
 * Use : To store TextAndImageNotes
 * By : Arjun Dev
 * Date : 11/03/2020
 */

public class TextAndImageNote {
	
	String pinote;
	String url;
	public TextAndImageNote(String pinote, String url) {    //Constructor for TextAndImageNotes
		super();
		this.pinote = pinote;
		this.url = url;
	}
	@Override
	public String toString() {         //ToString Method for TextAndImageNotes
		return "TextAndImageNote [pinote=" + pinote + ", url=" + url + "]";
	}
	
	
	
}
