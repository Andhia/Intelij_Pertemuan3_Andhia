package com.andhia.PBO.pertemuan3;

public class main {
    public static void main(String[] args) {
        sepedamotor suzuki = new sepedamotor();
        sepedamotor honda = new sepedamotor();
        sepedamotor yamaha = new sepedamotor();

        suzuki.merek = "Suzuki";
        suzuki.tipe = "GSX 150";
        suzuki.harga = 20000000;

        yamaha.merek = "yamaha";
        yamaha.tipe = "R15";
        yamaha.harga = 40000000;

        honda.merek = "Honda";
        honda.tipe = "CBR 150";
        honda.harga = 30000000;

        System.out.println("Andhia Safa Alfarisi");
        suzuki.showInfo();
        yamaha.showInfo();
        honda.showInfo();

        sepedamotor vespa = new sepedamotor("vespa","vespa matic",3000);
        vespa.showInfo();

        System.out.println(
                "motor merek: " + vespa.getMerek()+ "dengan tipe (before) :" + vespa.getTipe());

        vespa.setTipe("sprint");
        System.out.println(
                "motor merek: " + vespa.getMerek()+ "dengan tipe (after) :" + vespa.getTipe());


    }
}
