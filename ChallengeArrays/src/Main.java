import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int[] arr1 =  getIntegers(5);
        printArray(arr1);
        System.out.println("-------------------------");
        printArray(sortIntegers(arr1));

    }
    public static int[] getIntegers(int number){
        int[] arr = new int[number];
        for(int i=0 ; i < number ;i++){
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    public static void printArray(int[] arr){
        for(int i=0;i < arr.length;i++){
            System.out.println("arr[" + i + "] = " + arr[i] );
        }
    }
    public static int[] sortIntegers(int[] arr){
        int[] sortedArray = new int[arr.length];
        int tmp;
        for(int i=0;i<sortedArray.length;i++){
            sortedArray[i]=arr[i];
        }
        boolean flag = true;
        while(flag){
            flag =false;
            for(int i=0;i< arr.length -1;i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    tmp =sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] =tmp;
                    flag=true;
                }
            }
        }

        return sortedArray;
    }
}
