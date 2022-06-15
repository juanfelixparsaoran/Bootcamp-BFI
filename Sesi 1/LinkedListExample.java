import java.util.LinkedList;
import java.io.File;

class LinkedListExample{
    public static void main (String[] args){
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