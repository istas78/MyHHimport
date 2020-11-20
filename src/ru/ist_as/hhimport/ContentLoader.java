package ru.ist_as.hhimport;

import ru.ist_as.hhimport.SearchException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class ContentLoader {
    private static final Logger LOG = Logger.getLogger(ContentLoader.class.getName());
    //private Map<String, String> headers = new HashMap<>();
    private String urlWithParams = "";
    ContentLoader(String params) {
        //this.headers = headers;
        this.urlWithParams = params;
    }
    public String loadContent(Map addParams) throws SearchException {
        assert (urlWithParams != null);
        try {
            String url = appendParameters(addParams);
            LOG.info("Загружаю данные с {}." + url);
            URL hhUrl = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) hhUrl.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", "MyHHImport");
            connection.setRequestProperty("Accept", "application/json");
            connection.connect();
            String content = readInputStreamToString(connection);
            connection.disconnect();
            return content;
        } catch (IOException e) {
            LOG.severe(e.getMessage());
            throw new SearchException(e);
        }
    }
    protected String appendParameters(Map<String, String> addParams) {
        StringBuilder builder = new StringBuilder(urlWithParams);
        for (String key : addParams.keySet()) {
                String value = addParams.get(key);
                if (builder.indexOf("?") == -1) {
                    builder.append("?");
                } else {
                    builder.append("&");
                }
                builder.append(key);
                builder.append("=");
                builder.append(value);

        }
        return builder.toString();
    }
    private String readInputStreamToString(HttpURLConnection conn)
            throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                conn.getInputStream(), "UTF-8"));
        StringBuilder builder = new StringBuilder();
        while (true) {
            String line = reader.readLine();
            if (line != null) {
                builder.append(line);
            } else {
                break;
            }
        }
        return builder.toString();
    }
}
