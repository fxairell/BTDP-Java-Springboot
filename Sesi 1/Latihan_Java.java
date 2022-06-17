import java.util.LinkedList;

public class Latihan_Java {
    public static void main (String[] args) {
        // Membuat Instance/Objek dari LinkedList
        LinkedList<String> buah = new LinkedList<>();

        // Menambahkan Data pada Objek buah
        buah.add("Jeruk");
        buah.add("Jambu");
        buah.add("Apel");
        buah.add("Melon");
        buah.add("Semangka");
        buah.add("Nanas");
        buah.add("Sirsak");

        // Mencetak/Menampilkan Data
        System.out.println("Nama Buah: " + buah);

        // Lanjut ke Tugas 2: Mengubah ELement

        // Menghitung Jumlah/Ukuran pada Objek LinkedList
        System.out.println("Jumlah Buah: " + buah.size());

        buah.addFirst("Paling Atas"); // Menambahkan Data pada Index Teratas
        buah.addLast("Paling Bawah"); // Menambahkan Data pada Index Terbawah

        buah.set(2, "Diubah"); // Mengubah Data pada No Index 2
        buah.set(5, "Diubah"); // Mengubah Data pada No Index 5

        // Mencetak/Menampilkan Data
        System.out.println("Nama Buah: " + buah);

        // Lanjut ke Tugas 3: Mengambil Element

        // Mengambil Data pada Urutan Teratas
        System.out.println("Data Teratas: " + buah.getFirst());
        // Mengambil Data pada Urutan Terbawah
        System.out.println("Data Terbawah: " + buah.getLast());
        // Mengambil Data pada Nomor Index 1
        System.out.println("Data NoIndex 1: " + buah.get(1));
        // Mengambil Data pada Nomor Index 3
        System.out.println("Data NoIndex 3: " + buah.get(3));

        // Lanjut ke Tugas 4: Menghapus Element
        buah.removeFirst(); // Menghapus Data pada Urutan Paling Atas
        buah.removeLast(); // Menghapus Data pada Urutan Paling Bawah
        buah.remove(1); // Menghapus Data pada No Index 1
        
        // Mencetak Data
        System.out.println(buah);

        // Lanjut ke Tugas 5: Cek Kondisi Element
        
        // Membuat Instance/Objek dari LinkedList
        LinkedList<String> barang = new LinkedList<>();

        // Menambahkan Data pada Objek barang
        barang.add("Laptop");
        barang.add("Komputer");
        barang.add("Radio");

        // Mengecek Apakah Data pada Objek barang, Kosong
        if (barang.isEmpty()) {
            System.out.println("Data Kosong");
        } else {
            System.out.println("Data Penuh");
        }

        // Mengecek Apakah sebuah Element ada di dalam LinkedList
        if (barang.contains("Komputer")) {
            System.out.println("Barang Ditemukan");
        } else {
            System.out.println("Barang Tidak Ditemukan");
        }
    }
}
