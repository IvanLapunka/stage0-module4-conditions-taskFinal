package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year < 0 || month < 0 || month > 12) {
            System.out.println("invalid date");
        } else {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 13) {
                System.out.println(31);
            } else if (month == 2) {
                if (isLeapYear(year)) {
                    System.out.println(29);
                } else {
                    System.out.println(28);
                }
            } else {
                System.out.println(30);
            }
        }
    }

    public boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
