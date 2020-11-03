package com.hsbc.method;

public class TextAndImageNote {

	private String text;
	private String imageurl;
	
	
	public TextAndImageNote() {
		super();
	}


	public TextAndImageNote(String text, String imageurl) {
		super();
		this.text = text;
		this.imageurl = imageurl;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public String getImageurl() {
		return imageurl;
	}


	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}


	public String display(){
		return text + " , " + imageurl;
	}
	
	
	
	
	
}
