public class Nilai {
    int num1, num2;

    Nilai (int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void cetakNilai (String str) {
        System.out.println("(" + num1 + ", " + num2 + ")");
    }

    Nilai center (Nilai other) {
        // Mengembalikan result antara this nilai dengan nilai outer
        // Hasilnya tidak akan terlalu akurat karena penggunaan int
        return new Nilai ((num1 + other.num1) / 2, (num2 + other.num2) / 2);
    }

    public static void main(String[] args) {
        Nilai n = new Nilai (100,10);
        n.cetakNilai("Cetak Nilai");
        n.center(new Nilai(7, 5)).cetakNilai("Nilai");
    }
}
