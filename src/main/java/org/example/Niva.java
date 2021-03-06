package org.example;

public class Niva extends Lada{

    private final Double fuelTankSize = 50.00;
    private final String fuelType = "PETROL";
    private final Integer gears = 5;
    public final Double consumptionPer100Km = 5.0;
    private Integer tireSize = 15;
    private Double fuelConsumption;

    public Niva(Double availableFuel, String chassis) {
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
        if(tireSize==15){
            fuelConsumption = consumptionPer100Km;
        }else if(tireSize==17){
            fuelConsumption = consumptionPer100Km*1.05;
        }else if(tireSize==19){
            fuelConsumption = consumptionPer100Km*1.10;
        }
        return fuelConsumption;

    }




}
