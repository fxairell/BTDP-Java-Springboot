Disclaimer
Perhatian file ini berisi tujuan dan isi dari seluruh file dengan ekstension java yang terdapat
pada Folder Sesi 20 bagian dari Back End Development with Java Springboot. Adapun penjelasan yang
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
- HomeController.java
- ManagementController.java
- ProdukController.java
- ProfileController.java
- UserController.java
- Produk.java
- User.java
- ProdukRepository.java
- UserRepository.java
- SecurityConfig.java
- UserPrincipal.java
- UserPrincipalDetailsService.java
- ProdukService.java
- UserServiceInit.java
- LatihanProdukApplication.java
- main.css
- index.html
- application.properties
- LatihanProdukApplicationTests.java
- pom.xml
- ProdukServiceImpl.java
- ProdukServiceTest.java
- TestObjectFactory.java

3. Deskripsi File
a) HomeController.java
	File HomeController.java merupakan file controller menghubungkan pesan tampilan dengan view. View
dalam modul ini merupakan landing page sederhana.
b) ManagementController.java
	File ManagementController.java merupakan file controller menghubungkan pesan tampilan dengan view.
View dalam modul ini merupakan landing page management sederhana.
c) ProdukController.java
	File ProdukController.java merupakan file controller menghubungkan pesan tampilan dengan view.
View dalam modul ini merupakan list produk sederhana.
d) ProfileController.java
	File ProfileController.java merupakan file controller menghubungkan pesan tampilan dengan view.
View dalam modul ini merupakan landing page user sederhana.
e) UserController.java
	File UserController.java merupakan file controller menghubungkan pesan tampilan dengan view. View
dalam modul ini merupakan landing page sederhana.
f) Produk.java
	File Produk.java merupakan file model untuk menyatakan mana variabel apa. Model digunakan agar
dapat terhubung dengan controller dan dapat diolah pada database.
g) User.java
	File User.java merupakan file model untuk menyatakan mana variabel apa. Model digunakan agar dapat
terhubung dengan controller dan dapat diolah pada database.
h) ProdukRepository.java
	File ProdukRepository.java merupakan file untuk menyimpan database produk menggunakan JPA.
i) UserRepository.java
	File UserRepository.java merupakan file untuk menyimpan database user menggunakan JPA.
j) SecurityConfig.java
	File SecurityConfig.java merupakan file konfigurasi keamanan servis. Konfigurasi akan mengatur
akses bagi pengguna dengan perannya. Konfigurasi juga mengatur penghapusan cookie ketika endpoint berada
pada logout. Konfigurasi juga mengatur pengambilan data user untuk selanjutnya dikategorikan sebagai
peran tertentu.
k) UserPrincipal.java
	File UserPrincipal.java merupakan file konfigurasi untuk mengatur dan memberikan peran terhadap
user.
l) UserPrincipalDetailsService.java
	File UserPrincipalDetailsService.java merupakan file konfigurasi untuk mencocokkan user dengan
perannya.
m) ProdukService.java
	File ProdukService.java merupakan file untuk memanggil beberapa fungsi servis, seperti find, save,
get, dan delete yang digunakan terhubung dengan database.
n) UserServiceInit.java
	File UserServiceInit.java merupakan file untuk memanggil beberapa fungsi untuk menetapkan user
sebagai peran tertentu yang digunakan terhubung dengan database.
o) LatihanProdukApplication.java
	File LatihanProdukApplication.java merupakan file untuk aplikasi utama untuk menggunakan
springboot dalam menampilkan beberapa list produk sederhana.
p) main.css
	File main.css merupakan file untuk merubah penampilan data HTML.
q) index.xml
	File index.xml merupakan file untuk menampilkan pesan sederhana.
s) application.properties
	File application.properties merupakan file penjelas dan karakteristik dari aplikasi. Properti
aplikasi dijelaskan dalam hal berhubungan atau bertukar data dengan service lainnya.
t) LatihanProdukApplicationTests.java
	File LatihanProdukApplicationTests.java merupakan file untuk melakukan testing aplikasi utama saat
dijalankan perintah clean, install, dan test.
u) pom.xml
	File pom.xml merupakan file profile Maven yang digunakan sebagai properti pada Maven. File ini
menampilkan berbagai versi, properti, dan dependensi dari Maven dan aplikasi yang digunakan.
v) ProdukServiceImpl.java
	File ProdukServiceImpl.java merupakan file untuk memanggil beberapa fungsi servis, seperti find,
save, get, dan delete yang digunakan terhubung dengan database. File merupakan implementasi dari file
ProdukService.java.
w) ProdukServiceTest.java
	File ProdukServiceTest.java merupakan file untuk melakukan unit testing dari file
ProductServiceImpl.java. Test menggunakan junit yang melacak kode apabila terdapat error pada kode.
x) TestObjectFactory.java
	File TestObjectFactory.java merupakan file untuk membuat objek tiruan yang digunakan pada file
ProdukServiceTest.java untuk keperluan unit testing.