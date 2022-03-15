/* Judul        : Program Latihan 1                     */
/* Deskripsi    : Program untuk membuat Hash Set        */
/* Developer    : I Kadek Rai Pramana (2105551094)      */
/* Tanggal      : 10 Maret 2022                         */
/* Versi        : 1.0                                   */

// package
package com.dicoding.javafundamental.collection;

// import library
import java.util.HashSet;
import java.util.Set;

// class
public class SetSmartphone {

    // fungsi main
    public static void main(String[] args) {

        // membuat dan menggunakan HashSet smartphone
        Set<String> smartphones = new HashSet<>();

        // menambahkan objek ke list menggunakan method add()
        smartphones.add("Redmi 9c");            // index 0
        smartphones.add("Nokia 5");             // index 1
        smartphones.add("Infinix Note 11");     // index 2
        smartphones.add("Infinix Note 11S");    // index 3
        smartphones.add("Samsung Galaxy S22");  // index 4
        smartphones.add("Samsung Galaxy Z");    // index 5
        smartphones.add("Huawei P50 Pro");      // index 6
        smartphones.add("Acer Aspire");         // index 7 (bukan smartphone)
        smartphones.add("Iphone");              // index 8

        // mengeluarkan objek dari list menggunakan method remove()
        smartphones.remove("Acer Aspire");

        System.out.println("List smartphone :");

        // mencetak seluruh list laptop
        for(String smartphone : smartphones){
            System.out.println("\t smartphone " + smartphone);
        }
    }
}
