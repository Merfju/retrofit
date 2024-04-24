package com.example.retrofit;

import com.google.gson.annotations.SerializedName;

public class Pytanie {

    @SerializedName("tresc")
    private String trescPytania;
    private String odpA;
    private String odpB;
    private String odpC;

    @SerializedName("poprawna")
    private int poprawnaOdp;

    public String getTrescPytania() {
        return trescPytania;
    }

    public String getOdpA() {
        return odpA;
    }

    public String getOdpB() {
        return odpB;
    }

    public String getOdpC() {
        return odpC;
    }

    public int getPoprawnaOdp() {
        return poprawnaOdp;
    }
}
