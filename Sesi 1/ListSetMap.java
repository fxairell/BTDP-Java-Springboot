import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class ListSetMap {
    // Jika kalian ingin menambah atau menghapus element
    // di akhir list kalian bisa gunakan ArrayList
    List<String> list1 = new ArrayList<>();

    // Jika kalian ingin menambah atau menghapus element
    // di tempat lain, kalian bisa gunakan LinkedList
    List<String> list2 = new LinkedList<>();

    // Element di hashset tidak terutur (ordered)
    Set<String> set1 = new HashSet<>();

    // Element di treeset terurut di natural ordering
    // Menggunakan TreeSet untuk custom tipe objek, harus mengimplementasi: Comparable
    Set<String> set2 = new TreeSet<>();

    // Element terurut berdasarkan urutan penambahan
    Set<String> set3 = new LinkedHashSet<>();

    // Key tidak dalam urutan tertentu dan dapat berubah
    Map<String, String> map1 = new HashMap<>();

    // Key terurut di natural ordering
    // Menggunakan TreeMap untuk custom tipe objek, harus mengimplementasi: Comparable
    Map<String, String> map2 = new TreeMap<>();

    // Key terurut berdasarkan urutan penambahan
    Map<String, String> map3 = new LinkedHashMap<>();
}