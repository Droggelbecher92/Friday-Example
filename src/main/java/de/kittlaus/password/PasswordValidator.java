package de.kittlaus.password;



/*
* Validierung eines Passwortes:
*
* - Länge sollte über dem Mindestwert liegen DONE
* - Zahlen sollen enthalten sein
* - Groß- und Kleinbuchstaben siollen enthalten sein
* - Optional: Mehrere Passwörter checken
* */
public class PasswordValidator {

    private static final int MIN_LENGTH=8;

    public static String passwordChecker(String passwordToCheck){
        if (passwordToCheck.length()<MIN_LENGTH){
            return passwordToCheck+" ist zu kurz, bitte mindestens "+MIN_LENGTH+" Zeichen.";
        }
        return passwordToCheck+ " ist ein gutes Passwort.";
    }

}
