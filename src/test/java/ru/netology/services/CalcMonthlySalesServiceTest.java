package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcMonthlySalesServiceTest {

    @Test
    public void testSum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        CalcMonthlySalesService service = new CalcMonthlySalesService();

        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = service.sumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAvg() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        CalcMonthlySalesService service = new CalcMonthlySalesService();

        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        long actual = service.avgSales(sales);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testMinSales() {
        long[] minMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        CalcMonthlySalesService service = new CalcMonthlySalesService();

        int expected = 9;
        long actual = service.minSales(minMonth);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testMaxSales() {
        long[] maxMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        CalcMonthlySalesService service = new CalcMonthlySalesService();

        int expected = 8;
        long actual = service.maxSales(maxMonth);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMoreThanAvgSales() {
        CalcMonthlySalesService service = new CalcMonthlySalesService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int result = CalcMonthlySalesService.moreThanAvgSales(sales);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testLessThanAvgSales() {
        CalcMonthlySalesService service = new CalcMonthlySalesService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int result = CalcMonthlySalesService.lessThanAvgSales(sales);
        Assertions.assertEquals(expected, result);
    }
}
