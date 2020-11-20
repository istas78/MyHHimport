package ru.ist_as.hhimport.vacancies.item;

import java.util.ArrayList;

public class Address {
    private String city;
    private String street;
    private String building;
    private String description = null;
    private float lat;
    private float lng;
    private String raw;
    Metro MetroObject;
    ArrayList<Object> metro_stations = new ArrayList<Object>();
    private String id;

    public Address() {
    }
// Getter Methods

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getBuilding() {
        return building;
    }

    public String getDescription() {
        return description;
    }

    public float getLat() {
        return lat;
    }

    public float getLng() {
        return lng;
    }

    public String getRaw() {
        return raw;
    }

    public Metro getMetro() {
        return MetroObject;
    }

    public String getId() {
        return id;
    }

    // Setter Methods

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public void setLng(float lng) {
        this.lng = lng;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }

    public void setMetro(Metro metroObject) {
        this.MetroObject = metroObject;
    }

    public void setId(String id) {
        this.id = id;
    }
}
