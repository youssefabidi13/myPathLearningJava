import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int counter =0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while(counter < 10){
            System.out.println("Please inter a value nu: " + counter);
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int value;
                value =scanner.nextInt();
                sum+=value;
                counter++;
                System.out.println("La sum actuell est : " + sum);
            }else{
                System.out.println("Invalid Number");
            }
        scanner.nextLine();
        }
        scanner.close();
    }

}
