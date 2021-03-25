package fr.esiea.ex4A.Inscription;

import fr.esiea.ex4A.Api_inscription.InscriptionData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InscriptionDataTest {

    @Test
    void Equality_test() {
        InscriptionData userOne = new InscriptionData("Name", "Name@gmail.com", "Tweet", "FR",
            "M", "F");
        InscriptionData userTwo = new InscriptionData("Name", "Name@gmail.com", "Tweet", "FR",
            "M", "F");

        Assertions.assertTrue(userOne.equals(userTwo) && userTwo.equals(userOne));
        Assertions.assertTrue(userOne.hashCode() == userTwo.hashCode());
    }
}
