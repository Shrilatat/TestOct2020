/* Title : TextNote
 * Use : To store TextNotes
 * By : Arjun Dev
 * Date : 11/03/2020
 */

public class TextNote {
	
	String tnote;

	public TextNote(String tnote) {      //Constructor for text notes
		super();
		this.tnote = tnote;
	}

	@Override
	public String toString() {                      // To string method for text notes
		return "TextNote [tnote=" + tnote + "]";
	}
	
	
}
