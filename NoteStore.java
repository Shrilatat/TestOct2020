/* Title : NoteStore
 * Use : To use methods on the notes
 * By : Arjun Dev
 * Date : 11/03/2020
 */

import java.util.ArrayList;
import java.util.List;

public class NoteStore {
	
	List <TextNote> storet = new ArrayList<>();            //New textnote 
	List <TextAndImageNote> storeti = new ArrayList<>();   //New textandimage note
	
	
	
	public void storeNote(String note, String url) {         //method to add both text and text and image notes
		TextNote tn = new TextNote(note);
		TextAndImageNote tin = new TextAndImageNote(note, url);
		if(url == "")
			storet.add(tn);
		else
			storeti.add(tin);
		}
	
	public ArrayList<TextNote> getAllTextNotes() {         //method to return all text notes stored
		for(TextNote i : storet)
			System.out.println("TextNote [Note=" + i.tnote + "]");
		return (ArrayList<TextNote>) storet;
		
	}
	
	public ArrayList<TextAndImageNote> getAllTextAndImageNotes() {       //method to return all text and image notes stored
		for(TextAndImageNote i : storeti)
			System.out.println("TextAndImageNote [Note=" + i.pinote + ", URL=" + i.url + "]");
		return (ArrayList<TextAndImageNote>) storeti;
	}
	
}
