package com.cwrudatingwebsite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfileTest {
    @Test
    public void testProfile()
    {
        Profile profile=new Profile("Bio");
        profile.setBio("newBio");
        Assertions.assertEquals(profile.getBio(),"newBio");
    }


}