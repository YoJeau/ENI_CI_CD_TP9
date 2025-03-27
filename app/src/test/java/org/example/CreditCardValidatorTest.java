package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CreditCardValidatorTest {

    @Test
    public void testValidCard() {
        // Un numéro de carte valide (exemple)
        String validCard = "5130 2903 6080 9874";
        assertTrue(CreditCardValidator.validateCreditCard(validCard), "La carte doit être valide");
    }

    @Test
    public void testInvalidCard() {
        // Un numéro de carte invalide
        String invalidCard = "1234 5678 9876 0000";
        assertFalse(CreditCardValidator.validateCreditCard(invalidCard), "La carte ne doit pas être valide");
    }

    @Test
    public void testCardWithSpaces() {
        // Un numéro de carte valide avec des espaces
        String validCardWithSpaces = "5130 2903 6080 9874";
        assertTrue(CreditCardValidator.validateCreditCard(validCardWithSpaces), "La carte doit être valide avec des espaces");
    }

    @Test
    public void testCardWithNonNumericCharacters() {
        // Un numéro de carte avec des caractères non numériques
        String invalidCard = "1234 56A8 9876 5432";  // "A" n'est pas un chiffre
        assertFalse(CreditCardValidator.validateCreditCard(invalidCard), "La carte ne doit pas être valide avec des caractères non numériques");
    }

    @Test
    public void testEmptyCardNumber() {
        // Un numéro de carte vide
        String emptyCard = "";
        assertFalse(CreditCardValidator.validateCreditCard(emptyCard), "La carte ne doit pas être valide si elle est vide");
    }

    @Test
    public void testSingleDigitCard() {
        // Un numéro de carte avec un seul chiffre
        String singleDigitCard = "1";
        assertFalse(CreditCardValidator.validateCreditCard(singleDigitCard), "La carte ne doit pas être valide avec un seul chiffre");
    }
}
