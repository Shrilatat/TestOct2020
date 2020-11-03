package test.hsbc;

import java.util.ArrayList;

public class Launcher {

	public static void displayTextNotes(ArrayList<TextNote> tn)
	{
		for(TextNote t:tn)
		{
			System.out.println("The plainText is : " + t.getPlainText());
		}
	}
	public static  void displayTextAndImageNotes(ArrayList<TextAndImageNote> tn)
	{
		for(TextAndImageNote t:tn)
		{
			System.out.println("The message is : " + t.getText());
			System.out.println("The url associated is : " + t.getUrl());
		}
	}
	
	
	
	public static void main(String[] args)
	{
		ArrayList<TextNote> tn=new ArrayList<>();//ArrayList for TextNote type object
		
		ArrayList<TextAndImageNote> tnai=new ArrayList<>();//ArrayList for TextAndImageNote type object
		
		tn.add(new TextNote("Krishan"));//adding text message to TextNote object
		tn.add(new TextNote("Shrilata"));//adding text message to TextNote object
		
		
		
		//adding text and url message to TextAndImageNote object
		tnai.add(new TextAndImageNote("Krishan","This is your url"));
		tnai.add(new TextAndImageNote("Shrilata","This is your url"));
		

		//displaying all TextNotes Object
		System.out.println("The TextNote Objects with plaintext are as follows:");
		displayTextNotes(tn);
		
		
		
		//displaying all TextAndImageNotes Object
		System.out.println("The TextAndImageNote Objects with message and URLs are as follows:");
		displayTextAndImageNotes(tnai);
		
		//Thank You !!
	}
	
	
}
