public class AnakUmur1Tahun extends Induk implements AktivitasPagi {
	@Override
	public void anakSiapa() {
		// Method override dan penggunaan interface
		System.out.println("Nama anaknya adalah : " + namaAnak);
	}

	@Override
	public void hobiAnak() {
		// Method override dan penggunaan interface
		System.out.println("Hobi anaknya adalah : " + hobiAnak);
	}

}