/* Judul        : Program Latihan 1                     */
/* Deskripsi    : Program untuk membuat Hash Map        */
/* Developer    : I Kadek Rai Pramana (2105551094)      */
/* Tanggal      : 10 Maret 2022                         */
/* Versi        : 1.0                                   */

// package
package com.dicoding.javafundamental.collection;

// import library
import java.util.HashMap;
import java.util.Map;

// class
public class MapKucing {

    // fungsi main
    public static void main(String[] args) {

        // membuat dan menggunakan HashMap kucing
        Map<String, Kucing> kucings = new HashMap();

        // menambahkan objek ke map menggunakan method put()
        kucings.put("key-1", new Kucing("Maine coon", 8.2));
        kucings.put("key-2", new Kucing("Bulu pendek", 6.8));
        kucings.put("key-3", new Kucing("Ragdoll", 4.9));
        kucings.put("key-4", new Kucing("Munchkin", 7.11));
        kucings.put("key-5", new Kucing("Scottish Fold", 8.12));
        kucings.put("key-6", new Kucing("Savannah", 9));
        kucings.put("key-7", new Kucing("Siberia", 6.5));
        kucings.put("key-8", new Kucing("Russian Blue", 5.78));
        kucings.put("key-9", new Kucing("Himalaya", 6.9));
        kucings.put("key-1", new Kucing("Persia", 5.3)); // menambahkan key yang sama ke Map

        // method size() untuk mendapatkan ukuran map
        System.out.println("List kucing: (size = "+ kucings.size() +")");

        // mencetak seluruh map laptop
        // looping key dari Map
        for (String key : kucings.keySet()) {
            // method get() untuk melihat isi Map berdasarkan key
            System.out.println("\t " + key + " : " + kucings.get(key));
        }
    }
}
