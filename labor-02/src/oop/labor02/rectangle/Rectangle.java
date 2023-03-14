package oop.labor02.rectangle;

public class Rectangle {

    //Attributumok
    private double length;
    private double width;
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }

    //a teglalap hosszusaga
    public double getLenght(){
        return this.length;
    }

    //a teglalap szelessege
    public double getWidth(){
        return this.width;
    }

    //a teglalap terulete
    public double area(){
        return length*width;
    }

    //a teglalap kerulete
    public double perimeter(){
        return 2*(length+width);
    }
}
