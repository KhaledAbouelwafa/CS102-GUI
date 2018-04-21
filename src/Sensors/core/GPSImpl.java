/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sensors.core;

import Sensors.Interfaces.GPS;


public class GPSImpl implements GPS{
    
    private double lat;
    private double lng;

    public GPSImpl(double lat, double lon) {
        setLatitude(lat);
        setLongitude(lon);
    }

    @Override
    public double getLatitude() {
        return lat;
    }

    @Override
    public double getLongitude() {
        return lng;
    }

    @Override
    public String toString() {
        return lat + ", " + lng;
    }

    @Override
    public void setLatitude(double lat) {
        if(lat>=-85 && lat<=85)
        {
            this.lat = lat;
        }
        else
            throw new IllegalArgumentException("latitude must be in the interval [-85, +85] ");
    }

    @Override
    public void setLongitude(double lng) {
        if(lng>=-180 && lng<=180)
        {
            this.lng = lng;
        }
        else
            throw new IllegalArgumentException("longitude must be in the interval [-180, +180] ");
    }
   
}
