import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    //1 Сумму всех продаж
    @Test
    public void sumSalesService() {
        StatsService service = new StatsService();

        int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSumSales = 180;
        int actualSumSales = service.sumSales(array);
        Assertions.assertEquals(expectedSumSales, actualSumSales);
    }

    //2 Среднюю сумму продаж в месяц
    @Test
    public void averageSalesService() {
        StatsService service = new StatsService();

        long[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverageSales = 15;
        int actualAverageSales = service.averageSales(array);
        Assertions.assertEquals(expectedAverageSales, actualAverageSales);
    }

    //3 Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*
    @Test
    public void maxSalesService() {
        StatsService service = new StatsService();

        long[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxSales = 8;
        int actualMaxSales = service.maxSales(array);
        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    //4 Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*
    @Test
    public void minSalesService() {
        StatsService service = new StatsService();

        long[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinSales = 9;
        int actualMinSales = service.minSales(array);
        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    //5 Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
    @Test
    public void lessAverageSales() {
        StatsService service = new StatsService();
        long[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedLessAverageSales = 5;
        int actualLessAverageSales = service.lessAverageSales(array);
        Assertions.assertEquals(expectedLessAverageSales, actualLessAverageSales);

    }

    //6 Кол-во месяцев, в которых продажи были выше среднего (см. п.2)
    @Test
    public void moreAverageSales() {
        StatsService service = new StatsService();
        long[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMoreAverageSales = 5;
        int actualMoreAverageSales = service.moreAverageSales(array);
        Assertions.assertEquals(expectedMoreAverageSales, actualMoreAverageSales);

    }
}
