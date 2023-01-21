public class Bank {
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
    private int accountNumber;
    private  int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int despositeFunds(int mountToAdd){
        this.balance+= mountToAdd;
        return this.balance;
    }
    public void withdrawFunds(int mountToDeduct){
        if(this.balance - mountToDeduct < 0){
            System.out.println("You connot deduct this mount");
        } else if (this.balance == mountToDeduct) {
            this.balance-= mountToDeduct;
            System.out.println("Your balance is null");
        }else{
            this.balance-= mountToDeduct;
            System.out.println("Your balance is :" + this.balance);
        }
    }
}
