package org.example.task1;

public class MyFaceBookUser implements User{
    private FaceBookUser faceBookUser;

    public MyFaceBookUser(FaceBookUser faceBookUser){
        this.faceBookUser = faceBookUser;
    }

    @Override
    public String getEmail() {
        return faceBookUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return faceBookUser.getUserCountry();
    }

    @Override
    public String getLastActiveTime() {
        return faceBookUser.getUserActiveTime();
    }
}
