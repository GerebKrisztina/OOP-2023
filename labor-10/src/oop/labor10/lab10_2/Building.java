package oop.labor10.lab10_2;

public class Building {
    private final int height;
    private final int floors;
    private final String name;

    public Building(int height, int floors, String name) {
        this.height = height;
        this.floors = floors;
        this.name = name;
    }

    public void PrintDimension() {
        if(this.height > 100) {
            System.out.println("magas");
        } else {
            System.out.println("alasony");
        }
    }
}
