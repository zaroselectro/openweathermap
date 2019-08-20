package de.thmWeb.openweather.fiveDaysForecast.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Snow {

    /**
     * Snow volume for the last 1 hour, mm
     */
    @JsonProperty("1h")
    private Long volumeForLast1Hour;

    /**
     * Snow volume for the last 3 hours, mm
     */
    @JsonProperty("3h")
    private Long volumeForLast3Hours;

    public Long getVolumeForLast1Hour() {
        return volumeForLast1Hour;
    }

    public void setVolumeForLast1Hour(Long volumeForLast1Hour) {
        this.volumeForLast1Hour = volumeForLast1Hour;
    }

    public Long getVolumeForLast3Hours() {
        return volumeForLast3Hours;
    }

    public void setVolumeForLast3Hours(Long volumeForLast3Hours) {
        this.volumeForLast3Hours = volumeForLast3Hours;
    }

    @Override
    public String toString() {
        return "Rain{" +
                "volumeForLast1Hour=" + volumeForLast1Hour +
                ", volumeForLast3Hours=" + volumeForLast3Hours +
                '}';
    }
}
