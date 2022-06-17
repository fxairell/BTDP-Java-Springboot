public class FormatString {
    public static void main (String[] args) {
        String namaDepan = "Saya";
        String namaBelakang = "Adalah";

        System.out.print(namaDepan + namaBelakang);
        System.out.print("namaDepan + namaBelakang");

        System.out.format("Nama saya %s $s %n", namaDepan, namaBelakang);
    }
}