package ru.ist_as.hhimport.vacancies.item;

public class Employer {
    private String id;
    private String name;
    private String url;
    private String alternate_url;
    Logo_urls Logo_urlsObject;
    private String vacancies_url;
    private boolean trusted;

    public Employer() {
    }

// Getter Methods

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getAlternate_url() {
        return alternate_url;
    }

    public Logo_urls getLogo_urls() {
        return Logo_urlsObject;
    }

    public String getVacancies_url() {
        return vacancies_url;
    }

    public boolean getTrusted() {
        return trusted;
    }

    // Setter Methods

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setAlternate_url(String alternate_url) {
        this.alternate_url = alternate_url;
    }

    public void setLogo_urls(Logo_urls logo_urlsObject) {
        this.Logo_urlsObject = logo_urlsObject;
    }

    public void setVacancies_url(String vacancies_url) {
        this.vacancies_url = vacancies_url;
    }

    public void setTrusted(boolean trusted) {
        this.trusted = trusted;
    }
}
