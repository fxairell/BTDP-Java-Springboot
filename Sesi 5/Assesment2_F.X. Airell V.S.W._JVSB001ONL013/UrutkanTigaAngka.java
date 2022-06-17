import java.util.Scanner;
import java.lang.Math;

public class UrutkanTigaAngka {
    public static void main(String[] args) {
        // Deklarasi variabel
        int angka1, angka2, angka3;
        int angkaBesar, angkaKecil;
        float rerata;

        // Scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("Menentukan Bilangan Terbesar, Terkecil, dan Rata-rata\n");

        // Input angka pertama
        System.out.print("Masukkan Bilangan Pertama (X) : ");
        angka1 = scan.nextInt();
        // Input angka kedua
        System.out.print("Masukkan Bilangan Kedua (Y) : ");
        angka2 = scan.nextInt();
        // Input angka ketiga
        System.out.print("Masukkan Bilangan Ketiga (Z) : ");
        angka3 = scan.nextInt();
        System.out.println("");

        // Fungsi rerata
        rerata = (angka1 + angka2 + angka3) / 3;
        // Fungsi terbesar
        angkaBesar = Math.max(Math.max(angka1, angka2), angka3);
        // Fungsi terkecil
        angkaKecil = Math.min(Math.min(angka1, angka2), angka3);

        // Menampilkan hasil
        System.out.println("Hasil:");
        System.out.println("Rata-ratanya adalah " + rerata + ".");
        System.out.println(angkaBesar + " adalah bilangan terbesar.");
        System.out.println(angkaKecil + " adalah bilangan terkecil.");

        scan.close();
    }
}
