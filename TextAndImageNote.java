package examProject;

public class TextAndImageNote extends Notes{
	

	public TextAndImageNote() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TextAndImageNote(String text, String image) {
		super(text);
	}



	public void displayTextAndImageNotes() {
		System.out.println(super.getText()+", "+super.getImage());
	}

}
