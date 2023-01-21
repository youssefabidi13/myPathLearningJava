package academy.learnprogramming;

public class Main {
    public static void main(String[] args){
       double firstValue =20d;
       double secondValue =80d;
       double finalResult = (firstValue+secondValue)*100d;
       double TheReminder = finalResult%40;
       boolean check=TheReminder==0 ? true : false;
       System.out.println(check);
       if(check!=true){
           System.out.println("got some reminder");
       }else{
           System.out.println("its a fucking true");
       }
    }
}
