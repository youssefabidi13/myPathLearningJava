public class Main {
    public static void main(String args[]){
        checkNumber(15);
    }
    public static void checkNumber(int number){
        if(number>0){
            System.out.println(number  +" is positve");
        }else if(number<0){
            System.out.println(number +" is negative");
        }else{
            System.out.println(number +" is null");
        }
    }
}
