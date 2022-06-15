import java.util.Scanner;

public class ForLooping{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input panjang sisi : ");
        int n = scan.nextInt();
        for (int i = 0; i<n;i++){
            for (int j = 0; j<n; j++){
                if (j == n-1){
                    System.out.println("*");
                }
                else{
                    System.out.print("*");
                }
            }

            scan.close();
        }

        for (int i = 0; i<11; i++){
            System.out.print(i + " ");
        }

        System.out.println("");
        for (int i = 1; i<20; i+=2){
            System.out.print(i + " ");
        }
    }
}