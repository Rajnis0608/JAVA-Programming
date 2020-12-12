public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking,int hourOfDay){
        if(hourOfDay > 23 || hourOfDay < 0 ){
            return false;
        }
        if(barking && hourOfDay < 8 || hourOfDay > 22){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,1));
        System.out.println(shouldWakeUp(false,2));
        System.out.println(shouldWakeUp(true,8));
    }
}

