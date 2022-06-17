import java.util.Scanner;

public class TahunKabisat {
    public static void main(String[] args) {
        int tahun;
        boolean kabisat = false;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan tahun : ");
        tahun = scan.nextInt();
        scan.close();
        if (tahun % 4 == 0) {
            if (tahun % 100 == 0) {
                if (tahun % 400 == 0) {
                    kabisat = true;
                }
            } else {
                kabisat = true;
            }
        }

        if (kabisat)
            System.out.println("Merupakan tahun kabisat!");
        else
            System.out.println("Bukan tahun kabisat!");
    }

}
