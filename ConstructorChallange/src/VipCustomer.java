public class VipCustomer {
    //fields
    private String name;
    private double creditLimit;
    private String email;

    //contructors
    public VipCustomer() {
        this("NameOFCustumor", 1000000, "name@gmail.com");
        System.out.println("This are the default value \n" + this.name + " has " + this.creditLimit + " credit limit and his email is  " + this.email);
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "youssef@gmail.com");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    //getters
    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmail() {
        return this.email;
    }

}
