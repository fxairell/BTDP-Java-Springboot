public class OperatorPenugasan {
    public static void main (String[] args) {
        int a;
        int b;

        // Pengisian nilai
        a = 5;
        b = 10;

        // Penambahan
        b += a;
        // Sekarang b = 15
        System.out.print("Penambahan : " + b);

        // Pengurangan
        b -= a;
        // Sekarang b = 10 (karena 15 - 5)
        System.out.print("Penambahan : " + b);

        // Perkalian
        b *= a;
        // Sekarang b = 50 (karena 10 * 5)
        System.out.print("Penambahan : " + b);

        // Pembagian
        b /= a;
        // Sekarang b = 10 (karena 50 / 5)
        System.out.print("Penambahan : " + b);

        // Sisa bagi
        b %= a;
        // Sekarang b = 0
        System.out.print("Penambahan : " + b);
    }
}
