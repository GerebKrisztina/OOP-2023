package oop.labor11.lab11_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<MyDate> dates = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; ) {
            int year = rand.nextInt(1, 2023);
            int month = rand.nextInt(1, 12);
            int day = rand.nextInt(1,31);
            MyDate date1 = new MyDate(year, month, day);
            if (DateUtil.isValidDate(date1.getYear(), date1.getMonth(), date1.getDay())) {
                dates.add(date1);
                i++;
            }
        }
        for (MyDate o:dates) {
            System.out.println(o);
        }
        System.out.println("_______");
        Collections.sort(dates);
        for (MyDate o:dates) {
            System.out.println(o);
        }
    }
}
