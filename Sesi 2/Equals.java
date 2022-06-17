public class Equals {
    public static void main (String[] args) {
        String x = new String("Test");
        String y = new String("Test");
        String sameX = x;

        boolean hasil1 = x == y;        // Ini false, karena x dan y bukanlah objek yang sama
        boolean hasil2 = x.equals(y);   // Ini true, karena x dan y secara logis sama
        boolean hasil3 = x == sameX;    // Ini true, karena x dan sameX adalah objek yang sama

        System.out.println(hasil1);
        System.out.println(hasil2);
        System.out.println(hasil3);
    }
}
