import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList  items = new ArrayList();
        items.add(1);
        items.add(2);
        //items.add("TIM");
        items.add(4);
        items.add(5);
        printDoubled(items);
    }
    public static void printDoubled(ArrayList n){
        for(Object i : n){
            System.out.println((Integer) i * 2);
        }
    }
}
