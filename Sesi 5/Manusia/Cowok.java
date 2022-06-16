

public class Cowok extends Manusia implements Dewasa {
    //Overriding
    @Override
    protected void nyanyiLagu(){
        System.out.println("da du da du");
    }

    //Overriding
    @Override
    public void jalan(){
        System.out.println("Cowok Dewasa Jalan");
    }
    
}
