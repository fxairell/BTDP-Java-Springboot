import java.lang.Math;

public class Segitiga {
    double luas (double alas, double tinggi) {
        double hasil = alas * tinggi / 2;
        return hasil;
    }

    double keliling (double alas, double tinggi) {
        double sisiMiring = Math.sqrt((alas * alas) + (tinggi * tinggi));
        double hasil = alas + tinggi + sisiMiring;
        return hasil;
    }
}
