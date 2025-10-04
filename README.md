# PBO Collection - Tugas 1

Tugas 1 Pembuatan Collection dalam mata kuliah Pemrograman Berorientasi Objek (PBO).

## Informasi Mahasiswa

-   **Nama**: I Kadek Rai Pramana
-   **NIM**: 2105551094
-   **Mata Kuliah**: Pemrograman Berorientasi Objek (D)
-   **Dosen Pengampu**: Anak Agung Ketut Agung Cahyawan Wiranatha, ST, MT
-   **Tanggal**: 10 Maret 2022

## Deskripsi Proyek

Proyek ini berisi implementasi berbagai jenis Collection dalam Java sebagai bagian dari pembelajaran konsep Pemrograman Berorientasi Objek. Proyek ini mendemonstrasikan penggunaan:

1. **ArrayList** - untuk menyimpan data dalam urutan tertentu
2. **HashMap** - untuk menyimpan data dengan pasangan key-value
3. **HashSet** - untuk menyimpan data unik tanpa duplikasi

## Struktur Proyek

```
PBO-Collection/
├── README.md
└── Tugas 1_Collection/
    ├── Tugas 1_Collection.iml
    └── src/
        └── com/
            └── dicoding/
                └── javafundamental/
                    └── collection/
                        ├── Kucing.java
                        ├── ListLaptop.java
                        ├── MapKucing.java
                        └── SetSmartphone.java
```

## Penjelasan File

### 1. ListLaptop.java

**Tipe Collection**: ArrayList  
**Deskripsi**: Program untuk membuat dan memanipulasi ArrayList yang berisi daftar laptop.

**Fitur**:

-   Menambahkan data laptop ke ArrayList
-   Menghapus data yang tidak sesuai (Redmi note 11 karena bukan laptop)
-   Menampilkan seluruh daftar laptop dengan nomor urut

**Output**: Menampilkan 8 laptop setelah menghapus item yang tidak sesuai.

### 2. MapKucing.java

**Tipe Collection**: HashMap  
**Deskripsi**: Program untuk membuat dan memanipulasi HashMap yang berisi data kucing dengan key-value pair.

**Fitur**:

-   Menggunakan class `Kucing` sebagai value
-   Mendemonstrasikan penggantian value dengan key yang sama
-   Menampilkan semua data kucing dengan key-nya
-   Menampilkan ukuran Map

**Output**: Menampilkan 9 jenis kucing dengan bobotnya masing-masing.

### 3. SetSmartphone.java

**Tipe Collection**: HashSet  
**Deskripsi**: Program untuk membuat dan memanipulasi HashSet yang berisi daftar smartphone.

**Fitur**:

-   Menambahkan data smartphone ke HashSet
-   Menghapus data yang tidak sesuai (Acer Aspire karena bukan smartphone)
-   Menampilkan seluruh daftar smartphone
-   Mendemonstrasikan bahwa Set tidak memiliki duplikasi

**Output**: Menampilkan daftar smartphone unik.

### 4. Kucing.java

**Tipe**: Model Class  
**Deskripsi**: Class model untuk objek Kucing yang digunakan dalam HashMap.

**Atribut**:

-   `jenis` (String): Jenis kucing
-   `bobot` (double): Bobot kucing dalam kg

**Method**:

-   Constructor untuk inisialisasi objek
-   `toString()`: Override method untuk menampilkan informasi kucing

## Cara Menjalankan

1. Pastikan Java Development Kit (JDK) terinstall di sistem
2. Compile file Java:
    ```bash
    javac -d . src/com/dicoding/javafundamental/collection/*.java
    ```
3. Jalankan program:

    ```bash
    # Untuk ArrayList
    java com.dicoding.javafundamental.collection.ListLaptop

    # Untuk HashMap
    java com.dicoding.javafundamental.collection.MapKucing

    # Untuk HashSet
    java com.dicoding.javafundamental.collection.SetSmartphone
    ```

## Konsep yang Dipelajari

### ArrayList

-   **Ordered Collection**: Mempertahankan urutan elemen
-   **Allow Duplicates**: Memungkinkan elemen duplikat
-   **Index-based Access**: Akses elemen berdasarkan index
-   **Dynamic Size**: Ukuran dapat berubah secara dinamis

### HashMap

-   **Key-Value Pairs**: Menyimpan data dalam pasangan key-value
-   **Unique Keys**: Key harus unik, value boleh duplikat
-   **No Order Guarantee**: Tidak menjamin urutan elemen
-   **Fast Access**: Akses data yang cepat berdasarkan key

### HashSet

-   **Unique Elements**: Tidak memungkinkan elemen duplikat
-   **No Order Guarantee**: Tidak menjamin urutan elemen
-   **Set Operations**: Mendukung operasi set seperti union, intersection

## Pembelajaran

Proyek ini memberikan pemahaman praktis tentang:

1. Pemilihan Collection yang tepat sesuai kebutuhan
2. Manipulasi data dalam berbagai jenis Collection
3. Penggunaan method-method Collection Framework Java
4. Implementasi class model untuk digunakan dalam Collection
5. Best practices dalam penggunaan Collection

## Versi

-   **Versi**: 1.0
-   **Java Version**: Compatible dengan Java 8+
