package Class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
LinkedHashMap<String,Double> fruitMap=new LinkedHashMap<>();
        fruitMap.put("Apple",20.2);
        fruitMap.put("Banana",10.2);
        fruitMap.put("Kiwi",105.2);
        fruitMap.put("Oranges",16.5);
        fruitMap.put("Mango",20.2);

        Set<String>keys=fruitMap.keySet();
        System.out.println(keys);
        Iterator<String> iterator= keys.iterator();
        while(iterator.hasNext()){
            if (iterator.next().contains("e")){
                iterator.remove();
            }
        }
        System.out.println(fruitMap);
    }
}
