package com.hsbc.exam;
public class TextNote {

	private String note;

	public TextNote(String note) {
		// TODO Auto-generated constructor stub
		this.note = note;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}


// TextAndImageNote class

package com.test;

public class TextAndImageNote {

	private String note ;
	private String url ;
	
	public TextAndImageNote(String note, String url) {
		// TODO Auto-generated constructor stub
		this.note = note ;
		this.url = url;
	}
	
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}