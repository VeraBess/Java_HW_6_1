package ru.netology.stats.Java_HW_6_1.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sumSalesAllMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 180;
        long actualSum = service.sumTotalSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void averageSalesInMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverSum = 15;
        long actualAverSum = service.averageSalesAmount(sales);

        Assertions.assertEquals(expectedAverSum, actualAverSum);
    }

    @Test
    public void maxSalesInMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMax = 8;
        long actualMax = service.maxSalesInMonth(sales);

        Assertions.assertEquals(expectedMax, actualMax);
    }

    @Test
    public void sumMonthSalesBelowAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedBelow = 5;
        long actualBelow = service.salesBelowAverage(sales);

        Assertions.assertEquals(expectedBelow, actualBelow);
    }

    @Test
    public void sumMonthSalesAboveAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAbove = 5;
        long actualAbove = service.salesAboveAverage(sales);

        Assertions.assertEquals(expectedAbove, actualAbove);
    }
}