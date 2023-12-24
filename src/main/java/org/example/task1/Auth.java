package org.example.task1;

import com.sun.nio.sctp.AbstractNotificationHandler;

public class Auth {
    public User login(){
        int n = 0;
        if (n > 0){
            return new MyFaceBookUser(new FaceBookUser());
        }
        else{
            return new MyTwitterUser(new TwitterUser());
        }
    }

    public  void doJob(User user){
        String country = user.getCountry();
    }
}
