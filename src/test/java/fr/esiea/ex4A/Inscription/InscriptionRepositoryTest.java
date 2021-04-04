package fr.esiea.ex4A.Inscription;

import fr.esiea.ex4A.Api_inscription.InscriptionData;
import fr.esiea.ex4A.Api_inscription.InscriptionRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InscriptionRepositoryTest {

    private final InscriptionRepository inscriptionRepository = new InscriptionRepository();

    @Test
    void cheking_user_on_list() {
        InscriptionData user = new InscriptionData("Name", "Name@mail.com",
            "tweeter", "FR", "M", "M", 10);
        inscriptionRepository.addUser(user);
        Assertions.assertTrue(inscriptionRepository.utilisateurAdd(user));
        Assertions.assertEquals(1, inscriptionRepository.users.size());
    }

    @Test
    void Default_add() {
        InscriptionData user = new InscriptionData();
        inscriptionRepository.addUser(user);

        Assertions.assertTrue(inscriptionRepository.utilisateurAdd(user));
        Assertions.assertEquals(1, inscriptionRepository.users.size());
    }
}
