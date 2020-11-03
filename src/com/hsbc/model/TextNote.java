package com.hsbc.model;

public class TextNote extends Notes {

	public TextNote() {
		super();

	}

	public TextNote(String text) {
		super(text);

	}

	@Override
	public String getText() {

		return super.getText();
	}

	@Override
	public void setText(String text) {

		super.setText(text);
	}

	@Override
	public void display() {

		System.out.println(super.getText());
	}
	
	public int ntype() {
		return 1;
	}

	

}
