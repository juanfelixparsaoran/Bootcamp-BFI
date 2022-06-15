class SwitchNew{
    public static void main (String[] args){
        String day = "A";
        String result = switch(day){
            case "M", "W", "F" -> "MWF";
            case "T", "TH", "s" -> "TTS";
            default ->{
                if(day.isEmpty())
                    result = "Please insert a valid day";
                else
                    result = "Looks like a Sunday";
                throw new IllegalStateException("invalid day: " + result);
            }            
        };
        

        System.out.println(result);

    }
}