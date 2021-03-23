package fr.esiea.ex4A.Api_inscription;

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
}
