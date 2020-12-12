public class SecondsAndMinutes {
// output in format XXh YYm ZZs
    public static String getDurationString(int minutes,int seconds){
        if(seconds < 0 || seconds >59 || minutes < 0 ){
            return "Invalid value";
        }
        int hours = minutes/60;
        minutes = minutes % 60;

        String hourString = hours + "h ";
        if(hours<10) {
            hourString = "0" + hourString;
        }
        String minutesString = minutes + "m ";
        if(minutes<10) {
            minutesString = "0" + minutesString;
        }
        String secondsString = seconds + "s";
        if(seconds<10) {
            secondsString = "0" + secondsString;
        }

        return hourString + minutesString +secondsString ;
    }

    public static String getDurationString(int seconds){
        if(seconds<0){
            return "Invalid value";
        }
        int minutes = seconds/60;
        seconds = seconds % 60;
        return  getDurationString(minutes,seconds);
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(61,1));
        System.out.println(getDurationString(3661));
    }
}
