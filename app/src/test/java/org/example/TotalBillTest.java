package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TotalBillTest {
    @Test
    public void testCalculationResult() {
        float[][] articles = {
            {3F, 10F},
            {2F, 10F},
            {1F, 30F}
        };
        float expectedBill = (3F * 10F) + (2F * 10F) + 30F;
        float actualBill = TotalBill.calculation(articles);

        assertEquals(expectedBill, actualBill, "Calculation don't work");
    }

    @Test
    public void testCalculationDiscount() {
        float[][] articles = {
                {6F, 10F},
                {2F, 10F},
                {4F, 30F}
        };
        float expectedBill = ((6F * 10F) + (2F * 10F) + (4F * 30F)) * 0.9F;
        float actualBill = TotalBill.calculation(articles);

        assertEquals(expectedBill, actualBill, "Discount don't work");
    }

    @Test
    public void testCalculationEmptyBill() {
        float[][] articles = {};
        float expectedBill = 0F;
        float actualBill = TotalBill.calculation(articles);

        assertEquals(expectedBill, actualBill, "Calculation on empty bill don't work");
    }

    @Test
    public void testCalculationNullBill() {
        float expectedBill = 0F;
        float actualBill = TotalBill.calculation(null);

        assertEquals(expectedBill, actualBill, "Calculation on null bill don't work");
    }
}
