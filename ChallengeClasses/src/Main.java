public class Main {
    public static void main(String[] args){
        Bank cih = new Bank("123",000,"Abidi","youssef@gmail.com","0612423");
        System.out.println("Youssef account number is: "+ cih.getAccountNumber());
        cih.withdrawFunds(20000);
        cih.despositFunds(200000);
        cih.withdrawFunds(20000);
        cih.despositFunds(123);


    }
}
