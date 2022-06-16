public class Makanan {
    public static void main(String[] args) {
        Restoran padang = new Restoran();
        padang.setMenu("Ayam Balado");
        padang.setHarga(25000);
        padang.setSpesial(true);

        System.out.println("Menu makanan : " + padang.getMenu());
        System.out.println("Harga : " + padang.getHarga());
        System.out.println("Spesial : " + padang.getSpesial());

    }
}
