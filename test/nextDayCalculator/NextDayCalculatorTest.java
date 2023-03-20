package nextDayCalculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @ParameterizedTest
    @CsvSource({
            "25, 2, 2020, 26/2/2020",
            "29, 2, 2020, 1/3/2020",
            "31,12,2020, 1/1/2021",
            "15,12,2020, 16/12/2020",
            "20,6,2020, 21/6/2020", "30,6,2020, 1/7/2020"})
    void getNextDay(int day, int month, int year, String nextDay) {
        String result = NextDayCalculator.getNextDay(day, month, year);
        assertEquals(nextDay, result);
    }

}