public class FeetAndInchesToCentimeters {
   public static double calcFeetAndInchesToCentimeters(double feet,double inches){
       if(feet < 0 || (inches <0 || inches > 12)) {
           System.out.println("Invalid feet or inches");
           return -1;
       }
       double centimeters=((feet*12)+inches)*2.54;
       System.out.println(feet + " feet and " + inches +
               " = " + centimeters + " centimeters");
       return centimeters;
   }

   public static double calcFeetAndInchesToCentimeters(double inches){
       if(inches < 0) {
           System.out.println("Invalid feet");
           return -1;
       }
       double feet = (int)(inches/12);
       double remainingInches = (int)(inches%12);
       System.out.println(inches + " inches = " +
               feet + " feet and "+ remainingInches + " inches" );
       return calcFeetAndInchesToCentimeters(feet,remainingInches);
   }

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(125);
        calcFeetAndInchesToCentimeters(13,1);
    }
}
