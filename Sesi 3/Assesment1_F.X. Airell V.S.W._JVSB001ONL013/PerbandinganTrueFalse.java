public class PerbandinganTrueFalse {
    public static void main(String[] args) {
        // Buat variabel
        int a = 10;
        int b = 8;
        int c = 12;
        int d = 5;

        // Perbandingan True False
        boolean tes1 = a > b;       // true
        boolean tes2 = b < c;       // true
        boolean tes3 = c >= d;      // true
        boolean tes4 = d <= b;      // true
        boolean tes5 = a == 2*d;    // true
        boolean tes6 = a != d;      // true
        boolean tes7 = a > c;       // false
        boolean tes8 = b <= d;      // false
        boolean tes9 = c == 2*b;    // false
        boolean tes10 = 6*a != 5*c; // false

        // Menampilkan hasil perbandingan
        System.out.println("Tes ke-1 = " + tes1);
        System.out.println("Tes ke-2 = " + tes2);
        System.out.println("Tes ke-3 = " + tes3);
        System.out.println("Tes ke-4 = " + tes4);
        System.out.println("Tes ke-5 = " + tes5);
        System.out.println("Tes ke-6 = " + tes6);
        System.out.println("Tes ke-7 = " + tes7);
        System.out.println("Tes ke-8 = " + tes8);
        System.out.println("Tes ke-9 = " + tes9);
        System.out.println("Tes ke-10 = " + tes10);
    }
}
