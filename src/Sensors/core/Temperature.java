/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sensors.core;

import Sensors.Interfaces.ITempreture;
import Sensors.Interfaces.Sensor;


public class Temperature<T extends Character> implements ITempreture<Character> {

    private double value;
    private Character unit;
    
    public Temperature(double value, Character unit) {
        setValue(value);
        setUnit(unit);
    }

    public Temperature() {
    }
    
    @Override
    public void setUnit(Character unit) {
        if (unit.equals('c') || unit.equals('k') || unit.equals('C') || unit.equals('K')) {
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
    public Character getUnit() {
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
