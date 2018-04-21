/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sensors.core;

import Sensors.Interfaces.IHumidity;
import Sensors.Interfaces.Sensor;


public class Humidity<T extends Character> implements IHumidity<T>{
    
    private double value;
    private T unit;
    
    public Humidity(double value, T unit) {
        setValue(value);
        setUnit(unit);
    }

    public Humidity() {
    }
    
    @Override
    public void setUnit(T unit) {
        if (unit.equals('p')||unit.equals('P')) {
            this.unit = unit;
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
