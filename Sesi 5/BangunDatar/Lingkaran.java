public class Lingkaran extends BangunDatar {
    float r;

    @Override
    float luas() {
        return (float) (3.14 * r * r);
    }

    @Override
    float keliling() {
        return (float) (3.14 * 2 * r);
    }

}
