package ru.netology.stats.Java_HW_6_1.services;

public class StatsService {

    public long sumTotalSales(long[] sales) { // сумма всех продаж
        long sumSale = 0; // переменная для хранения суммы продаж

        for (int i = 0; i < sales.length; i++) {
            sumSale = sumSale + sales[i];
        }
        return sumSale;
    }

    public long averageSalesAmount(long[] sales) { //средняя сумма продаж в месяц
        long averageMonth = sumTotalSales(sales) / sales.length; //сумму всех продаж берем из первого метода
        return averageMonth;
    }

    public int maxSalesInMonth(long[] sales) { //Номер месяца с максимальными продажами
        int maxMonth = 0; // переменная для хранения номера месяца

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSalesInMonth(long[] sales) { //Номер месяца с минимальными продажами
        int minMonth = 0; // переменная для хранения номера месяца

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int salesBelowAverage(long[] sales) { //кол-во месяцев с продажами ниже среднего
        int monthBelowAverage = 0; //переменная для подсчета кол-ва месяцев

        for (long s : sales) {
            if (s < averageSalesAmount(sales)) {
                monthBelowAverage = monthBelowAverage + 1;
            }
        }
        return monthBelowAverage;
    }

    public int salesAboveAverage(long[] sales) { //кол-во месяцев с продажами выше среднего
        int monthAboveAverage = 0; //переменная для подсчета кол-ва месяцев

        for (long s : sales) {
            if (s > averageSalesAmount(sales)) {
                monthAboveAverage = monthAboveAverage + 1;
            }
        }
        return monthAboveAverage;
    }
}