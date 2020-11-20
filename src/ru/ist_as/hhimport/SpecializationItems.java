package ru.ist_as.hhimport;

import com.google.gson.JsonArray;

public class SpecializationItems {
    Double id;

    public SpecializationItems(Double id, String name, Boolean laboring) {
        this.id = id;
        this.name = name;
        this.laboring = laboring;
    }

    String name;
    Boolean laboring;

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getLaboring() {
        return laboring;
    }

    public void setLaboring(Boolean laboring) {
        this.laboring = laboring;
    }
}
