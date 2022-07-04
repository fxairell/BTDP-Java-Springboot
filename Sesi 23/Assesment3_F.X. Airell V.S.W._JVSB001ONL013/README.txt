Disclaimer
Perhatian file ini berisi tujuan dan isi dari seluruh file dengan ekstension java dan class yang
terdapat pada Folder Assesment3_F.X. Airell V.S.W._JVSB001ONL013 yang terdapat pada Folder Sesi 23
bagian dari Back End Development with Java Springboot. Adapun penjelasan yang diberikan merupakan
penjelasan singkat untuk setiap file.

Nama			: F.X. Airell Valerio Satrio Wibowo
Kode Peserta	: JVSB001ONL013
Link Github		: https://github.com/fxairell/BTDP-Java-Springboot
Panduan Penggunaan Aplikasi :

1. Definisi
a) File dengan ekstensi java merupakan file berisi coding dengan bahasa pemrograman Java.
b) File dengan ekstensi xml merupakan file data dengan tag digunakan untuk menyimpan data.
c) File dengan ekstensi sql merupakan file data query untuk manipulasi database.
d) File dengan ekstensi properties merupakan file bawaan untuk pembentukan aplikasi yang dapat
   mengatur properti yang digunakan aplikasi untuk berkomunikasi.
e) File dengan ekstensi json merupakan file data dengan tag digunakan untuk menyimpan data dengan
   susunan key-value.

2. Daftar File
- FlywayConfiguration.java
- AgencyController.java
- AuthController.java
- BusController.java
- StopController.java
- TripController.java
- UserController.java
- Agency.java
- Bus.java
- ERole.java
- Role.java
- Stop.java
- Ticket.java
- Trip.java
- TripSchedule.java
- User.java
- AgencyRequest.java
- BusCustomRequest.java
- BusRequest.java
- GetTripByStopRequest.java
- GetTripScheduleRequest.java
- LoginRequest.java
- SignupCustomRequest.java
- SignupRequest.java
- TicketRequest.java
- TripRequest.java
- UserCustomRequest.java
- UserPasswordRequest.java
- JwtResponse.java
- MessageResponse.java
- AgencyRepository.java
- BusRepository.java
- RoleRepository.java
- StopRepository.java
- TicketRepository.java
- TripRepository.java
- TripScheduleRepository.java
- UserRepository.java
- AuthEntryPointJwt.java
- AuthTokenFilter.java
- JwtUtils.java
- UserDetailsImpl.java
- UserDetailsServiceImpl.java
- WebSecurityConfig.java
- FinalProjectBusApplication.java
- V1.0_insert_agency.sql
- V1.1_insert_bus.sql
- V1.2_insert_role.sql
- V1.3_insert_stop.sql
- V1.4_insert_trip.sql
- additional-spring-configuration-metadata.json
- application.properties
- FinalProjectBusApplicationTests.java
- pom.xml

3. Deskripsi File
a) FlywayConfiguration.java
	File FlywayConfiguration.java merupakan file konfigurasi Flyway yang dapat menghubungkan ke
database agar migrasi data dapat dengan mudah dilakukan.
b) AgencyController.java
	File AgencyController.java merupakan file controller khusus untuk melakukan metode CRUD untuk
model Agency. Tersedia metode Post (Create), Get (Read), Put (Update), dan Delete untuk manipulasi data
Agency pada database.
c) AuthController.java
	File AuthController.java merupakan file controller khusus untuk melakukan authentication akun
pengguna. File juga mengontrol bagian login pengguna, cek apakah user ada dan apa rolenya.
d) BusController.java
	File BusController.java merupakan file controller khusus untuk melakukan metode CRUD untuk model
Bus. Tersedia metode Post (Create) dan Get (Read) untuk manipulasi data Bus pada database.
e) StopController.java
	File StopController.java merupakan file controller khusus untuk melakukan metode CRUD untuk model
Stop. Tersedia metode Post (Create) dan Get (Read) untuk manipulasi data Stop pada database.
f) TripController.java
	File TripController.java merupakan file controller khusus untuk melakukan metode CRUD untuk model
Trip. Tersedia metode Post (Create) dan Get (Read) untuk manipulasi data Trip pada database. File juga
mengontrol apakah pengguna memiliki role sebagai ADMIN agar dapat memanupulasi data.
g) UserController.java
	File UserController.java merupakan file controller khusus untuk melakukan metode CRUD untuk model
