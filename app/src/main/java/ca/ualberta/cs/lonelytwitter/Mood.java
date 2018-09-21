package ca.ualberta.cs.lonelytwitter;

/**
 * Created by micevic on 9/20/18.
 */

public abstract class Mood {
    protected String date;

    public Mood(String date) {
        this.date = date;
    }

    public Mood() {
        this.date = "January 22 2018";
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return this.date;
    }

    public abstract String getMood();
}
