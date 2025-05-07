package com.cda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Algo5_TDD_PasswordStrengthTest {

    @Test
    void passwordTooShort() {
        assertEquals("WEAK", Algo5_PasswordStrength.evaluate("abc"));
    }

    @Test
    void passwordWithOnlyLetters() {
        assertEquals("WEAK", Algo5_PasswordStrength.evaluate("abcdef"));
    }

    @Test
    void passwordWithLettersAndNumbers() {
        assertEquals("MEDIUM", Algo5_PasswordStrength.evaluate("abc123"));
    }
}