User. Tersedia metode Post (Create) dan Put (Update) untuk manipulasi data User pada database. File
mengontrol bagian sign up atau pendaftaran akun, update data pada akun, dan ubah password user.
h) Agency.java
	File Agency.java merupakan file model untuk menyatakan mana variabel apa. Model digunakan agar
dapat terhubung dengan controller dan dapat diolah pada database.
i) Bus.java
	File Bus.java merupakan file model untuk menyatakan mana variabel apa. Model digunakan agar dapat
terhubung dengan controller dan dapat diolah pada database.
j) ERole.java
	File ERole.java merupakan file model untuk menyatakan mana variabel apa. Model digunakan agar
dapat terhubung dengan controller dan dapat diolah pada database.
k) Role.java
	File Role.java merupakan file model untuk menyatakan mana variabel apa. Model digunakan agar dapat
terhubung dengan controller dan dapat diolah pada database.
l) Stop.java
	File Stop.java merupakan file model untuk menyatakan mana variabel apa. Model digunakan agar dapat
terhubung dengan controller dan dapat diolah pada database.
m) Ticket.java
	File Ticket.java merupakan file model untuk menyatakan mana variabel apa. Model digunakan agar
dapat terhubung dengan controller dan dapat diolah pada database.
n) Trip.java
	File Trip.java merupakan file model untuk menyatakan mana variabel apa. Model digunakan agar dapat
terhubung dengan controller dan dapat diolah pada database.
o) TripSchedule.java
	File TripSchedule.java merupakan file model untuk menyatakan mana variabel apa. Model digunakan
agar dapat terhubung dengan controller dan dapat diolah pada database.
p) User.java
	File User.java merupakan file model untuk menyatakan mana variabel apa. Model digunakan agar dapat
terhubung dengan controller dan dapat diolah pada database.
q) AgencyRequest.java
	File AgencyRequest.java merupakan file request untuk membangun model property API menggunakan
constructor dari model Agency. Data juga terhubung dengan controller dan dapat diolah pada database.
r) BusCustomRequest.java
	File BusCustomRequest.java merupakan file request untuk membangun model property API menggunakan
constructor dari model Bus (Custom). Data juga terhubung dengan controller dan dapat diolah pada
database.
s) BusRequest.java
	File BusRequest.java merupakan file request untuk membangun model property API menggunakan
constructor dari model Bus. Data juga terhubung dengan controller dan dapat diolah pada database.
t) GetTripByStopRequest.java
	File GetTripByStopRequest.java merupakan file request untuk membangun model property API
menggunakan constructor dari model Trip. Data juga terhubung dengan controller dan dapat diolah pada
database.
u) GetTripScheduleRequest.java
	File GetTripScheduleRequest.java merupakan file request untuk membangun model property API
menggunakan constructor dari model Trip. Data juga terhubung dengan controller dan dapat diolah pada
database.
v) LoginRequest.java
	File LoginRequest.java merupakan file request untuk membangun model property API menggunakan
constructor dari model User. Data juga terhubung dengan controller dan dapat diolah pada database.
w) SignupCustomRequest.java
	File SignupCustomRequest.java merupakan file request untuk membangun model property API
menggunakan constructor dari model User. Data juga terhubung dengan controller dan dapat diolah pada
database.
x) SignupRequest.java
	File SignupRequest.java merupakan file request untuk membangun model property API menggunakan
constructor dari model User. Data juga terhubung dengan controller dan dapat diolah pada database.
y) TicketRequest.java
	File TicketRequest.java merupakan file request untuk membangun model property API menggunakan
constructor dari model Ticket. Data juga terhubung dengan controller dan dapat diolah pada database.
z) TripRequest.java
	File TripRequest.java merupakan file request untuk membangun model property API menggunakan
constructor dari model Trip. Data juga terhubung dengan controller dan dapat diolah pada database.
aa) UserCustomRequest.java
	File UserCustomRequest.java merupakan file request untuk membangun model property API menggunakan
constructor dari model User. Data juga terhubung dengan controller dan dapat diolah pada database.
ab) UserPasswordRequest.java
	File UserPasswordRequest.java merupakan file request untuk membangun model property API
menggunakan constructor dari model User. Data juga terhubung dengan controller dan dapat diolah pada
database.
ac) JwtResponse.java
	File JwtResponse.java merupakan file response untuk membangun model property API menggunakan
