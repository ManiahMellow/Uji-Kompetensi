package com.hilow.searchcar;

public class DetailMobil {

    private String detailmerk, detailharga;
    private Integer detailgambar;

    public DetailMobil(String detailmerk, String detailharga, Integer detailgambar) {
        this.detailmerk = detailmerk;
        this.detailharga = detailharga;
        this.detailgambar = detailgambar;
    }

    public String getDetailmerk() {
        return detailmerk;
    }

    public void setDetailmerk(String detailmerk) {
        this.detailmerk = detailmerk;
    }

    public String getDetailharga() {
        return detailharga;
    }

    public void setDetailharga(String detailharga) {
        this.detailharga = detailharga;
    }

    public Integer getDetailgambar() {
        return detailgambar;
    }

    public void setDetailgambar(Integer detailgambar) {
        this.detailgambar = detailgambar;
    }
}
