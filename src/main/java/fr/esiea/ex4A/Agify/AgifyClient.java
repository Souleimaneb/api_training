package fr.esiea.ex4A.Agify;

import fr.esiea.ex4A.Agify.AgifyApiData;
import fr.esiea.ex4A.Matches.MatchesData;
import retrofit2.Call;
import retrofit2.http.*;
import java.util.List;
import java.util.Map;

public interface AgifyClient {

    @GET("/")
    Call<AgifyApiData> agePredict(@Query("name") String userName, @Query("country_id") String userCountry);
}
