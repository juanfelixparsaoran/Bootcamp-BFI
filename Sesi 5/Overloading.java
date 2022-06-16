public class Overloading {
    static double maxNumber(double a, double b){
        return (a>b) ? a : b;
    }

    static int maxNumber(int a, int b){
        return (a>b) ? a : b;
    }
    
    public static void main(String[] args) {
        System.out.println("Max double : " + maxNumber(2.5, 3.6));
        System.out.println("Max int : " + maxNumber(2, 6));
    }
}
