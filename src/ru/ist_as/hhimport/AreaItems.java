package ru.ist_as.hhimport;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.ArrayList;

public class AreaItems {
        String id;
        String parent_id;
        String name;
        JsonArray areas;

    public AreaItems(String id, String parent_id, String name, JsonArray areas) {
        this.id = id;
        this.parent_id = parent_id;
        this.name = name;
        this.areas = areas;
    }

    public AreaItems() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JsonArray getAreas() {
        return areas;
    }

    public void setAreas(JsonArray areas) {
        this.areas = areas;
    }
}
