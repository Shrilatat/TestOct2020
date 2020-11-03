package com.req1.b;

public class TextAndImageNote {
	private String ptext;
	private String image_url;
	
	public TextAndImageNote() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getPtext() {
		return ptext;
	}

	public void setPtext(String ptext) {
		this.ptext = ptext;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	@Override
	public String toString() {
		return "TextAndImageNote [ptext=" + ptext + ", image_url=" + image_url + "]";
	}

	public TextAndImageNote(String ptext, String image_url) {
		super();
		this.ptext = ptext;
		this.image_url = image_url;
	}
	
	
	
}
