import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("myName","Youssef");
        map.put("actor","John");
        map.put("ceo","Marisa");
//        Set<String> keys = map.keySet();
//        for (String key : keys) {
//            System.out.println(key + " " + map.get(key));
//        }
        Set<Map.Entry<String,String>> values = map.entrySet();
        for (Map.Entry<String,String> e:
             values) {
            System.out.println(e.getKey()+" : "+e.getValue());
            e.setValue("III");
        }
    }
}
