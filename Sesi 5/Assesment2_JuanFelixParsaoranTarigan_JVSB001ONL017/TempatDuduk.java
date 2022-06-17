public class TempatDuduk {
    public static void main(String[] args) {
        //Init bahasa
        String [][] bahasa = {{"php","ruby","java"},{"golang","javascript","swift"}};

        System.out.println("output :");
        for (int i = 0; i<bahasa.length;i++){
            for (int j = 0; j<bahasa[i].length; j++){
                System.out.println("    siapa yang akan duduk di kelas ("+i+","+j+") : " + bahasa[i][j]);
            }

        }

        System.out.println("==========================================");
        for (int i = 0; i<bahasa.length;i++){
            for (int j = 0; j<bahasa[i].length; j++){
                System.out.print("| "+bahasa[i][j]+" |");
                if (j != bahasa[i].length - 1){
                    if (i == 0)
                    System.out.print("        ");
                    else
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
        System.out.println("==========================================");
    }
}
