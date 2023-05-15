package oop.labor11.lab11_1;

public class DateUtil {
    public static boolean leapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
            return true;
        return false;
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year <= 0 || month <= 0 || day <= 0)
            return false;
        if (month > 12 || day > 31)
            return false;
        if (month == 2) {
            if (day > 29)
                return false;
            if (!leapYear(year) && day > 28)
                return false;
            return true;
        }
        if (day == 31) {
            if (month < 8) {
                if (month % 2 == 0)
                    return false;
            } else {
                if (month % 2 == 1)
                    return false;
            }
        }
        return true;

    }
}