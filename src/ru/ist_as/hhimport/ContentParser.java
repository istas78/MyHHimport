package ru.ist_as.hhimport;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.Primitives;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.*;
import java.io.*;


public class ContentParser {
    Map descontent= new HashMap();

    public ContentParser(String jsonContent, AreaItems items) {

        List<AreaItems> listItemsDes = getDesAreaItems(jsonContent);
        //System.out.println(jsonContent);
       for (AreaItems item: listItemsDes){
          //descontent.put(item.id,item.name);
           System.out.println(item.getId()+ " "+ item.getName());
           if(!item.getAreas().isJsonNull()){
               //system.out.println(item.getareas().tostring().replace("=",":"));
               List<AreaItems> listitemsdes2 = getDesAreaItems(item.getAreas().toString());
               for (AreaItems item2: listitemsdes2){
               //    descontent.put(item2.id,item2.name);
                   System.out.println(item2.getId()+ " "+ item2.getName());
                   if(!item2.getAreas().isJsonNull()){
                       List<AreaItems> listitemsdes3 = getDesAreaItems(item2.getAreas().toString());
                       for (AreaItems item3: listitemsdes2){
                           System.out.println(item3.getId()+ " "+ item3.getName());
                 //          descontent.put(item3.id,item3.name);

                       }
                   }
               }
           }

       }
    }
    public List<AreaItems> getDesAreaItems(String jsonContent) {
        Type itemsListType = new TypeToken<List<AreaItems>>() {}.getType();
        List<AreaItems> listItemsDes = new Gson().fromJson(jsonContent,itemsListType);
        return listItemsDes;
    }

    public ContentParser(String jsonContent, SpecializationGoups items) {

        List<SpecializationGoups> listItemsDes = getDesSpecItems(jsonContent);
        //System.out.println(jsonContent);
        for (SpecializationGoups item: listItemsDes) {
            //descontent.put(item.id,item.name);
            System.out.println(item.getId() + " " + item.getName());

            List<SpecializationItems> listitemsdes2 = getDesSpecItems2(item.getSpecializations().toString());
            for (SpecializationItems item2 : listitemsdes2) {
                //    descontent.put(item2.id,item2.name);
                System.out.println(item2.getId() + " " + item2.getName());

            }
        }
    }
    public List<SpecializationGoups> getDesSpecItems(String jsonContent) {
        Type itemsListType = new TypeToken<List<SpecializationGoups>>() {}.getType();
        List<SpecializationGoups> listItemsDes = new Gson().fromJson(jsonContent,itemsListType);
        return listItemsDes;
    }
    public List<SpecializationItems> getDesSpecItems2(String jsonContent) {
        Type itemsListType = new TypeToken<List<SpecializationItems>>() {}.getType();
        List<SpecializationItems> listItemsDes = new Gson().fromJson(jsonContent,itemsListType);
        return listItemsDes;
    }

   }
