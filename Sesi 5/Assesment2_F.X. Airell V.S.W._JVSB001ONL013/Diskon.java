import java.util.Scanner;

public class Diskon {
    public static void main(String[] args) {
        // Deklarasi variabel
        float total, tagihan;
        float minDiskon = 1000000;

        // Scanner
        Scanner scan = new Scanner(System.in);

        System.out.print("Total belanja : Rp. ");
        total = scan.nextFloat();

        // Proses penentuan diskon
        if (total >= minDiskon) tagihan = total - (total / 10);
        else tagihan = total;

        System.out.print("Total tagihan : Rp. " + tagihan);
        scan.close();
    }
}
