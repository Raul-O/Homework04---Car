package org.example;

public class Bronto extends Lada{

    public final Double fuelTankSize = 70.00;
    public final String fuelType = "DIESEL";
    public final Integer gears = 6;
    public final Double consumptionPer100Km = 5.0;
    private Integer tireSize=15;
    private final double increaseConsumption = 0.1;
    private Double averageFuelConsumption;
    public double temp = 0.0;

    public Bronto(Double availableFuel, String chassis) {
        super(availableFuel, chassis);
    }

    public void setTireSize(Integer tireSize){
        this.tireSize = tireSize;
    }

    public Integer getTireSize() {
        return tireSize;
    }

    public Integer getGears() {
        return gears;
    }

    @Override
    public Double getFuelTankSize() {
        return fuelTankSize;
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }

    @Override
    public Double getAverageFuelConsumption() {
        averageFuelConsumption = temp/distance;
        return averageFuelConsumption;
    }

    @Override
    public void drive(Double distance) {

        if(!isStarted){
            System.out.println("Car not started. Cannot drive");
        }else {
            if(availableFuel< consumptionPer100Km*distance/100){
                System.out.println(" Not enough fuel. Max distance ");
                System.out.print(availableFuel*100/getAverageFuelConsumption());
                this.distance += availableFuel*100/getAverageFuelConsumption();
                availableFuel = 0.0;
                stop();
            }else {
                this.distance += distance;
                System.out.println("Traveled distance " + distance.toString());
                if (activeGear.equals(gears)){
                    temp += distance*consumptionPer100Km;
                }else{
                    temp += distance*consumptionPer100Km*(1+(gears-activeGear)*increaseConsumption);
                }
                availableFuel -= getAverageFuelConsumption()*distance/100;
            }
        }

    }


}

