package ru.ist_as.hhimport;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ru.ist_as.hhimport.ContentLoader;
import ru.ist_as.hhimport.SearchException;
import ru.ist_as.hhimport.vacancies.VacancyPage;
import ru.ist_as.hhimport.vacancies.gson.VacancyPageTypeAdapterFactory;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws SearchException {
        String testUrl= UrlConstants.AREAS_URL;
        Map<String,String> addParam = new HashMap<>();
       ContentLoader content = new ContentLoader(testUrl);
        /* ContentParser parser = new ContentParser(content.loadContent(addParam), new AreaItems());
        testUrl= UrlConstants.SPECIALIZATIONS_URL;
        content = new ContentLoader(testUrl);
        parser = new ContentParser(content.loadContent(addParam), new SpecializationGoups());*/
        testUrl= UrlConstants.VACANCIES_URL+"?area=1&specialization=18.291";
        content = new ContentLoader(testUrl);
        System.out.println(content.loadContent(addParam));
        Gson gson = new GsonBuilder()
                .registerTypeAdapterFactory(new VacancyPageTypeAdapterFactory())
                .create();
        VacancyPage page = gson.fromJson(content.loadContent(addParam), VacancyPage.class);

       //parser.getDeserialisedObjects(content.loadContent(addParam), Integer.class);
        System.out.println(page.getPage());
    }
}
