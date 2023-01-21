public class VipCostumer {
    private String name;
    private int creditLimit;
    private String emailAddress;
    public VipCostumer(){
        this("Default name", 50000, "default@email.com");
    }
    public VipCostumer(String name, int creditLimit,String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
