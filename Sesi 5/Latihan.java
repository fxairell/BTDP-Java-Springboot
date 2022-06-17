public class Latihan {
    public static void main(String[] args) {
        // Membuat objek bangun datar
        // BangunDatar bangunDatar = new BangunDatar();

        // Membuat objek persegi dan mengisi nilai properti
        Persegi persegi = new Persegi();
        float sisiPersegi = 2;

        // Membuat objek lingkaran dan mengisi nilai properti
        Lingkaran lingkaran = new Lingkaran();
        double r = 22;

        // Membuat objek persegi panjang dan mengisi nilai properti
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        float panjangPP = 8;
        float lebarPP = 4;

        // Membuat objek segitiga dan mengisi nilai properti
        Segitiga segitiga = new Segitiga();
        double alasSegitiga = 12;
        double tinggiSegitiga = 8;

        float hasil1 = persegi.luas(sisiPersegi);
        float hasil2 = persegi.keliling(sisiPersegi);

        System.out.println("Luas persegi adalah " + hasil1 + " satuan.");
        System.out.println("Keliling persegi adalah " + hasil2 + " satuan.");

        double hasil3 = lingkaran.luas(r);
        double hasil4 = lingkaran.keliling(r);

        System.out.println("Luas lingkaran adalah " + hasil3 + " satuan.");
        System.out.println("Keliling lingkaran adalah " + hasil4 + " satuan.");

        float hasil5 = persegiPanjang.luas(panjangPP, lebarPP);
        float hasil6 = persegiPanjang.keliling(panjangPP, lebarPP);

        System.out.println("Luas persegi panjang adalah " + hasil5 + " satuan.");
        System.out.println("Keliling persegi panjang adalah " + hasil6 + " satuan.");

        double hasil7 = segitiga.luas(alasSegitiga, tinggiSegitiga);
        double hasil8 = segitiga.keliling(alasSegitiga, tinggiSegitiga);

        System.out.println("Luas segitiga adalah " + hasil7 + " satuan.");
        System.out.println("Keliling segitiga adalah " + hasil8 + " satuan.");
    }
}