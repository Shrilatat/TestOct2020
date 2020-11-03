

public class TextNote implements Notes{

	
	private String text;

	
	public TextNote(String text) {
		// TODO Auto-generated constructor stub
		
		this.text = text;
	}
	

	

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "TextNote [text=" + text + "]";
	}

	@Override
	public String getNotes() {
		// TODO Auto-generated method stub
		return text;
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "TEXT";
	}
	

	
}
