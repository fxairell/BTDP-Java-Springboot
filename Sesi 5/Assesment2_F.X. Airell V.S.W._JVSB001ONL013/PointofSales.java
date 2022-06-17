import java.util.Scanner;

public class PointofSales {
    public static void main(String[] args) {
        // Deklarasi array dalam
        int[] index = new int[100];
        String[] barang = new String[100];
        int[] harga = new int[100];
        int[] kuantitas = new int[100];
        int[] diskon = new int[100];
        int[] subtotal = new int[100];

        // Scanner
        Scanner scan = new Scanner(System.in);

        // Deklarasi objek
        TampilBarang tampil = new TampilBarang();
        tampil.tampilBarang();
        Barang data = new Barang();

        // Deklarasi variabel iterasi barang
        int n, indeks, kuantiti, korting;

        System.out.print("\nMasukkan jumlah barang yang ingin dibeli : ");
        n = scan.nextInt();
        System.out.println("");
        
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan kode barang ke-" + (i + 1) + " : ");
            indeks = scan.nextInt();

            index[i] = i + 1;
            barang[i] = data.getBarang(indeks - 1);
            harga[i] = data.getHarga(indeks - 1);
            diskon[i] = data.getDiskon(indeks - 1);
            System.out.println(diskon[i]);
            
            System.out.print("Masukkan kuantitas barang : ");
            kuantiti = scan.nextInt();

            kuantitas[i] = kuantiti;
            korting = harga[i] * kuantitas[i] * diskon[i] / 100;
            System.out.println(korting);
            subtotal[i] = (harga[i] * kuantitas[i]) - korting;
        }

        System.out.println("");

        // Menampilkan data
        System.out.println("Tabel Belanja.\nMohon periksa kembali belanjaan Anda!\n");
        
        for (int i = 0; i < 87; i++) System.out.print("=");
        System.out.print("\n| No. | Barang");
        for (int i = 0; i < 23; i++) System.out.print(" ");
        System.out.print("| Harga");
        for (int i = 0; i < 9; i++) System.out.print(" ");
        System.out.print("| QTY | Diskon   | Subtotal      |\n");
        for (int i = 0; i < 87; i++) System.out.print("=");

        for (int i = 0; i < n; i++) {
            System.out.print("\n|  " + index[i] + "  ");
            System.out.print("| " + barang[i]);
            
            int spasi = 30;
            int karakter = barang[i].length();
            
            for (int j = 0; j < (spasi - 1 - karakter); j++) System.out.print(" ");
            System.out.print("| Rp. " + harga[i]);

            spasi = 15;
            String dump1 = String.valueOf(harga[i]);
            karakter = dump1.length();

            for (int j = 0; j < (spasi - 5 - karakter); j++) System.out.print(" ");
            System.out.print("| " + kuantitas[i]);

            spasi = 5;
            dump1 = String.valueOf(kuantitas[i]);
            karakter = dump1.length();

            for (int j = 0; j < (spasi - 1 - karakter); j++) System.out.print(" ");
            System.out.print("| " + diskon[i] + " %");

            spasi = 10;
            dump1 = String.valueOf(diskon[i]);
            karakter = dump1.length();

            for (int j = 0; j < (spasi - 3 - karakter); j++) System.out.print(" ");
            System.out.print("| Rp. " + subtotal[i]);

            spasi = 15;
            dump1 = String.valueOf(subtotal[i]);
            karakter = dump1.length();

            for (int j = 0; j < (spasi - 5 - karakter); j++) System.out.print(" ");
            System.out.print("|");
        }

        System.out.println("");
        for (int i = 0; i < 87; i++) System.out.print("=");
        System.out.println("");

        // Menampilkan total tagihan belanja
        int totalbelanja = 0;

        for (int i = 0; i < n; i++) {
            totalbelanja += subtotal[i];
        }

        System.out.println("\nTotal tagihan belanja : Rp. " + totalbelanja);
        scan.close();
    }
}
