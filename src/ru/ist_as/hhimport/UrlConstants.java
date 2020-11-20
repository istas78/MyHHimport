package ru.ist_as.hhimport;

public final class UrlConstants {

    public static final String BASE_API_URL = "https://api.hh.ru";
    public static final String VACANCIES_URL = BASE_API_URL + "/vacancies";
    public static final String VACANCY_URL = BASE_API_URL + "/vacancies/%s";
    public static final String SPECIALIZATIONS_URL = BASE_API_URL + "/specializations";
    public static final String AREAS_URL = BASE_API_URL + "/areas";
    public static final String AREA_URL = BASE_API_URL + "/areas/%s";

    private UrlConstants() {
    }
}
