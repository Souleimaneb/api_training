package fr.esiea.ex4A.Matches;

import fr.esiea.ex4A.Api_inscription.InscriptionRepository;
import fr.esiea.ex4A.Matches.MatchesData;
import fr.esiea.ex4A.Api_inscription.InscriptionData;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MatchesRepository {

    public final InscriptionRepository userRepository;

    public MatchesRepository(InscriptionRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<MatchesData> findMatch(InscriptionData userOne, String country_id) {
        ArrayList<MatchesData> usersMatched = new ArrayList<>();
        if (userRepository.users != null && userRepository.users.size() > 1){
            for(InscriptionData u : userRepository.users) {
                if (u.userSex.equals(userOne.userSexPref) && (Math.abs(u.userAge - userOne.userAge) <= 4) && !u.equals(userOne) && u.userCountry.equals(country_id)){
                    usersMatched.add(new MatchesData(u.userName, u.userTweeter));
                }
            }
        }
        return usersMatched;
    }

}

