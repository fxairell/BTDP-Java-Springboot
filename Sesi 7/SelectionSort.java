import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        // Buat objek Scanner
        Scanner scan = new Scanner(System.in);

        // Input jumlah data
        System.out.print("Masukkan jumlah data : ");
        int jumlahdata = scan.nextInt();

        // Input nilai tiap data
        int[] data = new int[jumlahdata];   // Array untuk nilai tiap data
        System.out.println("");
        for (int x = 0; x < jumlahdata; x++) {
            System.out.print("Input nilai data ke-" + (x + 1) + " : ");
            data[x] = scan.nextInt();
        }

        // Tampilkan daya sebelum di sorting
        System.out.println("");
        System.out.print("Data sebelum di sorting : ");
        for (int x = 0; x < jumlahdata; x++) System.out.print(data[x] + " ");

        // Proses selection sort
        System.out.println("\n\nProses Selection Sort");
        for (int x = 0; x < jumlahdata; x++) {
            System.out.println("Itrasi ke-" + (x + 1) + " : ");
            for (int y = 0; y < jumlahdata; y++) System.out.print(data[y] + " ");

            System.out.println("\tApakah data " + data[x] + " sudah benar pada urutannya?");

            boolean tukar = false;
            int index = 0;
            int min = data[x];
            String pesan = "\tTidak ada pertukaran";

            for (int y = (x + 1); y < jumlahdata; y++) {
                if (min > data[y]) {
                    tukar = true;
                    index = y;
                    min = data[y];
                }
            }

            if (tukar == true) {
                // Pertukaran data
                pesan = "\tData " + data[x] + " ditukar dengan data " + data[index];
                int temp = data[x];
                data[x] = data[index];
                data[index] = temp;
            }

            for (int y = 0; y < jumlahdata; y++) System.out.print(data[y] + " ");
            System.out.println(pesan + "\n");
        }

        // Tampilkan data setelah sorting
        System.out.print("Data setelah di sorting : ");
        for (int x = 0; x < jumlahdata; x++) System.out.print(data[x] + " ");

        scan.close();
    }
}