import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        final double pi = 3.14;
        int r;
        double luas;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan jari-jari : ");
        r = scan.nextInt();

        scan.close();

        luas = pi * r * r;

        System.out.println("Luas lingkaran = " + luas);

    }
}
