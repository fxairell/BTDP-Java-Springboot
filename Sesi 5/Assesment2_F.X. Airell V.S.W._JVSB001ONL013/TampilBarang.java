public class TampilBarang {
    void tampilBarang () {
        // Membuat objek data dari kelas Barang
        Barang data = new Barang();

        // Menampilkan data
        System.out.println("Tabel Barang, Harga dan Diskon.\n");

        for (int i = 0; i < 65; i++) System.out.print("=");
        System.out.print("\n| No. | Barang");
        for (int i = 0; i < 23; i++) System.out.print(" ");
        System.out.print("| Harga");
        for (int i = 0; i < 9; i++) System.out.print(" ");
        System.out.print("| Diskon   |\n");
        for (int i = 0; i < 65; i++) System.out.print("=");
        
        for (int i = 0; i < 5; i++) {
            System.out.print("\n|  " + data.getIndex(i) + "  ");
            System.out.print("| " + data.getBarang(i));
            
            int spasi = 30;
            int karakter = data.getBarang(i).length();
            
            for (int j = 0; j < (spasi - 1 - karakter); j++) System.out.print(" ");
            System.out.print("| Rp. " + data.getHarga(i));

            spasi = 15;
            String dump1 = String.valueOf(data.getHarga(i));
            karakter = dump1.length();

            for (int j = 0; j < (spasi - 5 - karakter); j++) System.out.print(" ");
            System.out.print("| " + data.getDiskon(i) + " %");

            spasi = 10;
            dump1 = String.valueOf(data.getDiskon(i));
            karakter = dump1.length();

            for (int j = 0; j < (spasi - 3 - karakter); j++) System.out.print(" ");
            System.out.print("|");
        }

        System.out.println("");
        for (int i = 0; i < 65; i++) System.out.print("=");
        System.out.println("");
    }
}
