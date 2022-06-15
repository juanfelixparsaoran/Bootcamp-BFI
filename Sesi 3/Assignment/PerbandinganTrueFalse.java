public class PerbandinganTrueFalse {
    public static void main(String[] args) {
        int a = 10, b=8, c=12, d=5;

        System.out.println("Tes ke 1 = " + (a>b));
        System.out.println("Tes ke 2 = " + (b<c));
        System.out.println("Tes ke 3 = " + (c>=d));
        System.out.println("Tes ke 4 = " + (d<=b));
        System.out.println("Tes ke 5 = " + (a == b || b<c));
        System.out.println("Tes ke 6 = " + (a!=b));
        System.out.println("Tes ke 7 = " + (b>c));
        System.out.println("Tes ke 8 = " + (c<=a));
        System.out.println("Tes ke 9 = " + (a == b));
        System.out.println("Tes ke 10 = " + (a != (b + 2)));
    }
}
