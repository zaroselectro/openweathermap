package de.thmWeb.openweather.currentweatherimporter.model;

import java.util.List;

public class CurrentWeatherModel {

    /**
     * The {@link Coord}
     */
    private Coord coord;

    /**
     * A list of {@link Weather}
     */
    private List<Weather> weather;

    /**
     * Internal parameter
     */
    private String base;

    /**
     * The {@link Main}
     */
    private Main main;

    /**
     * Visibility, meter
     */
    private Long visibility;

    /**
     * The {@link Wind}
     */
    private Wind wind;

    /**
     * The {@link Clouds}
     */
    private Clouds clouds;

    /**
     * Time of data calculation, unix, UTC
     */
    private Long dt;

    /**
     * The {@link Sys}
     */
    private Sys sys;

    /**
     * The {@link Rain}
     */
    private Rain rain;

    /**
     * The {@link Snow}
     */
    private Snow snow;

    /**
     * Shift in seconds from UTC
     */
    private Long timezone;

    /**
     * City ID
     */
    private Long id;

    /**
     * City name
     */
    private String name;

    /**
     * Internal parameter
     */
    private Integer cod;

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Long getVisibility() {
        return visibility;
    }

    public void setVisibility(Long visibility) {
        this.visibility = visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Long getDt() {
        return dt;
    }

    public void setDt(Long dt) {
        this.dt = dt;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public Rain getRain() {
        return rain;
    }

    public void setRain(Rain rain) {
        this.rain = rain;
    }

    public Snow getSnow() {
        return snow;
    }

    public void setSnow(Snow snow) {
        this.snow = snow;
    }

    public Long getTimezone() {
        return timezone;
    }

    public void setTimezone(Long timezone) {
        this.timezone = timezone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        return "CurrentWeatherModel{" +
                "coord=" + coord +
                ", weather=" + weather +
                ", base='" + base + '\'' +
                ", main=" + main +
                ", visibility=" + visibility +
                ", wind=" + wind +
                ", clouds=" + clouds +
                ", dt=" + dt +
                ", sys=" + sys +
                ", rain=" + rain +
                ", snow=" + snow +
                ", timezone=" + timezone +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", cod=" + cod +
                '}';
    }
}
