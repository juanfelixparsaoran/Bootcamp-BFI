class OperatorAssignment{
    public static void main(String[] args){
        int a,b;
        a = 5;
        b = 10;

        b += a;
        System.out.println("Penambahan : " + b);

        b -= a;
        System.out.println("Pengurangan : " + b);

        b *= a;
        System.out.println("Perkalian : " + b);

        b /= a;
        System.out.println("Pembagian : " + b);

        b %= a;
        System.out.println("Sisa Bagi : " + b);
    }
}