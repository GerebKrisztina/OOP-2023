package oop.labor02.date;

public class DateUtil {

    //szokoev vagy nem
    public static boolean leapYear(int year){
        if(year % 400 == 0 || (year % 4 ==0 && year % 100 !=0)) return true;
        return false;
    }

    //helyes az ev vagy nem
    public static boolean isValidDate(int year, int month, int day){
        if(year < 1 || year > 2022) return false;
        if(month < 1 || month > 12) return false;
        if(day < 1 || day > 31) return false;

        return true;
    }


}
