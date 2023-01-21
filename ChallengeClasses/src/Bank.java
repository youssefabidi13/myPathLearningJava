public class Bank {
    //fields
    private String accountNumber;
    private double balance ;
    private String name;
    private String email;
    private String phoneNumber;
    //constructer
    public Bank(){
        this("56789",25,"default name","Default address","default phone");
        System.out.println("Empty constructor called");

    }
    public Bank(String accountNumber, double balance,String name,String email,String phoneNumber ){
         this.accountNumber=accountNumber;
         this.balance=balance; 
         this.name=name;
         this.email=email;
         this.phoneNumber=phoneNumber;
    }
    //getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    //methods
    public void despositFunds(double sumToAdd){
        this.balance+=sumToAdd;
        System.out.println("The actual  balence is "+ this.balance);
    }
    public void withdrawFunds(double sumToDeduct){
        if(this.balance<sumToDeduct){
            System.out.println("You don't have enaugh monney to reduce only "+this.balance+ " available");
        }else{
            this.balance-=sumToDeduct;
            System.out.println("The actual  balence is "+ this.balance);
        }
    }
}
