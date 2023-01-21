import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter your age: ");
        //verifier si has  int as input
        boolean hasNextInt= scanner.hasNextInt();
        if(hasNextInt){
            int age = scanner.nextInt();
            System.out.println("my name is  " + name + " and my age: " + age);
        }else{
            System.out.println("Unable to parse year of birth");
        }
        scanner.close();
    }
}
