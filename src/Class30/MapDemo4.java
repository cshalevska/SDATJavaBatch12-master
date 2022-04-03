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
// getting the interator from the map with the help of method chainging
        //fist we are getting the set from the map that we are getting the iterator on that set
       Iterator<String> iterator= fruitMap.keySet().iterator();
       while (iterator.hasNext()){ // check ifthere are still elements left in the itarator
           String key=iterator.next(); // getting the key from the iterator
           Double value=fruitMap.get(key); // getting the corresponding value from the map
           if(key.contains("e")&& value>=20){
               iterator.remove();// if both the condition are satisfied we remove the elements
           }
       }
        System.out.println(fruitMap);
    }
}
