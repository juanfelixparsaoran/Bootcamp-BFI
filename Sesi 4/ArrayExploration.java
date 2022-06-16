public class ArrayExploration {
    public static void main(String[] args) {

        //String nama = new String[5];
        String [] bahasa = {"Reactjs","Golang","PHP","Python","Haskel"};

        for (int i = 0; i<bahasa.length; i++){
            System.out.println("indeks ke-"+i+" : " + bahasa[i]);
        }

        //foreach
        String [] buah = new String[3];
        buah[0] = "Pisang";
        buah[1] = "Sirsak";
        buah[2] = "Mangga";

        for (String n : buah) {
            System.out.println(n);
            
        }
    }
}
