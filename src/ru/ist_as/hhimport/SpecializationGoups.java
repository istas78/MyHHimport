package ru.ist_as.hhimport;

import com.google.gson.JsonArray;

public class SpecializationGoups {
    String id;
    String name;
    JsonArray specializations;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JsonArray getSpecializations() {
        return specializations;
    }

    public void setSpecializations(JsonArray specializations) {
        this.specializations = specializations;
    }

    public SpecializationGoups(String id, String name, JsonArray specializations) {
        this.id = id;
        this.name = name;
        this.specializations = specializations;
    }

    public SpecializationGoups() {
    }
}
