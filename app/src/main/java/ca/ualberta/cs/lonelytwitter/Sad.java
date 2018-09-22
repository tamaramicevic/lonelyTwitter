package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by micevic on 9/20/18.
 */

public class Sad extends Mood {

    public Sad() {
        super();
    }

    public Sad(Date date) {
        super(date);
    }

    @Override
    public String getMood() {
        return "I am sad.";
    }
}
