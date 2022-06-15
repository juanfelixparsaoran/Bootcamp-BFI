public class NestedLoop {
    public static void main(String[] args) {
        int a = 4;
        int b = 4;

        for (int i = 0; i<a; i++){
            for (int j = 0; j<b; j++){
                if (j == b-1){
                    System.out.println("n");
                }else{
                    System.out.print("a");
                }
            }
        }
    }
}
