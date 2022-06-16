
public class Main {
    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();
        bd.luas();
        bd.keliling();

        Lingkaran L = new Lingkaran();
        L.r = 5;

        Persegi P = new Persegi();
        P.s = 5;

        PersegiPanjang PJ = new PersegiPanjang();
        PJ.p = 5;
        PJ.l = 6;

        Segitiga S = new Segitiga();
        S.a = 5;
        S.t = 6;

        System.out.println("Luas Lingkaran : " + L.luas());
        System.out.println("Keliling Lingkaran : " + L.keliling());

        System.out.println("Luas Persegi : " + P.luas());
        System.out.println("Keliling Persegi : " + P.keliling());

        System.out.println("Luas Persegi Panjang : " + PJ.luas());
        System.out.println("Keliling Persegi Panjang : " + PJ.keliling());

        System.out.println("Luas Segitiga : " + S.luas());
        System.out.println("Keliling Segitiga : " + S.keliling());

    }
}
