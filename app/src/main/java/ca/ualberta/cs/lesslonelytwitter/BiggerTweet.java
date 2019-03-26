package ca.ualberta.cs.lesslonelytwitter;

import java.util.Date;

public class BiggerTweet extends Tweet {

    public BiggerTweet() {
    }

    public BiggerTweet(String text, Date date) {
        this.tweetDate = date;
        this.tweetBody = text;
    }

    @Override
    public boolean isValid() {
        if (getTweetBody().trim().length() == 0
                || getTweetBody().trim().length() > 30) {
            return false;
        }

        return true;
    }

}
