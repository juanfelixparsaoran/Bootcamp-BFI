

class Switch{
    public static void main (String[] args){
        String day = "T";
        String result = "";
        switch(day){
            case "M":
            case "W":
            case "F":{
                result = "MWF";
                break;
            }

            case "T":
            case "TH":
            case "S":{
                result = "TTS";
                break;
            }

        }

        System.out.println("Old Switch Result");
        System.out.println(result);

    }
}