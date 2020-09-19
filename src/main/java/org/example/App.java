package org.example;

public class App 
{
    public static void main( String[] args )
    {

        Car c1 = new Niva(20.00, "uioqwejjaoio");
        Car c2 = new Niva(20.00, "zzzzzzzzzzz");
        Car c3 = new Bronto(20.00, "as987d8798asy89");

        c1.start();
        c1.shiftGear(1);
        c1.drive(2.0);
        c1.shiftGear(2);
        c1.drive(4.0);
        c1.shiftGear(3);
        c1.drive(20.0);
        c1.stop();
        c2.setTireSize(17);
        c2.start();
        c2.shiftGear(1);
        c2.drive(2.0);
        c2.shiftGear(2);
        c2.drive(4.0);
        c2.shiftGear(3);
        c2.drive(20.0);
        c2.stop();
        c3.start();
        c3.shiftGear(1);
        c3.drive(2.0);
        c3.shiftGear(2);
        c3.drive(4.0);
        c3.shiftGear(6);
        c3.drive(20.0);
        c3.stop();


        System.out.println(c1.getAverageFuelConsumption());
        System.out.println(c2.getAverageFuelConsumption());
        System.out.println(c3.getAverageFuelConsumption());


    }
}
