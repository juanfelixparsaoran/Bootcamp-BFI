import java.util.Scanner;

public class PenjumlahanXY {
    public static void main(String[] args) {
        int x1,x2,y1,y2;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input y1 : ");
        y1 = scan.nextInt();
        System.out.print("Input y2 : ");
        y2 = scan.nextInt();

        scan.close();

        x1 = (y1 + y2) * (y1+y2);
        x2 = (y1 % 4) * y2;

        System.out.println("Hasil X1 = " + x1);
        System.out.println("Hasil X2 = " + x2);
    }
}
