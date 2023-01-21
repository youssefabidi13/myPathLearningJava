public class Main {
    public static void main(String[] args){
//        Player player = new Player();
//        player.fullName ="Tim";
//        player.health=20;
//        player.weapon="Sword";
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaing health = " + player.healthRemaining());
//        damage = 11;
//        player.health= 100;
//        player.loseHealth(damage);
//        System.out.println("Reamaing health = " + player.healthRemaining());
        EnhancedPlayer player = new EnhancedPlayer("Tim",200,"Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}
