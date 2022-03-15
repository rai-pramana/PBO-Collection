/* Judul        : Program Latihan 1                     */
/* Deskripsi    : Program untuk membuat Array List      */
/* Developer    : I Kadek Rai Pramana (2105551094)      */
/* Tanggal      : 10 Maret 2022                         */
/* Versi        : 1.0                                   */

// package
package com.dicoding.javafundamental.collection;

// import library
import java.util.ArrayList;
import java.util.List;

// class
public class ListLaptop {

    // fungsi main
    public static void main(String[] args) {

        // membuat dan menggunakan ArrayList laptop
        List<String> laptops = new ArrayList<>();

        // menambahkan objek ke list menggunakan method add()
        laptops.add("Asus Vivobook");            // index 0
        laptops.add("MacBook Pro");              // index 1
        laptops.add("Acer Aspire");              // index 2
        laptops.add("HP Notebook");              // index 3
        laptops.add("Redmi note 11");            // index 4 (bukan laptop)
        laptops.add("Lenovo ThinkPad");          // index 5
        laptops.add("Dell Inspiron");            // index 6
        laptops.add("Xiaomi Mi Notebook Air");   // index 7
        laptops.add("Infinix INBook X1");        // index 8

        // mengeluarkan objek dari list menggunakan method remove()
        laptops.remove(4);

        System.out.println("List laptop :");

        int i = 0;
        // mencetak seluruh list laptop
        // method size() untuk mendapatkan ukuran list
        while (i < laptops.size()){
            // method get() untuk melihat isi List pada index ke-i
            System.out.println("\t Laptop ke-"+ (i + 1) +" : " + laptops.get(i));

            // increment counter
            i++;
        }
    }
}
