public class ConditionalLogic {
    public static void main (String[] args){
        int x = 5;
        boolean y = x == 5;

        if (y) {
            System.out.println("True");
        }

        if (x == 5) {
            System.out.println("x bernilai 5!");
        }

        int y1 = 10;
        boolean hasil;

        hasil = x < y1;     // true
        hasil = x > y1;     // false
        hasil = x <= 5;     // x lebih kecil atau sama dengan 5 - true
        hasil = y1 >= 11;   // y lebih besar atau sama dengan 11 - false
        hasil = x == y1;    // x sama dengan y - false
        hasil = x != y1;    // x tidak sama dengan y - true
        hasil = x > y1 || x < y1;   // Logika or - true
        hasil = 3 < x && x < 6;     // Logika and - true
        hasil = !hasil;     // Logika not - false
    }
}
