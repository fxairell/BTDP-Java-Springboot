import java.util.Scanner;

public class PenjumlahanXY {
    public static void main(String[] args) {
        // Deklarasi variabel
        int X1, X2;
        int y1, y2;

        // Scannner
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai y1 :");
        y1 = scan.nextInt();
        System.out.print("Masukkan nilai y2 :");
        y2 = scan.nextInt();

        // Proses X1 dan X2
        X1 = (y1 + y2) * (y1 + y2);
        X2 = (y1 % 4) * y2;

        // Menampilkan hasil
        System.out.println("Nilai X1 adalah " + X1);
        System.out.println("Nilai X2 adalah " + X2);

        scan.close();

        // Sambungan Lanjutan PenjumlahanXY
        System.out.println("Hasil evaluasi X1 >= X2 bernilai " + (X1 >= X2));
        System.out.println("Hasil evaluasi X2 >= X1 bernilai " + (X2 >= X1));
        System.out.println("Hasil evaluasi X1 mod 4 == ++X2 mod 5 bernilai " + (X1 % 4 == ++X2 % 5));
    }
}
