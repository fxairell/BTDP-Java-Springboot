public class Latihan {
    public static void main (String[] args) {
        // Menampilkan logo Bintang

        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Menampilkan nilai 0 - 10

        for (int i = 0; i < 11; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        // Menampilkan angka ganjil dari 1 - 20

        for (int i = 0; i < 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        // Menampilkan perulangan 0 - 10 menggunakan while

        int i = 0;
        while (i < 11) {
            System.out.println("Perulangan ke-" + i);
            i++;
        }

        // Menampilkan perulangan 0 - 10 menggunakan do - while

        i = 0;
        do {
            System.out.println("Perulangan ke-" + i);
            i++;
        } while (i < 11);
    }
}