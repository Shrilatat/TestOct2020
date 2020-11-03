package examProject;
import java.util.*;

public class NoteStore implements NoteStoreInt{
	
	private List<Notes> alist = new ArrayList<>();

	@Override
	public void StoreNote(TextNote notes) {
		alist.add(notes);
		System.out.println("Success");
		
	}

	@Override
	public void Storenote(TextAndImageNote notes) {
		alist.add(notes);
		System.out.println("success");
		
	}

	@Override
	public List<Notes> getAllTextNotes() {
		List<Notes> ans=new ArrayList<>();
		for(Notes nt:alist) {
			if(nt.getImage()==null) {
				ans.add(nt);
			}
		}
		
		return ans;
	}

	@Override
	public List<Notes> getAllTextAndImageNotes() {
		List<Notes> ans=new ArrayList<>();
		for(Notes nt:alist) {
			if(nt.getImage()==null) {
				ans.add(nt);
			}
		}
		
		return ans;
	}

}
