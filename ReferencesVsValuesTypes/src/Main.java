import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    //values
        int myIntValue = 10;
        int anotherIntValue = myIntValue;
        System.out.println("myIntValue " + myIntValue);
        System.out.println("AnotherIntValue " + anotherIntValue);

        anotherIntValue++;
        System.out.println("myIntValue " + myIntValue);
        System.out.println("AnotherIntValue " + anotherIntValue);
//reference
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        System.out.println("MyIntArray= " + Arrays.toString(myIntArray));
        System.out.println("AnotherIntArray= " + Arrays.toString(anotherArray));

        anotherArray[0] =1;
        System.out.println(" after change MyIntArray= " + Arrays.toString(myIntArray));
        System.out.println(" after change AnotherIntArray= " + Arrays.toString(anotherArray));

    }
}
