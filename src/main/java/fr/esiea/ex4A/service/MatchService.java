package fr.esiea.ex4A.service;

import fr.esiea.ex4A.Agify.AgifyApiData;
import fr.esiea.ex4A.Agify.AgifyClient;
import fr.esiea.ex4A.Matches.MatchesData;
import fr.esiea.ex4A.Api_inscription.InscriptionData;
import fr.esiea.ex4A.Matches.MatchesRepository;
import fr.esiea.ex4A.Api_inscription.InscriptionRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;

@Service
public class MatchService {

    private final AgifyClient agifyClient;
    private final InscriptionRepository userRepository;
    private final MatchesRepository matchesRepository;

    public MatchService(AgifyClient agifyClient, InscriptionRepository userRepository, MatchesRepository matchesRepository) {
        this.agifyClient = agifyClient;
        this.userRepository = userRepository;
        this.matchesRepository = matchesRepository;
    }

    @Cacheable("InscriptionData")
    public InscriptionData getUserAge(InscriptionData user) throws IOException {
        AgifyApiData apiUser = agifyClient.agePredict(user.userName, user.userCountry).execute().body();
        InscriptionData userCurrent = new InscriptionData(user.userName, user.userEmail, user.userTweeter, user.userCountry, user.userSex, user.userSexPref, apiUser.age);
        return userCurrent;
    }


    public ArrayList<MatchesData> getMatches(String userName, String country_id) {
        InscriptionData user = userRepository.getUserByUsernameAndCountry(userName, country_id);
        return (ArrayList<MatchesData>) matchesRepository.findMatch(user, country_id);
    }
}
