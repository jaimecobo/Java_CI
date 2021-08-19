package com.tts.weatherapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ZipCode {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int zipcode;

    public ZipCode() {

    }

    public ZipCode(int zipcode) {
        this.zipcode = zipcode;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "ZipCode{" +
                "id=" + id +
                ", zipcode=" + zipcode +
                '}';
    }
}
