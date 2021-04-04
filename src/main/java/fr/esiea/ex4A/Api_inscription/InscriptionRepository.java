package fr.esiea.ex4A.Api_inscription;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InscriptionRepository {
    public final List<InscriptionData> users = new ArrayList<>();
    public InscriptionData addUser(InscriptionData user) {
        users.add(user);
        return user;
    }
    public InscriptionData getUserByUsernameAndCountry(String userName, String country) {
        for(InscriptionData u : users) {
            if (u.userCountry.equals(country) && u.userName.equals(userName)){
                return u;
            }
        }
        return null;
    }
    public boolean utilisateurAdd(InscriptionData user) {
        return stockageuser(users, user);
    }
    private boolean stockageuser(List<InscriptionData> users, InscriptionData userVerif) {boolean result = false;
        for (InscriptionData object : users) {
            if (object.equals(userVerif))
                result = true;
        }
        return result;
    }
}
