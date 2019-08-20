package de.thmWeb.openweather.fiveDaysForecast.model;

import java.util.List;

public class FiveDaysForecastModel {

    private String code;
    private String message;
    private City city;
    private Long cnt;
    private List<WeatherForecast> list;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Long getCnt() {
        return cnt;
    }

    public void setCnt(Long cnt) {
        this.cnt = cnt;
    }

    public List<WeatherForecast> getList() {
        return list;
    }

    public void setList(List<WeatherForecast> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "FiveDaysForecastModel{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", city=" + city +
                ", cnt=" + cnt +
                ", list=" + list +
                '}';
    }
}
