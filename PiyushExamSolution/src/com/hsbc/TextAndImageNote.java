package com.hsbc;

public class TextAndImageNote extends Notes {
	private String url;

	public TextAndImageNote(String note, String url) {
		super(note);
		this.url = url;
	}

	@Override
	public String toString() {
		return super.toString()+"TextAndImageNote [url=" + url + "]";
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
