package com.req1.a;

public class TextNote {
	private String ptext;

	public String getPtext() {
		return ptext;
	}

	public void setPtext(String ptext) {
		this.ptext = ptext;
	}

	public TextNote(String ptext) {
		super();
		this.ptext = ptext;
	}

	public TextNote() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TextNote [ptext=" + ptext + "]";
	}
	
}
