public class Barang {
    // Variabel
    int[] index = {1, 2, 3, 4, 5};
    String[] barang = {"Mouse Bluetooth 5.0", "Headphone Eksternal",
                       "Power Bank 10.000 mAh", "Tripod Kamera",
                       "Smart Watch Xiaomi"};
    int[] harga = {149999, 246000, 136000, 267999, 899000};
    int[] diskon = {10, 5, 0, 20, 10};
    int[] kuantitas = {};

    // Method getter index
    public int getIndex (int i) {
        return index[i];
    }
    // Method getter barang
    public String getBarang (int i) {
        return barang[i];
    }
    // Method getter harga
    public int getHarga (int i) {
        return harga[i];
    }
    // Method getter diskon
    public int getDiskon (int i) {
        return diskon[i];
    }
    // Method setter diskon
    public int getKuantitas (int i) {
        return kuantitas[i];
    }
}
