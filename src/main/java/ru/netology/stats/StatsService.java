package ru.netology.stats;


public class StatsService {
    public int sumSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return (int) sum;
    }

    public int averageSumSales(long[] sales){
        return sumSales(sales) / 12;
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

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }
        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int countMonthUnderAverage (long[] sales){
        int averageSum = sumSales(sales) / 12;
        int count = 0; //количество месяцев ниже среднего

        for (int i = 0; i < sales.length; i++){
            if (sales[i] < averageSum){
                count++;
            }
        }
        return count;
    }

    public int countMonthAboveAverage (long[] sales){
        int averageSum = sumSales(sales) / 12;
        int count = 0; //количество месяцев выше среднего

        for (int i = 0; i < sales.length; i++){
            if (sales[i] >= averageSum){
                count++;
            }
        }
        return count;
    }

}
