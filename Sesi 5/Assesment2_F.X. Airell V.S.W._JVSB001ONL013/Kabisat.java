import java.util.Scanner;

public class Kabisat {
    public static void main(String[] args) {
        // Deklarasi variabel
        int tahun;

        // Scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("Selamat datang!");
        System.out.println("Program ini digunakan untuk mengetahui apakah tahun tertentu adalah tahun kabisat.");
        System.out.println("Silakan input tahun di bawah ini!");
        System.out.print("Tahun : ");
        tahun = scan.nextInt();

        if (tahun % 4 == 0) System.out.println("Ya, tahun " + tahun + " merupakan tahun kabisat.");
        else {
            System.out.println("Tidak, tahun " + tahun + " bukan merupakan tahun kabisat.");
            System.out.println("Silakan tunggu " + (tahun % 4) + " tahun lagi.");
        }

        scan.close();
    }
}
