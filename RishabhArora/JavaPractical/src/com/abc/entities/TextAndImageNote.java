package com.abc.entities;

import com.abc.model.Notes;

public class TextAndImageNote implements Notes{

	private String text,imgUrl;

	public TextAndImageNote() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TextAndImageNote(String text, String imgUrl) {
		super();
		this.text = text;
		this.imgUrl = imgUrl;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	@Override
	public String displayNote() {
		return text+","+imgUrl;
	}

	@Override
	public int noteType() {
		return 1;
	}
	
	
}
