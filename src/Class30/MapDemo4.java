package Class30;

import java.util.HashMap;
import java.util.Iterator;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Apple",20.2);
        fruitMap.put("Banana",10.2);
        fruitMap.put("Kiwi",105.2);
        fruitMap.put("Oranges",16.5);
        fruitMap.put("Mango",20.2);

       Iterator<String> iterator= fruitMap.keySet().iterator();
       while (iterator.hasNext()){
           String key=iterator.next();
           Double value=fruitMap.get(key);
           if(key.contains("e")&& value>=20){
               iterator.remove();
           }
       }
        System.out.println(fruitMap);
    }
}
