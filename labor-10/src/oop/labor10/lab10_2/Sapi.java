package oop.labor10.lab10_2;

import oop.labor10.lab10_2.Building;

public class Sapi extends Building {
    private final int classRooms;

    public Sapi(int height, int floors, String name, int classRooms) {
        super(height, floors, name);
        this.classRooms=classRooms;
    }

    @Override
    public void PrintDimension() {
        if(height>200) {
            System.out.println("M");
        }
    }
}
