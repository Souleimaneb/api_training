package fr.esiea.ex4A.Agify;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgifyApiResponseDataTest {

    @Test
    void Equals() {
        AgifyApiData userOne = new AgifyApiData("Soulei", 10, 100, "FR");
        AgifyApiData userTwo = new AgifyApiData("Soulei", 10, 100, "FR");

        Assertions.assertTrue(userOne.equals(userTwo) && userTwo.equals(userOne));
        Assertions.assertTrue(userOne.hashCode() == userTwo.hashCode());
    }
}
