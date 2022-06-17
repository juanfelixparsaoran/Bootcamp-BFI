import java.util.Scanner;

public class Bilangan {
    public static void main(String[] args) {
        double x, y, z;
        Scanner scan = new Scanner(System.in);

        System.out.println("Menentukan Nilai Terbesar, Terkecil, dan Rata-Rata\n");

        System.out.print("Masukkan Bilangan Pertama (X) : ");
        x = scan.nextDouble();

        System.out.print("Masukkan Bilangan Kedua (Y) : ");
        y = scan.nextDouble();

        System.out.print("Masukkan Bilangan Ketiga (Z) : ");
        z = scan.nextDouble();
        System.out.println();
        scan.close();

        System.out.println("Hasil:");
        System.out.println("Rata-ratanya adalah : " + (x + y + z) / 3);
        System.out.println(max(x, y, z) + " adalah bilangan terbesar");
        System.out.println(min(x, y, z) + " adalah bilangan terkecil");

    }

    //Max Function
    private static double max(double x, double y, double z) {
        if ((x > y) && (x > z)) {
            return x;
        } else if ((y > z) && (y > x)) {
            return y;
        } else {
            return z;
        }
    }

    //Min function
    private static double min(double x, double y, double z) {
        if ((x < y) && (x < z)) {
            return x;
        } else if ((y < z) && (y < x)) {
            return y;
        } else {
            return z;
        }
    }

    

}
