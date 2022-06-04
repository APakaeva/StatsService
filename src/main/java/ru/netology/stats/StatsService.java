package ru.netology.stats;

public class StatsService {

    //1 Сумму всех продаж
    public int sumSales(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    //2 Среднюю сумму продаж в месяц
    public int averageSales(long[] array) {
        int average = 0;
        if (array.length > 0) ;
        {
            int sum = 0;
            for (int sale = 0; sale < array.length; sale++) {
                sum += array[sale];
            }
            average = sum / array.length;
        }
        return average;
    }

    //3 Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*
    public int maxSales(long[] array) {
        long arrayMax = array[0];
        int maxMonth = 1;
        int month = 0;
        for (long sale : array) {
            month++;
            if (arrayMax <= sale) {
                arrayMax = sale;
                maxMonth = month;
            }
        }
        return maxMonth;
    }

    //4 Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*
    public int minSales(long[] array) {
        long arrayMin = array[0];
        int minMonth = 1;
        int month = 0;
        for (long sale : array) {
            month++;
            if (arrayMin >= sale) {
                arrayMin = sale;
                minMonth = month;
            }
        }
        return minMonth;
    }

    //5 Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
    public int lessAverageSales(long[] array) {
        int average = averageSales(array);
        int amount = 0;
        for (int sale = 0; sale < array.length; sale++) {
            if (array[sale] < average) {
                amount++;
            }
        }
        return amount;
    }

    //6 Кол-во месяцев, в которых продажи были выше среднего (см. п.2)
    public int moreAverageSales(long[] array) {
        int average = averageSales(array);
        int amount = 0;
        for (int sale = 0; sale < array.length; sale++) {
            if (array[sale] > average) {
                amount++;
            }
        }
        return amount;
    }
}