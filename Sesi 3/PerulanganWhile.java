import java.util.Scanner;

public class PerulanganWhile {
    public static void main (String[] args) {
        // while loop
        int i = 1;
        while (i <= 4) {
            System.out.println(i);
            i++;
        }

        // membuat variabel dan Scanner
        boolean running = true;
        int counter = 0;
        String jawab;
        Scanner scan = new Scanner(System.in);

        while (running) {
            System.out.println("Apakah anda ingin keluar?");
            System.out.println("Jawab [ya/tidak]");

            jawab = scan.nextLine();

            // cek jawabannya, kalau ya maka berhenti mengulang
            if (jawab.equalsIgnoreCase("ya")) {
                running = false;
            }

            counter++;
        }

        System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");
        scan.close();
    }
}
