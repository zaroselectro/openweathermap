package de.thmWeb.openweather.currentweatherimporter.model;

public class Weather {

    /**
     * Weather condition id
     */
    private Integer id;

    /**
     * Group of weather parameters (Rain, Snow, Extreme etc.)
     */
    private String main;

    /**
     * Weather condition within the group
     */
    private String description;

    /**
     * Weather icon id
     */
    private String icon;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "id='" + id + '\'' +
                ", main='" + main + '\'' +
                ", description='" + description + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
}
