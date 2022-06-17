class Driver {
    public static void main(String[] args) {
        // bentuk 1 (class sendiri)
        AnakUmur1Tahun i = new AnakUmur1Tahun();
		i.anakSiapa();
		i.makan();
        // bentuk 2 (class lain)
		Induk a1 = new AnakUmur1Tahun();
		a1.minum();
        // bentuk 3 (interface)
		AktivitasPagi a11 = new AnakUmur1Tahun();
		a11.hobiAnak();

        // Notes: AnakUmur1Tahun merupakan child node
        // Induk merupakan parent node
        // AnakUmur1Tahun bisa mengambil kelas/fungsi yang ada di Induk
    }
}
