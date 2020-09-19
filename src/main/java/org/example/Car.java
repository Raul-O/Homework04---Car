package org.example;

public abstract class Car implements Vehicle{

    //abstract methods
    public abstract Double getFuelTankSize();
    public abstract String getFuelType();
    public abstract Double getAverageFuelConsumption();
    public abstract void setTireSize(Integer tireSize);
    public abstract Integer getTireSize();
    public abstract Integer getGears();
    //public abstract void shiftGear(Integer gear);

    //variables
    public Double availableFuel;
    public Integer tireSize;
    public String chassis;
    public Double distance = 0.0;
    public boolean isStarted=false;
    public Integer activeGear = 1;


    //methods
    public Car(Double availableFuel, String chassis) {
        this.availableFuel = availableFuel;
        this.chassis = chassis;
    }



    public void setAvailableFuel(Integer availableFuel) {
        if(this.availableFuel + availableFuel>getFuelTankSize()) {
            System.out.println("Too much");
            this.availableFuel=getFuelTankSize();
        }else {
            this.availableFuel += availableFuel;
        }
    }

    public Double getAvailableFuel() {
        return availableFuel;
    }

    public String getChassis() {
        return chassis;
    }

    @Override
    public void start(){
        if(isStarted){
            System.out.println("Car already started");
        }else {
            isStarted = true;
            distance = 0.0;

            System.out.println("Car started");
        }
    }




    @Override
    public void stop(){
        if(!isStarted){
            System.out.println("Car already stopped");
        }else {
            isStarted = false;
            System.out.println("Car stopped");
            System.out.println("Total distance " + this.distance.toString() + " Available fuel " + availableFuel);
        }

    }

    @Override
    public void drive(Double distance) {
        if(!isStarted){
            System.out.println("Car not started. Cannot drive");
        }else {
            if(availableFuel< getAverageFuelConsumption()*distance/100){
                this.distance += availableFuel*100/getAverageFuelConsumption();
                availableFuel = 0.0;
                stop();
            }else {
                this.distance += distance;
                System.out.println("Traveled distance " + distance.toString());

                availableFuel -= getAverageFuelConsumption()*distance/100;
            }
        }

    }


    public void shiftGear(Integer gear) {
        if(isStarted) {
            if (gear > getGears()) {
                System.out.println("Not a valid gear");
            } else {
                activeGear = gear;
                System.out.println("Gear " + activeGear.toString());
            }
        }else{
            System.out.println("Car not started");
        }

    }


}
