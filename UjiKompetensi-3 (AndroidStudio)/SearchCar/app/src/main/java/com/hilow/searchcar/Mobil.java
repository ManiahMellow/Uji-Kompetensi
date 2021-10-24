package com.hilow.searchcar;

import androidx.cardview.widget.CardView;

public class Mobil {

  private String merkmobil, hargasewa;
  private Integer gambarmobil;

    public String getMerkmobil() {
        return merkmobil;
    }

    public void setMerkmobil(String merkmobil) {
        this.merkmobil = merkmobil;
    }

    public String getHargasewa() {
        return hargasewa;
    }

    public void setHargasewa(String hargasewa) {
        this.hargasewa = hargasewa;
    }

    public Integer getGambarmobil() {
        return gambarmobil;
    }

    public void setGambarmobil(Integer gambarmobil) {
        this.gambarmobil = gambarmobil;
    }

    public Mobil(String merkmobil, String hargasewa, Integer gambarmobil) {
        this.merkmobil = merkmobil;
        this.hargasewa = hargasewa;
        this.gambarmobil = gambarmobil;
    }
}
