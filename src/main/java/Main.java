import ru.netology.stats.Java_HW_6_1.services.StatsService;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        long[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        // System.out.println(Arrays.toString(arr));

        StatsService service = new StatsService();
        System.out.println("Сумма продаж за месяц: " + service.sumTotalSales(arr));
        System.out.println("Средняя сумма продаж в месяц: " + service.averageSalesAmount(arr));
        System.out.println("Номер месяца с максимальными продажами: " + service.maxSalesInMonth(arr));
        System.out.println("Номер месяца с минимальными продажами: " + service.minSalesInMonth(arr));
        System.out.println("Количество месяцев с продажами ниже среднего: " + service.salesBelowAverage(arr));
        System.out.println("Количество месяцев с продажами выше среднего: " + service.salesAboveAverage(arr));
    }
}
