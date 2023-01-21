public class Main {
    public static void main(String args[]){
        double centimeters = Converter.calcFeetAndInchesToCentimeters(6,0);
        if(centimeters<0.0){
            System.out.println("Invalid parameters");
        }
        Converter.calcFeetAndInchesToCentimeters(100);
    }
}
