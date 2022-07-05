Disclaimer
Perhatian file ini berisi tujuan dan isi dari seluruh file dengan ekstension java yang terdapat
pada Folder Sesi 22 bagian dari Back End Development with Java Springboot. Adapun penjelasan yang
diberikan merupakan penjelasan singkat untuk setiap file. Beberapa file terdapat pada folder file
di dalam folder lain.

1. Definisi
a) File dengan ekstensi java merupakan file berisi coding dengan bahasa pemrograman Java.
b) File dengan ekstensi xml merupakan file data dengan tag digunakan untuk menyimpan data.
c) File dengan ekstensi html merupakan file data dengan tag digunakan untuk menampilkan data.
d) File dengan ekstensi css merupakan file data dengan tag digunakan untuk merubah penampilan data.
e) File dengan ekstensi properties merupakan file bawaan untuk pembentukan aplikasi yang dapat
   mengatur properti yang digunakan aplikasi untuk berkomunikasi.

2. Daftar File
- WelcomeController.java
- HelloJavaSpringApplication.java
- application.properties
- HelloJavaSpringApplicationTests.java
- pom.xml
- HomeController.java
- ProdukController.java
- Produk.java
- ProdukRepository.java
- ProdukService.java
- LatihanProdukApplication.java
- main.css
- index.html
- LatihanProdukApplicationTests.java

3. Deskripsi File
a) WelcomeController.java
	File WelcomeController.java merupakan file controller menghubungkan tampilan pada REST API
sederhana.
b) HelloJavaSpringApplication.java
	File HelloJavaSpringApplication.java merupakan file untuk aplikasi utama untuk menggunakan
springboot dalam menampilkan REST API sederhana.
c) application.properties
	File application.properties merupakan file penjelas dan karakteristik dari aplikasi. Properti
aplikasi dijelaskan dalam hal berhubungan atau bertukar data dengan service lainnya.
d) HelloJavaSpringApplicationTests.java
	File HelloJavaSpringApplicationTests.java merupakan file untuk melakukan testing aplikasi utama
saat dijalankan perintah clean, install, dan test.
e) pom.xml
	File pom.xml merupakan file profile Maven yang digunakan sebagai properti pada Maven. File ini
menampilkan berbagai versi, properti, dan dependensi dari Maven dan aplikasi yang digunakan.
f) HomeController.java
	File HomeController.java merupakan file controller menghubungkan pesan tampilan dengan view. View
dalam modul ini terdapat pada file HTML dan merupakan Landing Page sederhana.
g) ProdukController.java
	File ProdukController.java merupakan file controller menghubungkan pesan tampilan dengan view.
View dalam modul ini berbentuk list produk.
h) Produk.java
	File Produk.java merupakan file model untuk menyatakan mana variabel apa. Model digunakan agar
dapat terhubung dengan controller dan dapat diolah pada database.
i) ProdukRepository.java
	File ProdukRepository.java merupakan file untuk menyimpan database produk menggunakan JPA.
j) ProdukService.java
	File ProdukService.java merupakan file untuk memanggil beberapa fungsi servis, seperti find, save,
get, dan delete yang digunakan terhubung dengan database.
k) LatihanProdukApplication.java
	File LatihanProdukApplication.java merupakan file untuk aplikasi utama untuk menggunakan
springboot dalam menampilkan beberapa pesan sederhana dalam tampilan HTML.
l) main.css
	File main.css merupakan file untuk merubah penampilan data HTML.
m) index.html
	File index.html merupakan file untuk menampilkan landing page sederhana.
n) LatihanProdukApplicationTests.java
	File LatihanProdukApplicationTests.java merupakan file untuk untuk melakukan testing aplikasi
utama saat dijalankan perintah clean, install, dan test.

4. Code Coverage
	Code Coverage menggunakan Eclipse dan Sonarqube untuk file pada folder LatihanProdukJacoco. Folder
menyimpan Screenshoot dari hasil code smelling dan coverage menggunakan Sonarqube. Adapun file yang
dicover oleh Sonarqube meliputi file f - n.