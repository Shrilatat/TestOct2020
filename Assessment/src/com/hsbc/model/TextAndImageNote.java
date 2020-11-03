package com.hsbc.model;

public class TextAndImageNote {
	
	private String imgText;
	private String imgUrl;
	
	public TextAndImageNote() {
		super();
	}

	public TextAndImageNote(String imgText, String imgUrl) {
		super();
		this.imgText = imgText;
		this.imgUrl = imgUrl;
	}

	public String getImgText() {
		return imgText;
	}

	public void setImgText(String imgText) {
		this.imgText = imgText;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	@Override
	public String toString() {
		return "TextAndImageNote [imgText=" + imgText + ", imgUrl=" + imgUrl + "]";
	}
	
	
}
