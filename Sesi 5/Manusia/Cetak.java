

public class Cetak {
    public static void main(String[] args) {
        //Polymorphism

        //Class itu sendiri
        Cowok cowok2 = new Cowok();
        
        //Class Lain
        Manusia cowok = new Cowok();

        //Interface
        Dewasa cowok3 = new Cowok();

        System.out.print("Cowok 1 Nyanyi "); cowok.nyanyiLagu();
        System.out.print("Cowok 2 Nyanyi "); cowok2.nyanyiLagu();
        cowok3.jalan();

        Manusia cewek = new Cewek();

        System.out.print("Cewek Nyanyi "); cewek.nyanyiLagu();
    }
}
