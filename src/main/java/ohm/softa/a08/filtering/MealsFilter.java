package ohm.softa.a08.filtering;

import ohm.softa.a08.model.Meal;

import java.util.List;

public interface MealsFilter {

	/*default List<Meal> filter(List<Meal> meals){
		return meals;
	}*/
	List<Meal> filter(List<Meal> meals);
}
