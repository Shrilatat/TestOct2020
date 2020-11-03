package test;

public class TextAndImageNote {

	private String txt;
	private String imgTxt;
	public TextAndImageNote() {
		super();
	}
	public TextAndImageNote(String txt, String imgTxt) {
		super();
		this.txt = txt;
		this.imgTxt = imgTxt;
	}
	public String getTxt() {
		return txt;
	}
	public void setTxt(String txt) {
		this.txt = txt;
	}
	public String getImgTxt() {
		return imgTxt;
	}
	public void setImgTxt(String imgTxt) {
		this.imgTxt = imgTxt;
	}
	@Override
	public String toString() {
		return "TextAndImageNote [txt=" + txt + ", imgTxt=" + imgTxt + "]";
	}
	
}
