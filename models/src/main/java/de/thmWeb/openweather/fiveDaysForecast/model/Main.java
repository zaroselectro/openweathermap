package de.thmWeb.openweather.fiveDaysForecast.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Main {

    /**
     * Temperature. Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
     */
    private Long temp;

    /**
     * Atmospheric pressure (on the sea level, if there is no sea_level or grnd_level data), hPa
     */
    private Long pressure;

    /**
     * Humidity, %
     */
    private Long humidity;

    /**
     * Minimum temperature at the moment. This is deviation from current temp that is possible for large cities and
     * megalopolises geographically expanded (use these parameter optionally).
     * Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
     */
    @JsonProperty("temp_min")
    private Float tempMin;

    /**
     * Maximum temperature at the moment. This is deviation from current temp that is possible for large cities and
     * megalopolises geographically expanded (use these parameter optionally).
     * Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
     */
    @JsonProperty("temp_max")
    private Float tempMax;

    /**
     * Atmospheric pressure on the sea level, hPa
     */
    @JsonProperty("sea_level")
    private Long seaLevelPressure;

    /**
     * Atmospheric pressure on the ground level, hPa
     */
    @JsonProperty("grnd_level")
    private Long groundLevelPressure;

    /**
     * Internal parameter
     */
    @JsonProperty("temp_kf")
    private Float tempKf;

    public Long getTemp() {
        return temp;
    }

    public void setTemp(Long temp) {
        this.temp = temp;
    }

    public Long getPressure() {
        return pressure;
    }

    public void setPressure(Long pressure) {
        this.pressure = pressure;
    }

    public Long getHumidity() {
        return humidity;
    }

    public void setHumidity(Long humidity) {
        this.humidity = humidity;
    }

    public Float getTempMin() {
        return tempMin;
    }

    public void setTempMin(Float tempMin) {
        this.tempMin = tempMin;
    }

    public Float getTempMax() {
        return tempMax;
    }

    public void setTempMax(Float tempMax) {
        this.tempMax = tempMax;
    }

    public Long getSeaLevelPressure() {
        return seaLevelPressure;
    }

    public void setSeaLevelPressure(Long seaLevelPressure) {
        this.seaLevelPressure = seaLevelPressure;
    }

    public Long getGroundLevelPressure() {
        return groundLevelPressure;
    }

    public void setGroundLevelPressure(Long groundLevelPressure) {
        this.groundLevelPressure = groundLevelPressure;
    }

    public Float getTempKf() {
        return tempKf;
    }

    public void setTempKf(Float tempKf) {
        this.tempKf = tempKf;
    }

    @Override
    public String toString() {
        return "Main{" +
                "temp=" + temp +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                ", tempMin=" + tempMin +
                ", tempMax=" + tempMax +
                ", seaLevelPressure=" + seaLevelPressure +
                ", groundLevelPressure=" + groundLevelPressure +
                ", tempKf=" + tempKf +
                '}';
    }
}
