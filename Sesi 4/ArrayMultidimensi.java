public class ArrayMultidimensi {
    public static void main(String[] args) {
        String [][] framework = {{"Java", "SpringBoot"}, {"Javascript", "React.js"},{"PHP","Laravel"}};
        for (int i = 0; i<framework.length; i++){
            System.out.print("Bahasa : " + framework[i][0]);
            System.out.println(", Framework : " + framework[i][1]);
        }
    }
}
