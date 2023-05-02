package com.andhia.PBO.pertemuan3;

public class sepedamotor {
    String merek;
    String tipe;
    int harga;


    public sepedamotor(String merek, String tipe, int harga) {
        this.merek = merek;
        this.tipe = tipe;
        this.harga = harga;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public sepedamotor() {

    }

    public void showInfo(){
        System.out.println("merek : " + merek);
        System.out.println("Tipe :" + tipe);
        System.out.println("harga :" + harga);
        System.out.println();
    }
}
