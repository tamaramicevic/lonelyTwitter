package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by micevic on 9/20/18.
 */

public class Happy extends Mood {

    public Happy() {
        super();
    }

    public Happy(Date date) {
        super(date);
    }

    @Override
    public String getMood() {
        return "I am happy!";
    }

}
