package com.cwrudatingwebsite;
public class Profile {
    private String pBio;
    public Profile(String bio)
    {
        pBio = bio;
    }
    public String getBio()
    {
        return pBio; //return the string pBio
    }
    public void setBio(String newBio)
    {
        pBio = newBio; //change bio to String newBio 
    }
}
