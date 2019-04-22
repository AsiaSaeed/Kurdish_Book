package com.example.myapplication.Model;

import java.util.ArrayList;

public class Wanekan {
    private String wane;
    private int id;
    private String pet;

    public Wanekan(String wane, int id, String pet) {
        this.wane = wane;
        this.id = id;
        this.pet = pet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWane() {
        return wane;
    }

    public void setWane(String wane) {
        this.wane = wane;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }
}
