package ru.ist_as.hhimport.vacancies.item;

public class Salary {
    private float from;
    private String to = null;
    private String currency;
    private boolean gross;

    public Salary() {
    }
// Getter Methods

    public float getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getCurrency() {
        return currency;
    }

    public boolean getGross() {
        return gross;
    }

    // Setter Methods

    public void setFrom(float from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setGross(boolean gross) {
        this.gross = gross;
    }
}
