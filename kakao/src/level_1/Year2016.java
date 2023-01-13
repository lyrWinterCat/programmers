package level_1;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Year2016 {
    public String solution(int a, int b) {
        //        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED","THU"};
//        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//
//        int dayCnt = b-1;
//        for (int i = 0; i < a-1; i++) {
//            dayCnt += months[a];
//        }
//
//        System.out.println("dayCnt = " + dayCnt);
//
//        return days[dayCnt % 7];

        return LocalDate.of(2016,a,b)
                .getDayOfWeek()
                .getDisplayName(TextStyle.SHORT, Locale.US)
                .toUpperCase();
    }

    public static void main(String[] args) {
        Year2016 year2016 = new Year2016();
        int a = 5;
        int b = 24;
        String solution = year2016.solution(a, b);
        System.out.println("solution = " + solution);
    }
}
