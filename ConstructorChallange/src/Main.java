public class Main {
    public static void main(String[] args){
        VipCustomer firstCostumer = new VipCustomer();
        VipCustomer  secondCostumer = new VipCustomer("youssef",25000);
        System.out.println(secondCostumer.getName());
        VipCustomer thirdCostumer = new VipCustomer("messi", 1 , "messi@gmail.com");
        System.out.println(thirdCostumer.getName());
        System.out.println(thirdCostumer.getEmail());
    }

}
