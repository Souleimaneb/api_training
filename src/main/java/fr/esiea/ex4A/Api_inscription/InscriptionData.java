package fr.esiea.ex4A.Api_inscription;

import java.util.Objects;

public class InscriptionData {

    public final String userName;
    public final String userEmail;
    public final String userTweeter;
    public final String userCountry;
    public final String userSex;
    public final String userSexPref;
    public InscriptionData(String userName, String userEmail, String userTweeter, String userCountry,
                           String userSex, String userSexPref) {
        this.userName = userName;
        this.userTweeter = userTweeter;
        this.userCountry = userCountry;
        this.userSex = userSex;
        this.userSexPref = userSexPref;
        this.userEmail = userEmail;
    }public InscriptionData() {
        userName = null;
        userEmail = null;
        userTweeter = null;
        userCountry = null;
        userSex = null;
        userSexPref = null;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InscriptionData userData = (InscriptionData) o;
        return Objects.equals(userName, userData.userName) &&
            Objects.equals(userEmail, userData.userEmail) &&
            Objects.equals(userTweeter, userData.userTweeter) &&
            Objects.equals(userCountry, userData.userCountry) &&
            Objects.equals(userSexPref, userData.userSexPref);
    }
    @Override
    public int hashCode() {
        return Objects.hash(userName, userEmail, userTweeter, userCountry, userSexPref);
    }
}
