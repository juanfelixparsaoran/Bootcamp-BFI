import java.text.NumberFormat;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class Penjualan {
    //Function for print currency
    static String printHarga(Locale locale, int harga){
        NumberFormat formatter=NumberFormat.getCurrencyInstance(locale);  
        return formatter.format(harga);
    }
    public static void main(String[] args) {
        System.out.println("PROGRAM JAVA TENTANG PENJUALAN BARANG");
        System.out.print("Masukkan jumlah beli : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        //Store Barang
        Barang b1 = new Barang(1,"Mouse Bluetooth 5.0",149999,10);
        Barang b2 = new Barang(2,"Headphone External",246000,5);
        Barang b3 = new Barang(3,"Power Bank 10.000 mAh",136000,0);
        Barang b4 = new Barang(4,"Tripod Kamera", 267999,20);
        Barang b5 = new Barang(5,"Smart Watch Xiaomi",899000,10);
        Barang [] beli = {b1,b2,b3,b4,b5};

        //Temp list for inputan kode dan qty
        LinkedList<Integer> listKode = new LinkedList<>();
        LinkedList<Integer> listQty = new LinkedList<>();
        for (int i=0; i<n;i++){
            System.out.print("Masukkan kode barang ke-1 : ");
            int kode = scan.nextInt();
            listKode.add(kode);

            System.out.print("Masukkan qty barang ke-1 : ");
            int qty = scan.nextInt();
            listQty.add(qty);
        }

        scan.close();

        //Init Locale
        Locale indoLocale = new Locale("in","ID");
        int totalPembayaran = 0;

        //Print detail barang
        for (int i = 0; i<n; i++){
            String nama = beli[listKode.get(i)-1].nama;
            int harga = beli[listKode.get(i)-1].harga;
            int qty = listQty.get(i);
            int kode = listKode.get(i);
            int diskon = beli[listKode.get(i)-1].diskon;
            int subTotal = beli[listKode.get(i)-1].harga * listQty.get(i) *(100-diskon)/100;
            System.out.println("No    Nama Barang             Harga               Qty     Diskon      Sub Total");
            System.out.println(kode + "     "+nama+ "       "+printHarga(indoLocale,harga)+ "        "+qty+ "       "+diskon+ "%         " + printHarga(indoLocale,subTotal));
            totalPembayaran += subTotal;
        }
        //Print Total Bayar
        System.out.print("\nTotal bayar : " + printHarga(indoLocale,totalPembayaran));
    }
}
