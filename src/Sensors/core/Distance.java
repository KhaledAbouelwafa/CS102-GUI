/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sensors.core;

import Sensors.Interfaces.IDistance;
import Sensors.Interfaces.Sensor;


public class Distance<T extends Character> implements IDistance<T>{
    
    private double value;
    private T unit;
    
    public Distance(double value, T unit) {
        setValue(value);
        setUnit(unit);
    }

    public Distance() {
    }
    
    @Override
    public void setUnit(T unit) {
        if (unit.equals('m')||unit.equals('M')) {
            this.unit=unit;
        } else {
            throw new IllegalArgumentException("wrong unit");
        }
    }

    @Override
    public void setValue(double value) {
        this.value=value;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public T getUnit() {
        return unit;
    }
    
    @Override
    public String toString() {
        return String.format("%.2f %s", value, unit);
    }
    
    @Override
    public int compareTo(Sensor t) {
        if(this.getValue()>t.getValue())
            return 1;
        else if(this.getValue()<t.getValue())
            return -1;
        return 0;
    }
}
