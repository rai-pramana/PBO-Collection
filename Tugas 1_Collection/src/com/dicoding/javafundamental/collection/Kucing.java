/* Deskripsi    : Class Kucing untuk HashMap kucings      */

package com.dicoding.javafundamental.collection;

// class untuk HashMap kucings
public class Kucing {
    // membuat atribut
    private String jenis;
    private double bobot;

    public Kucing(String jenis, double bobot) {
        this.jenis = jenis;
        this.bobot = bobot;
    }

    // method
    @Override
    public String toString() {
        // mengembalikan jenis dan bobot Kucing ke class MapKucing
        return "Kucing " + jenis + ", bobot: " + bobot + "kg";
    }
}