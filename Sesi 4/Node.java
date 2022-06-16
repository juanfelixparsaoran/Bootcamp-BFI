public class Node {
    Node left,right;
    int value;
    
    public void input(int a){
        value = a;
    }

    public static void main(String[] args) {
        Tree tr = new Tree();
        Node nd = new Node();
        
        int menu = 1, r=1, a;

        while (menu!=3){
            System.out.println("1. input\n2. view\n3. exit");
            System.out.print("Masukkan pilihan menu : ");
            menu = tr.in.nextInt();

            if (menu == 1){
                System.out.print("Masukkan angka : ");
                a = tr.in.nextInt();
                if (r==1){
                    nd.input(a);
                    r--;
                }
                else tr.insert(nd, a);
            }else if (menu == 2) tr.view(nd);
            else if (menu == 3) System.out.println("Keluar");
            else System.out.println("Salah");
        }
    }
}
