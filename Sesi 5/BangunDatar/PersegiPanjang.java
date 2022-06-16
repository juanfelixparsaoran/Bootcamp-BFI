
public class PersegiPanjang extends BangunDatar {
    float p,l;
    
    @Override
    float luas(){
        return p * l;
    }

    @Override
    float keliling(){
        return 2 * (p+l);
    }
}
