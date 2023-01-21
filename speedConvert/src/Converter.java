public class Converter {
    public static float toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("please enter a valid value");
            return -1;
        }else{
            float milePerHour = (float) (kilometersPerHour / 1.609d);
            return milePerHour;
        }
    }
}
