
public class TextAndImageNote implements Notes {

	
	private String imagUrl,text;
	
	

	public TextAndImageNote(String imagUrl, String text) {
		super();
		this.imagUrl = imagUrl;
		this.text = text;
	}


	public String getImagUrl() {
		return imagUrl;
	}


	public void setImagUrl(String imagUrl) {
		this.imagUrl = imagUrl;
	}


	@Override
	public String toString() {
		return "TextAndImageNote [text=" + text + ", imagUrl=" + imagUrl + "]";
	}




	@Override
	public String getNotes() {
		// TODO Auto-generated method stub
		return text +","+ imagUrl;
	}




	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "IMAGE";
	}
	
	
	
	
}
