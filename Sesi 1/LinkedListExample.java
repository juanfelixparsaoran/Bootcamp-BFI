import java.util.*;
import java.io.File;

class LinkedListExample{
    public static void main (String[] args){
        List<String> expList = new ArrayList<>();

        Set <String> expSet1  = new HashSet<>();
        Set <String> expSet2  = new TreeSet<>();
        Set <String> expSet3  = new LinkedHashSet<>();

        Map <String,String> expMap1  = new HashMap<>();
        Map <String,String> expMap2  = new TreeMap<>();
        Map <String,String> expMap3  = new LinkedHashMap<>();

        LinkedList<String> buah = new LinkedList<>();

        buah.add("jeruk");
        buah.add("jambu");
        buah.add("apel");
        buah.add("melon");
        buah.add("semangka");
        buah.add("nanas");
        buah.add("sirsak");

        System.out.println("Nama buah : " + buah);
        System.out.println("Jumlah Buah : " + buah.size());
    }
}