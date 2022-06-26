Disclaimer
Perhatian file ini berisi tujuan dan isi dari seluruh file dengan ekstension java yang terdapat
pada Folder Sesi 17 bagian dari Back End Development with Java Springboot. Adapun penjelasan yang
diberikan merupakan penjelasan singkat untuk setiap file. Beberapa file terdapat pada folder file
di dalam folder lain.

1. Definisi
a) File dengan ekstensi java merupakan file berisi coding dengan bahasa pemrograman Java.
b) File dengan ekstensi xml merupakan file data dengan tag digunakan untuk menyimpan data.
c) File dengan ekstensi properties merupakan file bawaan untuk pembentukan aplikasi yang dapat
   mengatur properti yang digunakan aplikasi untuk berkomunikasi.

2. Daftar File
- BelajarApiController.java
- BelajarApiApplication.java
- application.properties
- BelajarApiApplicationTests.java
- pom.xml
- UserController.java
- User.java
- UserRepository.java
- UserService.java
- BelajarApisqlApplication.java
- BelajarApisqlApplicationTests.java

3. Deskripsi File
a) BelajarApiController.java
	File BelajarApiController.java merupakan file controller menghubungkan pesan tampilan dengan view.
View dalam modul ini merupakan pesan sederhana.
b) BelajarApiApplication.java
	File BelajarApiApplication.java merupakan file untuk aplikasi utama untuk menggunakan springboot
dalam menampilkan beberapa pesan sederhana.
c) aplication.properties
	File aplication.properties merupakan file penjelas dan karakteristik dari aplikasi. Properti
aplikasi dijelaskan dalam hal berhubungan atau bertukar data dengan service lainnya.
d) BelajarApiApplicationTests.java
	File BelajarApiApplicationTests.java merupakan file untuk untuk melakukan testing aplikasi utama
saat dijalankan perintah clean, install, dan test.
e) pom.xml
	File pom.xml merupakan file profile Maven yang digunakan sebagai properti pada Maven. File ini
menampilkan berbagai versi, properti, dan dependensi dari Maven dan aplikasi yang digunakan.
f) UserController.java
	File UserController.java merupakan file controller menghubungkan pesan tampilan dengan view. View
dalam modul ini berbentuk list user.
g) User.java
	File User.java merupakan file model untuk menyatakan mana variabel apa. Model digunakan agar dapat
terhubung dengan controller dan dapat diolah pada database.
h) UserRepository.java
	File UserRepository.java merupakan file untuk menyimpan database user menggunakan JPA.
i) UserService.java
	File UserService.java merupakan file untuk memanggil beberapa fungsi servis, seperti find, save,
get, dan delete yang digunakan terhubung dengan database.
j) BelajarApisqlApplication.java
	File BelajarApisqlApplication.java merupakan file untuk aplikasi utama untuk menggunakan
springboot dalam menampilkan beberapa pesan sederhana.
k) BelajarApisqlApplicationTests.java
	File BelajarApisqlApplicationTests.java merupakan file untuk melakukan testing aplikasi utama saat
dijalankan perintah clean, install, dan test.