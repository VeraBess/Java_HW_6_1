package ru.netology.stats.Java_HW_6_1.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test // 1
    public void sumSalesAllMonth() {  // общая сумма
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 180;
        long actualSum = service.sumTotalSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test // 2
    public void averageSalesInMonth() { //средняя в месяц
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverSum = 15;
        long actualAverSum = service.averageSalesAmount(sales);

        Assertions.assertEquals(expectedAverSum, actualAverSum);
    }

    @Test // 3
    public void maxSalesInMonth() { //номер месяца с мах продажами
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMax = 8;
        int actualMax = service.maxSalesInMonth(sales);

        Assertions.assertEquals(expectedMax, actualMax);
    }

    @Test // 4
    public void minSalesInMonth() { //номер месяца с мин продажами
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMin = 8;
        int actualMin = service.maxSalesInMonth(sales);

        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test // 5
    public void sumMonthSalesBelowAverage() { // кол-во месяцев выше среднего
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedBelow = 5;
        int actualBelow = service.salesAboveAverage(sales);

        Assertions.assertEquals(expectedBelow, actualBelow);
    }

    @Test // 6
    public void sumMonthSalesAboveAverage() { // кол-во месяцев ниже среднего
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAbove = 5;
        int actualAbove = service.salesAboveAverage(sales);

        Assertions.assertEquals(expectedAbove, actualAbove);
    }
}