public class Operator {
    public static void main (String[] args) {
        int a = 2;
        int b = 1;
        int c = 2;
        int d = 1;
        int e = 1;

        if (a == 2) {   // comment : jika a sama dengan 2 maka ...
            a = 10;     // a sama dengan 10
            b += 1;     // b ditambah 1
            c -= 1;     // c dikurang 1
            d /= 2;     // d dibagi 2
            e = a%1;    // e dapat hasil dari sisa bagi antara a dan 1
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
