package oop.labor02.rectangle;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Rectangle teglalap1 = new Rectangle(10,5);
        System.out.println(teglalap1.getLenght()+" "+teglalap1.getWidth());
        System.out.println("terulet: "+teglalap1.area());
        System.out.println("kerulet: "+teglalap1.perimeter());
        Rectangle[] teglalapok=new Rectangle[10];
        for(int i=0; i<teglalapok.length; i++){
            // use a random generator
            Random rand = new Random();
//generate positive random numbers less than a bound
            double length = 1 + rand.nextInt(10);
            double width = 1 + rand.nextInt(10) ;
            if(length<width){
                double a;
                a=length;
                length=width;
                width=a;
                }
            teglalapok[ i ] = new Rectangle(length, width);
        }
        double totalAreal=0;
        double totalPerimeter=0;
        for(int i=0; i<teglalapok.length; i++){
            totalAreal+=teglalapok[i].area();
            totalPerimeter+=teglalapok[i].perimeter();
            System.out.println(teglalapok[i].getLenght()+" "+teglalapok[i].getWidth()+"Terulet: "+teglalapok[i].area()+"Kerulet: "+ teglalapok[i].perimeter());
        }
        System.out.println("Osszterulet: "+totalAreal);
        System.out.println("Osszkerulet: "+totalPerimeter);
    }
}
