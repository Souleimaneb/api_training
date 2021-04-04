package fr.esiea.ex4A.Agify;

import retrofit2.Call;
import retrofit2.http.*;

public interface AgifyClient {

    @GET("/")
    Call<AgifyApiData> agePredict(@Query("name") String userName, @Query("country_id") String userCountry);
}
