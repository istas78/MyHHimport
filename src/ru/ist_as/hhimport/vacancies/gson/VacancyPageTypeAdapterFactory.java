package ru.ist_as.hhimport.vacancies.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import ru.ist_as.hhimport.vacancies.VacancyItems;
import ru.ist_as.hhimport.vacancies.VacancyPage;
import ru.ist_as.hhimport.vacancies.item.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VacancyPageTypeAdapterFactory implements TypeAdapterFactory {

        // Add @SuppressWarnings("unchecked") as needed.

        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            final Class<? super T> rawClass = typeToken.getRawType();
            if (VacancyPage.class.isAssignableFrom(rawClass)) {
                // Return EmployeeAdapter for Employee class
                return VacancyPageTypeAdapter.get(gson);
            }
            if (VacancyItems.class.isAssignableFrom(rawClass)) {
                // Return AddressAdapter for Address class
                return VacancyItemsTypeAdapter.get(gson);
            }
            if (VacancyItem.class.isAssignableFrom(rawClass)) {
                // Return AddressAdapter for Address class
                return VacancyItemTypeAdapter.get(gson);
            }
            if (Salary.class.isAssignableFrom(rawClass)) {
                // Return AddressAdapter for Address class
                return SalaryTypeAdapter.get(gson);
            }
            if (Employer.class.isAssignableFrom(rawClass)) {
                // Return AddressAdapter for Address class
                return EmployerTypeAdapter.get(gson);
            }
            return null; // let Gson find somebody else
        }

    private static final class VacancyPageTypeAdapter<T> extends TypeAdapter<T> {

            private final Gson gson;
            //private final Class<? super T> rawClass; // Not used in this example

            private VacancyPageTypeAdapter(Gson gson) {
              //  this.rawClass = rawClass;
                this.gson = gson;
            }

            private static <T> TypeAdapter<T> get(Gson gson) {
                // Wrap TypeAdapter in nullSafe so we don't need to do null checks
                return new VacancyPageTypeAdapter<T>(gson).nullSafe();
            }
            @Override
            public void write(JsonWriter out, T value)
                    throws IOException {
            }

            @Override
            public T read(JsonReader in) throws IOException {

                String fieldName;

                // Create an empty VacancyPage object
                VacancyPage page = new VacancyPage();

                // Consume start of JSON object


                in.beginObject();
                System.out.println(in.toString());
                // Iterate each key/value pair in the json object
                while (in.hasNext()) {
                    fieldName = in.nextName();
                    System.out.println(fieldName);
                    switch (fieldName) {
                        case "items":
                            page.setItems(gson.getAdapter(VacancyItems.class).read(in));
                            break;
                        case "page":
                            page.setPage(gson.getAdapter(Integer.class).read(in));
                            break;
                        default:
                            // Skip any values we don't support
                            in.skipValue();
                    }
                }
                // Consume end of JSON object
                in.endObject();

                // Return new Object
                return (T) page;

            }
        }
    private static final class VacancyItemsTypeAdapter<T> extends TypeAdapter<T> {

        private final Gson gson;
        //private final Class<? super T> rawClass; // Not used in this example

        private VacancyItemsTypeAdapter(Gson gson) {
            //  this.rawClass = rawClass;
            this.gson = gson;
        }

        private static <T> TypeAdapter<T> get(Gson gson) {
            // Wrap TypeAdapter in nullSafe so we don't need to do null checks
            return new VacancyItemsTypeAdapter<T>(gson).nullSafe();
        }
        @Override
        public void write(JsonWriter out, T value)
                throws IOException {
        }

        @Override
        public T read(JsonReader in) throws IOException {
            System.out.println(in.toString());
            String fieldName;

            // Create an empty VacancyPage object
            VacancyItems Items = new VacancyItems();

            // Consume start of JSON object
            in.beginArray();
                        System.out.println("1111111111");
            System.out.println(in.toString());
            //System.out.println(in.nextName());
            // Iterate each key/value pair in the json object
            while (in.hasNext()) {
                Items.addItem(gson.getAdapter(VacancyItem.class).read(in));

            }
            // Consume end of JSON object
            in.endArray();

            // Return new Object
            return (T) Items;

        }
    }
    private static final class VacancyItemTypeAdapter<T> extends TypeAdapter<T> {

        private final Gson gson;
        //private final Class<? super T> rawClass; // Not used in this example

        private VacancyItemTypeAdapter(Gson gson) {
            //  this.rawClass = rawClass;
            this.gson = gson;
        }

        private static <T> TypeAdapter<T> get(Gson gson) {
            // Wrap TypeAdapter in nullSafe so we don't need to do null checks
            return new VacancyItemTypeAdapter<T>(gson).nullSafe();
        }
        @Override
        public void write(JsonWriter out, T value)
                throws IOException {
        }

        @Override
        public T read(JsonReader in) throws IOException {
            System.out.println(in.toString());
             String fieldName;

            // Create an empty VacancyPage object
            VacancyItem item = new VacancyItem();

            // Consume start of JSON object
            in.beginObject();
            System.out.println(in.toString());
            // Iterate each key/value pair in the json object
            while (in.hasNext()) {
                System.out.println(in.toString());
                fieldName = in.nextName();
                switch (fieldName) {
                    case "id":
                        item.setId(gson.getAdapter(String.class).read(in));
                        break;
                    case "name":
                        item.setName(gson.getAdapter(String.class).read(in));
                        break;
                    case "salary":
                        item.setSalary(gson.getAdapter(Salary.class).read(in));
                        break;
                    case "employer":
                        item.setEmployer(gson.getAdapter(Employer.class).read(in));
                        break;
                    case "published_at":
                        item.setPublished_at(gson.getAdapter(String.class).read(in));
                        break;
                    default:
                        // Skip any values we don't support
                        in.skipValue();
                }
            }
            // Consume end of JSON object
            in.endObject();

            // Return new Object
            return (T) item;

        }
    }
    private static final class SalaryTypeAdapter<T> extends TypeAdapter<T> {

        private final Gson gson;
        //private final Class<? super T> rawClass; // Not used in this example

        private SalaryTypeAdapter(Gson gson) {
            //  this.rawClass = rawClass;
            this.gson = gson;
        }

        private static <T> TypeAdapter<T> get(Gson gson) {
            // Wrap TypeAdapter in nullSafe so we don't need to do null checks
            return new SalaryTypeAdapter<T>(gson).nullSafe();
        }
        @Override
        public void write(JsonWriter out, T value)
                throws IOException {
        }

        @Override
        public T read(JsonReader in) throws IOException {

            String fieldName;

            // Create an empty VacancyPage object
            Salary itemSalary = new Salary();

            // Consume start of JSON object
            in.beginObject();

            // Iterate each key/value pair in the json object
            while (in.hasNext()) {
                fieldName = in.nextName();
                switch (fieldName) {
                    case "from":
                        itemSalary.setFrom(gson.getAdapter(Float.class).read(in));
                        break;
                    case "to":
                        itemSalary.setTo(gson.getAdapter(String.class).read(in));
                        break;
                    case "currency":
                        itemSalary.setCurrency(gson.getAdapter(String.class).read(in));
                        break;
                    case "gross":
                        itemSalary.setGross(gson.getAdapter(Boolean.class).read(in));
                        break;
                    default:
                        // Skip any values we don't support
                        in.skipValue();
                }
            }
            // Consume end of JSON object
            in.endObject();

            // Return new Object
            return (T) itemSalary;

        }
    }
    private static final class EmployerTypeAdapter<T> extends TypeAdapter<T> {

        private final Gson gson;
        //private final Class<? super T> rawClass; // Not used in this example

        private EmployerTypeAdapter(Gson gson) {
            //  this.rawClass = rawClass;
            this.gson = gson;
        }

        private static <T> TypeAdapter<T> get(Gson gson) {
            // Wrap TypeAdapter in nullSafe so we don't need to do null checks
            return new EmployerTypeAdapter<T>(gson).nullSafe();
        }
        @Override
        public void write(JsonWriter out, T value)
                throws IOException {
        }

        @Override
        public T read(JsonReader in) throws IOException {

            String fieldName;

            // Create an empty VacancyPage object
            Employer itemEmployer = new Employer();

            // Consume start of JSON object
            in.beginObject();

            // Iterate each key/value pair in the json object
            while (in.hasNext()) {
                fieldName = in.nextName();
                switch (fieldName) {
                    case "1d":
                        itemEmployer.setId(gson.getAdapter(String.class).read(in));
                        break;
                    case "name":
                        itemEmployer.setName(gson.getAdapter(String.class).read(in));
                        break;
                    case "url":
                        itemEmployer.setUrl(gson.getAdapter(String.class).read(in));
                        break;
                    default:
                        // Skip any values we don't support
                        in.skipValue();
                }
            }
            // Consume end of JSON object
            in.endObject();

            // Return new Object
            return (T) itemEmployer;

        }
    }
}
