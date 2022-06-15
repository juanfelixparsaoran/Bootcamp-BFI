import java.util.Scanner;

public class WhileLooping {
    public static void main(String[] args) {
        boolean jawaban = true;
        int n = 0;
        String inputan;
        Scanner scan = new Scanner(System.in);
        System.out.println("Apakah anda ingin keluar? ya/tidak");
        inputan = scan.nextLine();
        if (inputan.equalsIgnoreCase("ya")) {
            jawaban = false;
        }
        while (jawaban) {
            n += 1;

            System.out.println("Apakah anda ingin keluar? ya/tidak");
            inputan = scan.nextLine();
            if (inputan.equalsIgnoreCase("ya")) {
                jawaban = false;
            }

        }
        System.out.println("Anda telah melakukan pengulangan sebanyak " + n + " kali");
        scan.close();
    }
}