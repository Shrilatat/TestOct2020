package com.hsbc;

public class Notes {
	private String note;

	public Notes(String note) {
		super();
		this.note = note;
	}

	@Override
	public String toString() {
		return "Notes [note=" + note + "]";
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
}
