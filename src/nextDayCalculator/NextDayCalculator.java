package nextDayCalculator;

import java.util.Arrays;

public class NextDayCalculator {
    private static final String NEXT_DAY = "next_day";
    private static final String NEXT_MONTH = "next_month";
    private static final String NEXT_YEAR = "next_year";

    public static String getNextDay(int dayNumber, int month, int year) {
        boolean isFebruary = month == 2;
        boolean isEndYear = month == 12 && dayNumber == 31;
        boolean is31DayInMonth = checkIf31Month(month);
        if (isFebruary && dayNumber < 29) {
            return nextDayCalculator(NEXT_DAY, dayNumber, month, year);
        } else if (isEndYear) {
            return nextDayCalculator(NEXT_YEAR, dayNumber, month, year);
        } else if (is31DayInMonth && dayNumber < 31) {
            return nextDayCalculator(NEXT_DAY, dayNumber, month, year);
        } else if (is31DayInMonth && dayNumber < 30) {
            return nextDayCalculator(NEXT_DAY, dayNumber, month, year);
        } else {
            return nextDayCalculator(NEXT_MONTH, dayNumber, month, year);
        }
    }

    public static boolean checkIf31Month(int month) {
        int[] monthWith31day = {1, 3, 5, 7, 8, 10, 12};
        return Arrays.stream(monthWith31day).anyMatch(i -> i == month);
    }

    public static String nextDayCalculator(String action, int dayNumber, int month, int year) {
        String temp;
        StringBuilder nextDayResult = new StringBuilder();
        switch (action) {
            case NEXT_DAY -> {
                temp = (dayNumber + 1) + "/" + month + "/" + year;
                nextDayResult.append(temp);
            }
            case NEXT_MONTH -> {
                temp = 1 + "/" + (month + 1) + "/" + year;
                nextDayResult.append(temp);
            }
            case NEXT_YEAR -> {
                temp = 1 + "/" + 1 + "/" + (year + 1);
            }
        }
        return nextDayResult.toString();
    }

}