package org.example.task1;

public class MyTwitterUser implements User{
    private TwitterUser twitterUser;

    public MyTwitterUser(TwitterUser twitterUser){
        this.twitterUser = twitterUser;
    }

    @Override
    public String getEmail() {
        return twitterUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return twitterUser.getUserCountry();
    }

    @Override
    public String getLastActiveTime() {
        return twitterUser.getUserActiveTime();
    }
}
