import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int count =scanner.nextInt();
        System.out.println(Arrays.toString(readIntegers(count)));
        System.out.println("------------------");
        System.out.println(findMin(readIntegers(count)));

    }
    public static int[] readIntegers(int count){
        int[] myArray =new int[count];
        for(int i=0;i<count;i++){
            myArray[i]= scanner.nextInt();
        }
        return myArray;
    }
    public static int findMin(int[] arr){
        int min=arr[0];
        for(int i=1 ; i < arr.length;i++){
            if(arr[i]<arr[i-1]){
                min = arr[i];
            }
        }
        return min;
    }
}
