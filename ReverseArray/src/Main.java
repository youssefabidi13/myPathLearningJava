import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void reverse(int[] arr){
        int maxIndex=arr.length - 1;
        int halfLenght = arr.length / 2;
        for (int i =0 ;i< halfLenght;i++){
            int temp = arr[i];
            arr[i]=arr[maxIndex-i];
            arr[maxIndex-i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        int[] arr ={1,5,31,3556,78};
        System.out.println(Arrays.toString(arr));
        System.out.println("------------");
        reverse(arr);
    }
}
