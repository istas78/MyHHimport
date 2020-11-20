package ru.ist_as.hhimport.vacancies;

import ru.ist_as.hhimport.vacancies.item.VacancyItem;

import java.util.ArrayList;
import java.util.List;

public class VacancyItems {
    List<VacancyItem> items= new ArrayList<>();

    public VacancyItems() {
    }

    public List<VacancyItem> getItems() {
        return items;
    }

    public void setItems(List<VacancyItem> items) {
        this.items = items;
    }
    public void addItem(VacancyItem item) {
        this.items.add(item);
    }
}
