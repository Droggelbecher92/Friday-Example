package de.kittlaus.password;


import java.util.Locale;

/*
* Validierung eines Passwortes:
*
* - Länge sollte über dem Mindestwert liegen DONE
* - Zahlen sollen enthalten sein DONE
* - Groß- und Kleinbuchstaben sollen enthalten sein DONE
* - Optional: Mehrere Passwörter checken
* */
public class PasswordValidator {

    private static final int MIN_LENGTH=8;

    public static String passwordValidator(String passwordToCheck){
        if (passwordToCheck.length()<MIN_LENGTH){
            return passwordToCheck+" ist zu kurz, bitte mindestens "+MIN_LENGTH+" Zeichen.";
        } else if(containsNoNumbers(passwordToCheck)){
            return passwordToCheck + " enthält keine Zahlen.";
        } else if (passwordToCheck.toUpperCase(Locale.ROOT).equals(passwordToCheck)){
            return passwordToCheck + " benötigt mindestens einen Kleinbuchstaben";
        } else if (passwordToCheck.toLowerCase(Locale.ROOT).equals(passwordToCheck)){
            return passwordToCheck+" benötigt mindestens einen Großbuchstaben";
        }
        return passwordToCheck+ " ist ein gutes Passwort.";
    }

    public static String[] passwordValidatorMulti(String[] testPasswords) {
        String[] validatedPasswords = new String[testPasswords.length];
        for (int i = 0; i < validatedPasswords.length; i++) {
            validatedPasswords[i] = passwordValidator(testPasswords[i]);
        }
        return validatedPasswords;
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
