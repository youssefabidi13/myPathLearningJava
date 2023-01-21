public class Main {
    // Create a new class for a bank account
    // Create fields for the account number, balance, customer name, email and phone number.
    //
    // Create getters and setters for each field
    // Create two additional methods
    // 1. To allow the customer to deposit funds (this should increment the balance field).
    // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
    // but not allow the withdrawal to complete if their are insufficient funds.
    // You will want to create various code in the Main class (the one created by IntelliJ) to
    // confirm your code is working.
    // Add some System.out.println's in the two methods above as well.
    public static void main(String[] args) {
        Bank youssefAccount = new Bank();
        youssefAccount.setAccountNumber(12345);
        youssefAccount.setEmail("youssef.abidi@etu.uae.ac.ma");
        youssefAccount.setBalance(10000);
        youssefAccount.setCustomerName("YoussefABIDI");
        youssefAccount.setPhoneNumber("0619747102");
        youssefAccount.despositeFunds(1000);
        youssefAccount.withdrawFunds(10000);
        VipCostumer person1 = new VipCostumer();
        System.out.println(person1.getName());
        VipCostumer person3 = new VipCostumer("Tim", 100, "tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }
}
