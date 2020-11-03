package com.hsbc.model;

public class TextAndImageNote extends Notes{
	
	private String url;

	public TextAndImageNote() {
		super();
	}

	public TextAndImageNote(String text) {
		super(text);
	}

	public TextAndImageNote(String text, String url) {
		super(text);
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return super.getText();
	}

	@Override
	public void setText(String text) {
		// TODO Auto-generated method stub
		super.setText(text);
	}

	@Override
	public void display() {
		System.out.println(super.getText() + " , " + url); ;
	}

	public int ntype() {
		return 2;
	}

	
	
	

}
