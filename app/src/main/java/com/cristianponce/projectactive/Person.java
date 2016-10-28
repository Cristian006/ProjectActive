package com.cristianponce.projectactive;

import android.media.Image;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.Years;


/**
 * Created by Cristian Ponce on 9/15/2016.
 */
public class Person {
    private Image profilePicture;
    private String name;
    private LocalDate birthDate;
    private int weight;
    private int height;
    private GenderType gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    public Image getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(Image profilePicture) {
        this.profilePicture = profilePicture;
    }

    public int getAge() {
        LocalDate now = new LocalDate(2014, 2, 28); // test, in real world without args
        return Years.yearsBetween(birthDate, now).getYears();
    }
}