package com.example.rimjhimintern;

public class FitnessLst {
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImdId() {
        return imdId;
    }

    public void setImdId(int imdId) {
        this.imdId = imdId;
    }

    private int imdId;

    public FitnessLst(String name, int imdId) {
        this.name = name;
        this.imdId = imdId;
    }
}
