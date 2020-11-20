package ru.ist_as.hhimport.vacancies;

public class VacancyPage {
    VacancyItems items;
    Integer found;
    Integer pages;
    Integer per_page;
    Integer page;
    Integer clusters;
    Integer arguments;
    String alternate_url;

    public VacancyPage() {

    }

    public VacancyPage(VacancyItems items, Integer found, Integer pages, Integer per_page, Integer page, Integer clusters, Integer arguments, String alternate_url) {
        this.items = items;
        this.found = found;
        this.pages = pages;
        this.per_page = per_page;
        this.page = page;
        this.clusters = clusters;
        this.arguments = arguments;
        this.alternate_url = alternate_url;
    }

    public VacancyItems getItems() {
        return items;
    }

    public void setItems(VacancyItems items) {
        this.items = items;
    }

    public Integer getFound() {
        return found;
    }

    public void setFound(Integer found) {
        this.found = found;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getPer_page() {
        return per_page;
    }

    public void setPer_page(Integer per_page) {
        this.per_page = per_page;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getClusters() {
        return clusters;
    }

    public void setClusters(Integer clusters) {
        this.clusters = clusters;
    }

    public Integer getArguments() {
        return arguments;
    }

    public void setArguments(Integer arguments) {
        this.arguments = arguments;
    }

    public String getAlternate_url() {
        return alternate_url;
    }

    public void setAlternate_url(String alternate_url) {
        this.alternate_url = alternate_url;
    }
}
