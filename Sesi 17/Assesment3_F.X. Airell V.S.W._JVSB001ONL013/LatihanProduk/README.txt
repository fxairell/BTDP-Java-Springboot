Disclaimer
Perhatian file ini berisi tujuan dan isi dari seluruh file dengan ekstension java yang terdapat
pada Folder Assesment3_F.X. Airell V.S.W._JVSB001ONL013 yang terdapat pada Folder Sesi 17 bagian
dari Back End Development with Java Springboot. Adapun penjelasan yang diberikan merupakan
penjelasan singkat untuk setiap file.

Nama			: F.X. Airell Valerio Satrio Wibowo
Kode Peserta	: JVSB001ONL013
Link Github		:
Panduan Penggunaan Aplikasi :

1. Definisi
a) File dengan ekstensi java merupakan file berisi coding dengan bahasa pemrograman Java.
b) File dengan ekstensi xml merupakan file data dengan tag digunakan untuk menyimpan data.
c) File dengan ekstensi html merupakan file data dengan tag digunakan untuk menampilkan data.
d) File dengan ekstensi css merupakan file data dengan tag digunakan untuk merubah penampilan data.
e) File dengan ekstensi properties merupakan file bawaan untuk pembentukan aplikasi yang dapat
   mengatur properti yang digunakan aplikasi untuk berkomunikasi.

2. Daftar File
- HomeController.java
- ProdukController.java
- Produk.java
- ProdukRepository.java
- ProdukService.java
- LatihanProdukApplication.java
- main.css
- index.html
- aplication.properties
- LatihanProdukApplicationTests.java
- pom.xml

3. Deskripsi File
a) HomeController.java
	File HomeController.java merupakan file controller menghubungkan pesan tampilan dengan view. View
dalam modul ini terdapat pada file HTML dan merupakan Landing Page sederhana.
b) ProdukController.java
	File ProdukController.java merupakan file controller menghubungkan pesan tampilan dengan view.
View dalam modul ini berbentuk list produk.
c) Produk.java
	File Produk.java merupakan file model untuk menyatakan mana variabel apa. Model digunakan agar
dapat terhubung dengan controller dan dapat diolah pada database.
d) ProdukRepository.java
	File ProdukRepository.java merupakan file untuk menyimpan database produk menggunakan JPA.
e) ProdukService.java
	File ProdukService.java merupakan file untuk memanggil beberapa fungsi servis, seperti find, save,
get, dan delete yang digunakan terhubung dengan database.
f) LatihanProdukApplication.java
	File LatihanProdukApplication.java merupakan file untuk aplikasi utama untuk menggunakan
springboot dalam menampilkan beberapa pesan sederhana dalam tampilan HTML.
g) main.css
	File main.css merupakan file untuk merubah penampilan data HTML.
h) index.html
	File index.html merupakan file untuk menampilkan landing page sederhana.
i) aplication.properties
	File aplication.properties merupakan file penjelas dan karakteristik dari aplikasi. Properti
aplikasi dijelaskan dalam hal berhubungan atau bertukar data dengan service lainnya.
j) LatihanProdukApplicationTests.java
	File LatihanProdukApplicationTests.java merupakan file untuk untuk melakukan testing aplikasi
utama saat dijalankan perintah clean, install, dan test.
k) pom.xml
	File pom.xml merupakan file profile Maven yang digunakan sebagai properti pada Maven. File ini
menampilkan berbagai versi, properti, dan dependensi dari Maven dan aplikasi yang digunakan.