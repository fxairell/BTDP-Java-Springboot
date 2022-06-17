public class OperatorPembanding {
    public static void main (String[] args) {
        int a = 2;
        int b = 2;

        boolean c = a == b;
        boolean d = a != b;
        boolean e = a > b;
        boolean f = a < b;
        boolean g = a >= b;
        boolean h = a <= b;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        // Lanjut Bagian 2: Pembanding Sederhana

        int nilaiA = 12;
        int nilaiB = 4;
        boolean hasil;

        // Apakah nilai A lebih besar dari B?
        hasil = nilaiA > nilaiB;
        System.out.println(hasil);

        // Apakah nilai A lebih kecil dari B?
        hasil = nilaiA < nilaiB;
        System.out.println(hasil);

        // Apakah nilai A lebih besar sama dengan B?
        hasil = nilaiA >= nilaiB;
        System.out.println(hasil);

        // Apakah nilai A lebih kecil sama dengan B?
        hasil = nilaiA <= nilaiB;
        System.out.println(hasil);

        // Apakah nilai A sama dengan B?
        hasil = nilaiA == nilaiB;
        System.out.println(hasil);

        // Apakah nilai A tidak sama dengan B?
        hasil = nilaiA != nilaiB;
        System.out.println(hasil);
    }
}
