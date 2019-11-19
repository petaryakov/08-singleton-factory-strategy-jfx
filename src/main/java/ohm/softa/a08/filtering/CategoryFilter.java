package ohm.softa.a08.filtering;

import ohm.softa.a08.model.Meal;

import java.util.*;

public class CategoryFilter extends FilterBase {
	// warum sind dies nicht private final
	private boolean include;
	private String[] categories;

	public CategoryFilter(boolean include, String... categories) {
		this.include = include;
		this.categories = categories;
	}

	/*@Override
	protected boolean include(Meal m) {
		if(m.getCategory() == "Schwein")
			return false;
		else
			return true;
	}*/

	@Override
	protected boolean include(Meal m) {
		// ok if any category matches
		if (include)
			return Arrays.stream(categories)
				.anyMatch(s -> s.equals(m.getCategory().toLowerCase()));
		else
			return Arrays.stream(categories)
				.noneMatch(s -> s.equals(m.getCategory().toLowerCase()));
	}

	/*@Override
	public List<Meal> filter(List<Meal> meals) {
		List<Meal> result = new Li;
		for( Meal m : meals){
			if(include(m))
				result.add(m);
		}
	}*/
}
