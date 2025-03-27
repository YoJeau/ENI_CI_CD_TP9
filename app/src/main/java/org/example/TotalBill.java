package org.example;

public class TotalBill {
    public static float calculation(float[][] articles) {
        float bill = 0F;
        float discount = 0.8F;
        int discountThreshold = 200;

        if (articles == null || articles.length == 0) {
            return bill;
        }

        for (float[] article : articles) {
            bill += (article[0] * article[1]);
        }

        if (bill >= discountThreshold) {
            bill *= discount;
        }

        return bill;
    }
}
