public class Array {
    public static void main(String[] args) {
        // Deklarasi array contoh
        int[] contoh;
        contoh = new int[4];

        System.out.println(contoh.length);

        // Akses dan setting elemen array
        contoh[0] = 5;
        contoh[1] = 10;
        contoh[2] = contoh[1] + 10;

        int[] contoh1 = new int[4];
        // Mengakses dan memberi nilai elemen terakhir
        contoh1[3] = 9;

        // Deklarasi array dalam 1 line
        int[] contoh2 = {5, 15, 19, 9};

        System.out.println(contoh2[2]);

        // 3 cara deklarasi array
        // Cara pertama
        String[] bahasa = {"Indonesia"};
        System.out.println(bahasa[0]);

        // Cara kedua
        String bahasa1[] = {"Korea"};
        System.out.println(bahasa1[0]);

        // Cara ketiga dengan kata kunci new
        String[] bahasa2 = new String[5];

        bahasa2[0] = "Reactjs";
        bahasa2[1] = "Reactnative";
        bahasa2[2] = "Golang";
        bahasa2[3] = "PHP";
        bahasa2[4] = "Phyton";

        // Mengambil data array
        System.out.println(bahasa2[2]);
    }
}