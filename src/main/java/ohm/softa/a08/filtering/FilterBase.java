package ohm.softa.a08.filtering;

import ohm.softa.a08.model.Meal;

import java.util.List;
import java.util.stream.Collectors;

public abstract class FilterBase implements MealsFilter {
	@Override
	public List<Meal> filter(List<Meal> meals) {
		return meals.stream()
			.filter(this::include)		// specifies which method to use for filtering; if include was in a different class it would be class::include
			.collect(Collectors.toList());	// converts the stream to a list
	}

	protected abstract boolean include(Meal m);
}
