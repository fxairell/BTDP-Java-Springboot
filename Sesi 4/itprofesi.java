import java.util.Scanner;

public class itprofesi {
    public static void main(String[] args) {
        // Membuat array it profesi
        String[] itprofesi = new String[5];

        // Membuat Scanner
        Scanner scan = new Scanner(System.in);

        // Mengisi data ke array
        for (int i = 0; i < itprofesi.length; i++) {
            System.out.print("Profesi ke-" + i + ": ");
            itprofesi[i] = scan.nextLine();
        }

        System.out.println("---------------------------");

        // Menampilkan semua isi array
        for (String b : itprofesi) {
            System.out.println(b);
        }

        scan.close();
    }
}
