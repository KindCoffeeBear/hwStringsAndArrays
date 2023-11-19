package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0; // сумма всех продаж

        for (long t : sales) { // пробегаемся по всему массиву
            sum = sum + t; // суммируем продажи
        }

        return sum;
    }

    public long midSales(long[] sales) {
        long mid = sumSales(sales) / 12; // берем сумму продаж из другого метода и делим на 12
        return mid;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int lessMidSales(long[] sales) {
        int months = 0; // количество месяцев

        long mid = midSales(sales); // средняя сумма продаж

        for (long t : sales) {
            if (t < mid) {
                months++;
            }
        }

        return months;
    }

    public int moreMidSales(long[] sales) {
        int months = 0; // количество месяцев

        long mid = midSales(sales); // средняя сумма продаж

        for (long t : sales) {
            if (t > mid) {
                months++;
            }
        }

        return months;
    }
}
