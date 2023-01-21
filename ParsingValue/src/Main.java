public class Main {
    public static void main(String[] args){
        String numberAsString ="2018";
        System.out.println("numberAsString= "+ numberAsString);
        int number = Integer.parseInt(numberAsString);
        System.out.println("numberAsInt= "+ number);
        number+=1;
        System.out.println("numberAsInt Actual= "+ number);
        String numberAsStrings ="2018.123";
        System.out.println("numberAsString= "+ numberAsStrings);
        float numbers = Float.parseFloat(numberAsStrings);
        System.out.println("numberAsFloat= "+ numbers);
        numbers+=1;
        System.out.println("numberAsInt Float= "+ numbers);
    }
}
