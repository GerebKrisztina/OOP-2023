package oop.labor11;

public class MyDate {
    private int year,month,day;
    MyDate(int year,int month,int day){
        if(DateUtil.isValidDate(year,month,day)){
            this.year=year;
            this.month=month;
            this.day=day;
        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return day+"/"+month+"/"+year+"/";
    }
}