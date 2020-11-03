package com.demo.bean;

public class TextAndImageNote extends Note{
	private String text;
	private String imageUrl;
	
	public TextAndImageNote(String text, String imageUrl) {
		super("typeImage");
		this.text = text;
		this.imageUrl = imageUrl;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	@Override
	public String toString() {
		return "TextAndImageNote [text=" + text + ", imageUrl=" + imageUrl + "]";
	}
	
	
	
}
