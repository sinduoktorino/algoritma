# 🚀 Belajar Algoritma Pemrograman dengan Java

Selamat datang! Repositori ini berisi latihan dasar untuk memahami cara menyusun langkah-langkah agar komputer dapat menyelesaikan suatu masalah. Contoh-contohnya menggunakan **Java** dan cocok untuk pemula. ☕

## 🧠 Apa itu algoritma?

Algoritma adalah urutan langkah yang logis, jelas, dan berhingga untuk mencapai hasil tertentu. Contoh sederhana: untuk menghitung total harga, kalikan harga satu barang dengan jumlah barang.

```text
Mulai
  Baca harga satuan dan jumlah barang
  totalHarga = harga satuan × jumlah barang
  Tampilkan totalHarga
Selesai
```

Program adalah algoritma yang ditulis dengan bahasa pemrograman agar dapat dijalankan oleh komputer.

## 🧩 Konsep dasar

### 1. Variabel dan tipe data

Variabel menyimpan nilai yang dapat digunakan atau diubah selama program berjalan. Misalnya, `int jumlah = 0;` membuat variabel bernama `jumlah` untuk menyimpan bilangan bulat.

### 2. Input dan output

Dengan `Scanner`, program dapat membaca masukan dari pengguna. `System.out.print` dan `System.out.println` digunakan untuk menampilkan informasi.

```java
Scanner input = new Scanner(System.in);
int angka = input.nextInt();
System.out.println("Angka: " + angka);
```

### 3. Percabangan

`if`, `else if`, dan `else` membantu program memilih tindakan berdasarkan kondisi. Contohnya, program dapat menentukan nilai huruf berdasarkan nilai angka.

```java
if (nilai >= 85) {
    System.out.println("A");
} else {
    System.out.println("Nilai di bawah 85");
}
```

### 4. Perulangan

Perulangan menjalankan instruksi berulang kali. Pada `for`, ada nilai awal, kondisi untuk melanjutkan, dan perubahan nilai setiap putaran.

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

### 5. Operator dan pola

- `%` menghitung sisa pembagian. Contohnya, `i % 2 != 0` memeriksa apakah `i` ganjil.
- `+=` menambahkan nilai ke variabel, misalnya `jumlah += i` sama dengan `jumlah = jumlah + i`.
- Perulangan bersarang adalah perulangan di dalam perulangan. Ini berguna untuk membuat pola angka.

Contoh pola untuk `N = 4`:

```text
1
1 2
1 2 3
1 2 3 4
```

## 📂 Contoh di repositori ini

| Berkas | Materi |
| --- | --- |
| `01/ifelse.java` | Percabangan untuk menentukan nilai huruf |
| `01/looping.java` | Perulangan dan penjumlahan bilangan ganjil |
| `01/pola.java` | Perulangan bersarang untuk mencetak pola angka |
| `01/TotalKembalian.java` | Input, perkalian, dan perhitungan kembalian |

## ▶️ Cara menjalankan

Pastikan Java Development Kit (JDK) sudah terpasang. Buka terminal di folder repositori, lalu jalankan salah satu contoh:

```bash
cd 01
javac pola.java
java pola
```

Ganti `pola` pada perintah di atas dengan nama kelas yang ingin dicoba, misalnya `looping`, `ifelse`, atau `TotalKembalian`. Nama berkas Java harus sesuai dengan nama kelasnya.

## 🛠️ Tips belajar

1. Baca program dari atas ke bawah dan pahami tujuan setiap variabel.
2. Coba masukkan nilai yang berbeda, lalu amati hasilnya.
3. Telusuri perubahan variabel pada setiap putaran loop.
4. Ubah satu bagian kecil, jalankan lagi, dan bandingkan hasilnya.
5. Jika hasil tidak sesuai, periksa kondisi, batas loop, dan urutan langkahnya.

Selamat belajar dan bereksperimen! 🌱