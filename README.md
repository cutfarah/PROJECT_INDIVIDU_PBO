# PROJECT_INDIVIDU_PBO (BUS TRANS KOETARADJA)
Program ini merupakan simulasi sederhana pengelolaan penumpang pada Bus Trans Koetaradja menggunakan bahasa pemrograman Java. Sistem memungkinkan pengguna menambahkan penumpang, menurunkan penumpang, serta melihat kondisi bus melalui menu interaktif. Seluruh logika penempatan penumpang mengikuti aturan yang telah ditetapkan mengenai kursi prioritas, kursi biasa, dan area berdiri.

**1. Deskripsi Program**

Program ini mengatur tiga jenis area dalam bus: kursi prioritas (4 tempat), kursi biasa (16 tempat), dan area berdiri (20 tempat). Ketika ada penumpang yang ingin naik, program akan mengevaluasi usia dan status hamil untuk menentukan apakah ia termasuk kategori prioritas. Penumpang yang memenuhi kategori ini akan ditempatkan terlebih dahulu di kursi prioritas, kemudian dialihkan ke kursi biasa jika penuh, dan terakhir ke area berdiri apabila seluruh kursi telah terisi. Penumpang biasa akan diarahkan ke kursi biasa atau area berdiri sesuai ketersediaan.
Setiap penumpang memiliki saldo awal sebesar Rp10.000. Untuk naik bus, penumpang harus membayar ongkos Rp2.000. Jika saldo tidak mencukupi, penumpang tidak dapat naik bus. Selain itu, setiap kali transaksi berhasil dilakukan, pendapatan bus akan bertambah.

**2. Fitur Utama**
- **Naikkan Penumpang**
Pengguna dapat memasukkan data penumpang (nama, umur, dan status hamil). Sistem akan memeriksa saldo dan menentukan kategori penempatan berdasarkan aturan yang berlaku.

- **Turunkan Penumpang**
Sistem dapat menghapus penumpang berdasarkan nama dari salah satu dari tiga area dalam bus.

- **Lihat Daftar Penumpang**
Menampilkan jumlah penumpang di kursi prioritas, kursi biasa, area berdiri, serta pendapatan total bus.

**3. Struktur Kelas**
**Class Penumpang**
Berisi atribut:
- id
- nama
- umur
- hamil
- saldo

Method utama:
- Constructor (mengisi seluruh atribut dan memberikan saldo awal Rp10.000)
- tambahSaldo()
- kurangiSaldo()
- isPrioritas()
- getter data penumpang

**Class Bus**
Berisi atribut:
- Penumpang[] penumpangPrioritas = new Penumpang[4]
- Penumpang[] penumpangBiasa = new Penumpang[16]
- Penumpang[] penumpangBerdiri = new Penumpang[20]
- ONGKOS = 2000
- totalPendapatan

Method utama:
- naikkanPenumpang(Penumpang p)
- turunkanPenumpang(String nama)
- menampilkan ringkasan kondisi bus melalui toString()
- Class TestBus

**Menjalankan program utama dengan menu:**
- Naikkan Penumpang
- Turunkan Penumpang
- Lihat Penumpang
- Keluar
Class ini menerima input pengguna dan memanggil method yang sesuai pada objek Bus.

**4. Konsep Pemrograman yang Digunakan**
- Penggunaan class dan object
- Pengelolaan atribut dan method
- Encapsulation
- Constructor
- Array sebagai struktur penyimpanan
- Pengolahan kondisi dengan if–else
- Override method toString()

**5. Cara Menjalankan Program**
- Siapkan tiga file Java: Penumpang.java, Bus.java, dan TestBus.java.
- Compile ketiga file tersebut.
- Jalankan class TestBus.
- Gunakan menu untuk menambah, menghapus, atau melihat penumpang.
