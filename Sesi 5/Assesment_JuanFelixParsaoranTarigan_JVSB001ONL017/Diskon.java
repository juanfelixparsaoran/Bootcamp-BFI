import java.util.Scanner;

public class Diskon {
    public static void main(String[] args) {
        int belanjaan;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Harga Pembelian : ");
        belanjaan = scan.nextInt();
        scan.close();

        if (belanjaan >= 1000000){
            System.out.println("Pembelian : "+ belanjaan);
            System.out.println("Diskon : 10%");
            System.out.println("Harga Bayar : "+ (int) (belanjaan*0.9));
        }else{
            System.out.println("Pembelian : "+ belanjaan);
            System.out.println("Diskon : 0%");
            System.out.println("Harga Bayar : "+ belanjaan);
        }
    }   
}
