package com.abc.dao;

import java.util.ArrayList;
import java.util.List;

import com.abc.entities.TextAndImageNote;
import com.abc.entities.TextNote;
import com.abc.model.Notes;

public class NoteStore implements NoteStoreIntf{
	
	private List<Notes> allNotes = new ArrayList<>();
	
	@Override
	public List<Notes> getAllTextNotes() {
		List<Notes> allTextNotes = new ArrayList<>();
		for (Notes n :allNotes) {
			if(n.noteType() == 0) {
				allTextNotes.add(n);
			}
		}
		return allTextNotes;
	}

	@Override
	public List<Notes> getAllTextAndImagesNotes() {
		List<Notes> allTAndINotes = new ArrayList<>();
		for (Notes n : allNotes) {
			if(n.noteType() == 1) {
				allTAndINotes.add(n);
			}
		}
		return allTAndINotes;
	}

	@Override
	public void storeNote(String text, String imgUrl) {
		if(imgUrl != null && !imgUrl.trim().isEmpty()) {
			allNotes.add(new TextAndImageNote(text,imgUrl));
		} else {
			allNotes.add(new TextNote(text));
		}
	}
	
}
