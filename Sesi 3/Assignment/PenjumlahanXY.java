public class PenjumlahanXY {
    public static void main(String[] args) {
        int x1,x2,y1 = 4, y2 = 5;

        x1 = (y1 + y2) * (y1+y2);
        x2 = (y1 % 4) * y2;

        System.out.println("Hasil X1 = " + x1);
        System.out.println("Hasil X2 = " + x2);

        //LanjutanPenjumlahan XY
        System.out.println("X1 >= X2 : " + (x1>=x2));
        System.out.println("X2 >= X1 : " + (x2>=x1));
        System.out.println("X1 mod 4 == ++X2 mod 5 : " + ((x1 % 4) == (++x2 % 5)));
        

    }
}
