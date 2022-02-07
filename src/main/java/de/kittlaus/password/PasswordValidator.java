package de.kittlaus.password;



/*
* Validierung eines Passwortes:
*
* - Länge sollte über dem Mindestwert liegen DONE
* - Zahlen sollen enthalten sein DONE
* - Groß- und Kleinbuchstaben siollen enthalten sein
* - Optional: Mehrere Passwörter checken
* */
public class PasswordValidator {

    private static final int MIN_LENGTH=8;

    public static String passwordValidator(String passwordToCheck){
        if (passwordToCheck.length()<MIN_LENGTH){
            return passwordToCheck+" ist zu kurz, bitte mindestens "+MIN_LENGTH+" Zeichen.";
        } else if(containsNoNumbers(passwordToCheck)){
            return passwordToCheck + " enthält keine Zahlen.";
        }
        return passwordToCheck+ " ist ein gutes Passwort.";
    }

    private static boolean containsNoNumbers(String passwordToCheck){
        for (int i = 0; i < passwordToCheck.length(); i++) {
            if (Character.isDigit(passwordToCheck.charAt(i))){
                return false;
            }
        }
        return true;
    }

}
