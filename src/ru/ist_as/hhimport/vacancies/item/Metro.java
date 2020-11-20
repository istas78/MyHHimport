package ru.ist_as.hhimport.vacancies.item;

public class Metro {
    private String station_name;
    private String line_name;
    private String station_id;
    private String line_id;
    private float lat;
    private float lng;

    public Metro() {
    }
// Getter Methods

    public String getStation_name() {
        return station_name;
    }

    public String getLine_name() {
        return line_name;
    }

    public String getStation_id() {
        return station_id;
    }

    public String getLine_id() {
        return line_id;
    }

    public float getLat() {
        return lat;
    }

    public float getLng() {
        return lng;
    }

    // Setter Methods

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public void setLine_name(String line_name) {
        this.line_name = line_name;
    }

    public void setStation_id(String station_id) {
        this.station_id = station_id;
    }

    public void setLine_id(String line_id) {
        this.line_id = line_id;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public void setLng(float lng) {
        this.lng = lng;
    }
}
