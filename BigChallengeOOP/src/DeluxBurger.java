public class DeluxBurger extends Hamburger{
    public DeluxBurger(){
        super("Delux","Sausage & Bacon",14.54,"White");
        super.addHamburgerAddition1("chips",2.75);
        super.addHamburgerAddition2("Drink",1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot not add additionnal items to a delux burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot not add additionnal items to a delux burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot not add additionnal items to a delux burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot not add additionnal items to a delux burger");
    }
}
