public class Restoran {
    // Variabel (Private)
    private String menu;
    private double harga;
    private boolean spesial;

    // Method setter public dengan params
    public void setMenu (String menu) {
        this.menu = menu;
    }
    public void setHarga (double harga) {
        this.harga = harga;
    }
    public void setSpesial (boolean spesial) {
        this.spesial = spesial;
    }

    // Method getter (public)
    public String getMenu() {
        return menu;
    }
    public double getHarga() {
        return harga;
    }
    public boolean getSpesial() {
        return spesial;
    }
}
