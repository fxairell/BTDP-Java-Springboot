public class IfOptional {
    public static void main (String[] args) {
        int x = 5;
        int y = 5;

        // Dengan menggunakan 1 line untuk fungsi pada if
        if (x == y)
            System.out.println("Kalimat utama");
        else
            System.out.println("Kalimat pendukung");

        // Penggunaan 1 line untuk if agar lebih aman

        int hasil = x == 5 ? 10 : 20;

        // maka hasilnya adalah 10
        // Ini sama dengan

        int hasil1;

        if (x == 5) {
            hasil1 = 10;
        } else {
            hasil1 = 20;
        }

        System.out.println(hasil);
        System.out.println(hasil1);
    }
}
