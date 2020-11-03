package test.hsbc;

import java.util.ArrayList;

public class NoteStore {

	public String msg,url;
	public ArrayList<TextNote> list_tn=new ArrayList<>();//ArrayList for TextNote
	public ArrayList<TextAndImageNote> list_tnai=new ArrayList<>();//ArrayList for TextAndImageNote
	
	
	public void storeNote(String msg,String url)
	{
		if(url=="")
		{
			//If url is null then only TextNote is created
			TextNote te=new TextNote(msg);
			list_tn.add(te);
		}
		else
		{
			//else TextAndImageNote object is added to the ArrayList
			TextAndImageNote tn=new TextAndImageNote(msg,url);
			list_tnai.add(tn);
		}
	}
	public ArrayList getAllTextNotes()
	{
		return list_tn;
	}
	
	public ArrayList AllTextAndImageNotes()
	{
		return list_tnai;
	}
	
	
}
