import java.util.Scanner;

public class UrutkanDuduk {
    public static void main(String[] args) {
        // Deklarasi array
        String[][] antri = {{"A1", "B1", "C1"},
                            {"A2", "B2", "C2"}};

        // Scanner
        Scanner scan = new Scanner(System.in);

        // Print Denah
        System.out.println("Denah tempat duduk.");

        int karakter = 10;

        for (int i = 0; i < 56; i++) System.out.print("=");
        System.out.println("");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("|");
                for (int k = 0; k < (karakter / 2) - 1; k++) System.out.print(" ");
                if (j % 2 == 0) System.out.print(antri[i][j / 2]);
                else System.out.print("  ");
                for (int k = 0; k < (karakter / 2) - 1; k++) System.out.print(" ");
            }
            System.out.println("|");
        }
        for (int i = 0; i < 56; i++) System.out.print("=");
        System.out.println("\n");

        // Input peserta duduk
        System.out.println("Susunan tempat duduk.");

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++) {
                System.out.print("Yang akan duduk di bangku " + antri[i][j] + " adalah ");
                antri[i][j] = scan.nextLine();
            }
        }

        // Print Denah duduk baru
        System.out.println("\nDenah tempat duduk baru");

        for (int i = 0; i < 56; i++) System.out.print("=");
        System.out.println("");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("|");

                int panjang = antri[i][j/2].length();

                if (j % 2 == 0) {
                    System.out.print(antri[i][j / 2]);

                    if (panjang < karakter) {
                        for (int k = 0; k < karakter - panjang; k++) System.out.print(" ");
                    }
                } else {
                    if (panjang < karakter) {
                        for (int k = 0; k < karakter; k++) System.out.print(" ");
                    } else {
                        for (int k = 0; k < karakter - (panjang - karakter); k++) System.out.print(" ");
                    }
                }
            }
            System.out.println("|");
        }
        for (int i = 0; i < 56; i++) System.out.print("=");

        scan.close();
    }
}
