package ohm.softa.a08.filtering;

import ohm.softa.a08.model.Meal;

import java.util.Arrays;

public class NotesFilter extends FilterBase {
	private final String[] notesToExclude;

	public NotesFilter(String... notes){
		this.notesToExclude = notes;
	}

	@Override
	protected boolean include(Meal m) {
		boolean excludeMeal = false;

		for(String note : m.getNotes()){
			String currentNote = note.toLowerCase();
			for(String excludedNote : notesToExclude){
				excludeMeal |= currentNote.contains(excludedNote);
			}
		}
		return !excludeMeal;
	}
}
