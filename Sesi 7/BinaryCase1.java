import java.util.Scanner;

public class BinaryCase1 {
    public static void main(String[] args) {
        int n, find;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        n = scan.nextInt();

        int[] data = new int[n];
        System.out.println("Enter " + n + " integer : ");
        for (int i = 0; i < n; i++) {
            data[i] = scan.nextInt();
        }

        System.out.print("Enter value to find : ");
        find = scan.nextInt();

        int first = 0, last = n - 1;

        while (first <= last) {
            int middle = (first + last) / 2;
            if (data[middle] < find) {
                first = middle + 1;
            } else if (data[middle] == find) {
                System.out.println(find + " found at location " + (middle + 1) + ".");
                break;
            } else {
                last = middle - 1;
            }
        }

        if (first > last) {
            System.out.println(find + " is not present in the list");
        }
    }
}
