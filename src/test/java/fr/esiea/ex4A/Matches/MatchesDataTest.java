package fr.esiea.ex4A.Matches;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MatchesDataTest {

    @Test
    void test_equals_with_two_matchs() {
        MatchesData userOne = new MatchesData("Soulei", "Tweet");
        MatchesData userTwo = new MatchesData("Soulei", "Tweet");

        Assertions.assertTrue(userOne.equals(userTwo) && userTwo.equals(userOne));
        Assertions.assertTrue(userOne.hashCode() == userTwo.hashCode());
    }
}
