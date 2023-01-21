import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int counter =0;
        int min=0;//min = Integer.MAX_VALUE;
        int max=0;//max = Integer.MIN.VALUE
        boolean first= true;
        while(counter <10){
            System.out.println("ENTER A NUMBER " + counter);
            boolean hasNextNumber = scanner.hasNextInt();
            if(hasNextNumber){
                int value = scanner.nextInt();
                if(first){
                    first =false;
                    min=value;
                    max=value;
                }
                if(value<min){
                    min=value;
                }
                if(value> max){
                    max=value;
                }
                counter++;
                scanner.nextLine();
            }else{
                System.out.println("The max value is "+ max);
                System.out.println("The min value is  "+ min);
                break;

            }

        }
        System.out.println("The max value is "+ max);
        System.out.println("The min value is  "+ min);
        scanner.close();
    }
}
