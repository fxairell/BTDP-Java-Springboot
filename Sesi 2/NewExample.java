public class NewExample {
    public static void main (String[] args) {
        int x = 20;
        int y = 40;

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("y / x = " + (y / x));
        System.out.println("y % x = " + (y % x));
        System.out.println("x++ = " + (x++));
        System.out.println("x-- = " + (x--));

        // Perbedaan x++ dengan ++x
        System.out.println("x++ = " + (x++));
        System.out.println("++x = " + (++x));

        // Lanjut Bagian 2: Operator Boolean

        x = 20;

        System.out.println("x == y = " + (x == y));
        System.out.println("x != y = " + (x != y));
        System.out.println("x > y = " + (x > y));
        System.out.println("x < y = " + (x < y));
        System.out.println("x >= y = " + (x >= y));
        System.out.println("x <= y = " + (x <= y));

        // Lanjut Bagian 3: Operator Logika

        x = 10;
        y = 15;
        int hasil = 0;

        hasil = x & y;
        System.out.println("x & y = " + hasil);

        hasil = x | y;
        System.out.println("x | y = " + hasil);

        hasil = x ^ y;
        System.out.println("x ^ y = " + hasil);

        hasil = ~x;
        System.out.println("~x = " + hasil);

        hasil = x << 2;
        System.out.println("x << 2 = " + hasil);

        hasil = x >> 2;
        System.out.println("x >> 2 = " + hasil);

        hasil = x >>> 2;
        System.out.println("x >>> 2 = " + hasil);

        // Lanjut Bagian 3.1: Operator Logika Lanjutan

        boolean x1 = true;
        boolean y1 = false;

        System.out.println("x && y = " + (x1 && y1));
        System.out.println("x || y = " + (x1 || y1));
        System.out.println("!(x && y) = " + !(x1 && y1));
    }
}
