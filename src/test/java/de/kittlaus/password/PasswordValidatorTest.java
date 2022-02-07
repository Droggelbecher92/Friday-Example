package de.kittlaus.password;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {


    @Test
    void shouldBeOk(){
        //GIVEN
        String testPassword = "Ab2jkafhdgkjdfsahkjsdhafkja";
        //WHEN
        String actual = PasswordValidator.passwordValidator(testPassword);
        //THEN
        assertEquals("Ab2jkafhdgkjdfsahkjsdhafkja ist ein gutes Passwort.",actual);
    }

    @Test
    void shouldBeTooShort(){
        //GIVEN
        String testPassword = "Ab2j";
        //WHEN
        String actual = PasswordValidator.passwordValidator(testPassword);
        //THEN
        assertEquals("Ab2j ist zu kurz, bitte mindestens 8 Zeichen.",actual);
    }

    @Test
    void shouldBeBadWithoutNumbers(){
        //GIVEN
        String testPassword = "Abksdjahfkjksadhf";
        //WHEN
        String actual = PasswordValidator.passwordValidator(testPassword);
        //THEN
        assertEquals("Abksdjahfkjksadhf enthält keine Zahlen.",actual);
    }

    @Test
    void shouldBeBadAllCapitalLetters(){
        //GIVEN
        String testPassword = "A9ADSFGADFGFADGFGFGFGÄÜÖGGAF";
        //WHEN
        String actual = PasswordValidator.passwordValidator(testPassword);
        //THEN
        assertEquals("A9ADSFGADFGFADGFGFGFGÄÜÖGGAF benötigt mindestens einen Kleinbuchstaben",actual);
    }

    @Test
    void shouldBeBadAllLowercase(){
        //GIVEN
        String testPassword = "9kjasdhfkäöühsdgkjhasdfkhjafdshk";
        //WHEN
        String actual = PasswordValidator.passwordValidator(testPassword);
        //THEN
        assertEquals("9kjasdhfkäöühsdgkjhasdfkhjafdshk benötigt mindestens einen Großbuchstaben",actual);
    }

}