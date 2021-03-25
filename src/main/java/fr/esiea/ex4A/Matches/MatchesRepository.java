package fr.esiea.ex4A.Matches;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


    @Repository
public class MatchesRepository {


        public final List<MatchesData> matchesUsers = new ArrayList<>();

        public List<MatchesData> findMatch(String username, String usercountry) {
            List<MatchesData> matches = new ArrayList<>();
            matches.add(new MatchesData("machin", "machin45"));
            matches.add(new MatchesData("truc", "trucbidule"));
            return matches;

        }
    }


