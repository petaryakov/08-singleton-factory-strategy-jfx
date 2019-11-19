package ohm.softa.a08.filtering;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

import java.util.HashMap;
import java.util.Map;

public abstract class MealsFilterFactory {

	private static final Map<String,MealsFilter> filters = new HashMap<>();

	static{
		// define all types of filtes that I want
		filters.put("All", new NoFilter());
		filters.put("Vegetarian", new CategoryFilter(true, "vegetarisch", "vegan"));
		filters.put("No pork", new CategoryFilter(false, "schwein"));
		filters.put("No soy", new NotesFilter("soja"));
	}

	private MealsFilterFactory(){

	}
	public static MealsFilter getStrategy(String key){
		return filters.getOrDefault(key, filters.get("All"));
	}
}
