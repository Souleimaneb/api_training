package fr.esiea.ex4A.Matches;

import java.util.Objects;

public class MatchesData {
    public final String name;
    public final String twitter;


    public MatchesData(String name, String twitter) {
        this.name = name;
        this.twitter = twitter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatchesData matchData = (MatchesData) o;
        return Objects.equals(name, matchData.name) &&
            Objects.equals(twitter, matchData.twitter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, twitter);
    }
}