constructor dari model User. Data menghubungkan database untuk keperluan response API.
ad) MessageResponse.java
	File MessageResponse.java merupakan file response untuk membangun model property API menggunakan
struktur dan respons HTTP. Pesan digunakan untuk keperluan response API.
ae) AgencyRepository.java
	File AgencyRepository.java merupakan file untuk menyimpan database agency menggunakan JPA.
af) BusRepository.java
	File BusRepository.java merupakan file untuk menyimpan database bus menggunakan JPA.
ag) RoleRepository.java
	File RoleRepository.java merupakan file untuk menyimpan database role menggunakan JPA.
ah) StopRepository.java
	File StopRepository.java merupakan file untuk menyimpan database stop menggunakan JPA.
ai) TicketRepository.java
	File TicketRepository.java merupakan file untuk menyimpan database ticket menggunakan JPA.
aj) TripRepository.java
	File TripRepository.java merupakan file untuk menyimpan database trip menggunakan JPA.
ak) TripScheduleRepository.java
	File TripScheduleRepository.java merupakan file untuk menyimpan database trip schedule menggunakan
JPA.
al) UserRepository.java
	File UserRepository.java merupakan file untuk menyimpan database user menggunakan JPA.
am) AuthEntryPointJwt.java
	File AuthEntryPointJwt.java merupakan file security JWT dengan implementasi autentikasi entry
point. File juga digunakan untuk memberikan respons tidak terautentikasi apabila gagal untuk masuk.
an) AuthTokenFilter.java
	File AuthTokenFilter.java merupakan file security JWT untuk menyaring Auth Token dan parsing Token
dalam autentikasi. File juga digunakan dalam autentikasi web.
ao) JwtUtils.java
	File JwtUtils.java merupakan file security JWT untuk membuat dan melakukan validasi dari JWT
Token. File juga dapat memanggil username dari JWT yang tersedia.
ap) UserDetailsImpl.java
	File UserDetailsImpl.java merupakan file service untuk membangun struktur informasi detil dari
user. File juga menyimpan beberapa informasi apakah akun aktif, hangus, dan semacamnya.
aq) UserDetailsServiceImpl.java
	File UserDetailsServiceImpl.java merupakan file service untuk membangun dan mengimplementasikan
service user pada file UserDetailsImpl.java.
ar) WebSecurityConfig.java
	File WebSecurityConfig.java merupakan file security yang mengurus berbagai keamanan web. File
mengurus pengelolaan akun, kata sandi, dan aturan keamanan lainnya.
as) FinalProjectBusApplication.java
	File FinalProjectBusApplication.java merupakan file untuk aplikasi utama menggunakan springboot
dalam menampilkan beberapa fungsi web sederhana.
at) V1.0_insert_agency.sql
	File V1.0_insert_agency.sql merupakan file untuk membuat tabel data Agency sederhana. Data pada
tabel nantinya akan digunakan pada web service.
au) V1.1_insert_bus.sql
	File V1.1_insert_bus.sql merupakan file untuk membuat tabel data Bus sederhana. Data pada tabel
nantinya akan digunakan pada web service.
av) V1.2_insert_role.sql
	File V1.2_insert_role.sql merupakan file untuk membuat tabel data Role sederhana. Data pada tabel
nantinya akan digunakan pada web service.
aw) V1.3_insert_stop.sql
	File V1.3_insert_stop.sql merupakan file untuk membuat tabel data Stop sederhana. Data pada tabel
nantinya akan digunakan pada web service.
ax) V1.4_insert_trip.sql
	File V1.4_insert_trip.sql merupakan file untuk membuat tabel data Trip sederhana. Data pada tabel
nantinya akan digunakan pada web service.
ay) additional-spring-configuration-metadata.json
	File additional-spring-configuration-metadata.json merupakan file berisi key-value untuk membantu
menjalankan spring website.
az) application.properties
	File application.properties merupakan file penjelas dan karakteristik dari aplikasi. Properti
aplikasi dijelaskan dalam hal berhubungan atau bertukar data dengan service lainnya.
ba) FinalProjectBusApplicationTests.java
	File FinalProjectBusApplicationTests.java merupakan file untuk melakukan testing aplikasi utama
saat dijalankan perintah clean, install, dan test.
bb) pom.xml
	File pom.xml merupakan file profile Maven yang digunakan sebagai properti pada Maven. File ini
menampilkan berbagai versi, properti, dan dependensi dari Maven dan aplikasi yang digunakan.