package com.hsbc.notes;

public class TextAndImageNote {
	
	private String notes ;
	private String url ;
	
	public TextAndImageNote() {
		
	}
	public TextAndImageNote(String notes, String url) {
		this.notes = notes;
		this.url = url;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	

}
