package de.thmWeb.openweather.currentweatherimporter.model;

public class Sys {

    /**
     * Internal parameter
     */
    private Integer type;

    /**
     * Internal parameter
     */
    private Long id;

    /**
     * Internal parameter
     */
    private Float message;

    /**
     * Country code (GB, JP etc.)
     */
    private String country;

    /**
     * Sunrise time, unix, UTC
     */
    private Long sunrise;

    /**
     * Sunset time, unix, UTC
     */
    private Long sunset;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getMessage() {
        return message;
    }

    public void setMessage(Float message) {
        this.message = message;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getSunrise() {
        return sunrise;
    }

    public void setSunrise(Long sunrise) {
        this.sunrise = sunrise;
    }

    public Long getSunset() {
        return sunset;
    }

    public void setSunset(Long sunset) {
        this.sunset = sunset;
    }

    @Override
    public String toString() {
        return "Sys{" +
                "type=" + type +
                ", id=" + id +
                ", message=" + message +
                ", country='" + country + '\'' +
                ", sunrise=" + sunrise +
                ", sunset=" + sunset +
                '}';
    }
}
