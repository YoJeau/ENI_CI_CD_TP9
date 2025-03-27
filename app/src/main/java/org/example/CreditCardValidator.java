package org.example;

public class CreditCardValidator {
    public static boolean validateCreditCard(String cardNumber) {

        cardNumber = cardNumber.replaceAll("\\s+", "");


        if (!cardNumber.matches("\\d+")) {
            return false;
        }

        int sum = 0;
        boolean alternate = false;

        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(cardNumber.charAt(i));


            if (alternate) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }


            sum += digit;


            alternate = !alternate;
        }

        return (sum % 10 == 0);
    }
}
