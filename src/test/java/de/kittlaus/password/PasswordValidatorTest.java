package de.kittlaus.password;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {


    @Test
    void shouldBeLongEnough(){
        //GIVEN
        String testPassword = "Ab2jkafhdgkjdfsahkjsdhafkja";
        //WHEN
        String actual = PasswordValidator.passwordChecker(testPassword);
        //THEN
        assertEquals("Ab2jkafhdgkjdfsahkjsdhafkja ist ein gutes Passwort.",actual);
    }

    @Test
    void shouldBeToShort(){
        //GIVEN
        String testPassword = "Ab2j";
        //WHEN
        String actual = PasswordValidator.passwordChecker(testPassword);
        //THEN
        assertEquals("Ab2j ist zu kurz, bitte mindestens 8 Zeichen.",actual);
    }

}