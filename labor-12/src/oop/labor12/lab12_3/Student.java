package oop.labor12.lab12_3;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private final int ID;
    private String firstName;
    private String lastName;
    private double mathMark;
    private double huMark;
    private double roMark;

    public Student(int ID, String firstName, String lastName) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setMathMark(double mathMark) {
        this.mathMark = mathMark;
    }

    public void setHuMark(double huMark) {
        this.huMark = huMark;
    }

    public void setRoMark(double roMark) {
        this.roMark = roMark;
    }

    @Override
    public String toString() {
        return ID + ": " + firstName + " " + lastName +" "+ "Magyar: " + mathMark +
                " " + "Roman: " + roMark + " " + "Matek: " + mathMark + '\'';
    }

}
