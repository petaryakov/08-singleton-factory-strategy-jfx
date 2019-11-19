package ohm.softa.a08.services;

import ohm.softa.a08.api.OpenMensaAPI;
import ohm.softa.a08.model.Meal;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

public class OpenMensaAPIService {

	private static final OpenMensaAPIService instance = new OpenMensaAPIService();
	private final OpenMensaAPI openMensaAPI;   // wie kann ich vom UML Diagram sehen ob static oder nicht

	private OpenMensaAPIService(){
		Retrofit retrofit = new Retrofit.Builder()
			.addConverterFactory(GsonConverterFactory.create())
			.baseUrl("https://openmensa.org/api/v2/")
			.build();

		openMensaAPI = retrofit.create(OpenMensaAPI.class);
	}

	public static OpenMensaAPIService getInstance(){
		return instance;
	}

	public OpenMensaAPI getAPI(){
		return openMensaAPI;
	}
}
