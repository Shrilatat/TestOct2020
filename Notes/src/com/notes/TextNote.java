package com.notes;

public class TextNote {
	
	private String txtNote;

	public TextNote() {}

	public TextNote(String txtNote) {
		super();
		this.txtNote = txtNote;
	}

	public String getTxtNote() {
		return txtNote;
	}

	public void setTxtNote(String txtNote) {
		this.txtNote = txtNote;
	}

	@Override
	public String toString() {
		return ": "+txtNote;
	}
	}
