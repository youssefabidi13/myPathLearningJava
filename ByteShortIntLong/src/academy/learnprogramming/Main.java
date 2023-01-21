package academy.learnprogramming;

public class Main {
    public static void main(String[] args){
        byte myByteValue = 10;
        short myShortValue = 20;
        int myIntValue=50;
        long myLongValue=(50000+10*(myByteValue+myShortValue+myIntValue));
        System.out.println("My long value is" + myLongValue);

    }
}
