package test;

public class TextNote {

	private String txt;

	public TextNote() {
		super();
	}

	public TextNote(String txt) {
		super();
		this.txt = txt;
	}

	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}

	@Override
	public String toString() {
		return "TextNote [txt=" + txt + "]";
	}
	
}
