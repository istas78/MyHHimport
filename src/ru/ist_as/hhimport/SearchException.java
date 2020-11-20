package ru.ist_as.hhimport;

import static java.lang.String.format;

public class SearchException  extends Exception {
    private static final long serialVersionUID = 1082767465462939083L;

    public SearchException(Exception e) {
        super(e.getMessage(), e);
    }

    public SearchException(String message, Object... args) {
        super(format(message, args));
    }
}

