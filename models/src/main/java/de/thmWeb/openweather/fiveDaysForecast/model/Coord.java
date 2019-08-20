package de.thmWeb.openweather.fiveDaysForecast.model;

public class Coord {

    /**
     * City geo location, longitude
     */
    private Float lon;

    /**
     * City geo location, latitude
     */
    private Float lat;

    public Float getLon() {
        return lon;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "Coord{" +
                "lon='" + lon + '\'' +
                ", lat='" + lat + '\'' +
                '}';
    }
}
