package Class30;

import java.util.HashMap;

public class Mapemo1 {
    public static void main(String[] args) {
        HashMap<String,Double> fruitMap=new HashMap<>();
       // fruitMap.put("Apple",20); auto casting does not working in collection and maps
    fruitMap.put("Apple",20.2);
        fruitMap.put("Banana",10.2);
        fruitMap.put("Kiwi",105.2);
        fruitMap.put("Oranges",16.5);
        fruitMap.put("Mango",20.2);
        fruitMap.put("Banana",12.2);//duplicate values are overqitten
        System.out.println(fruitMap);
        System.out.println(fruitMap.get("kiwi"));// case sensative
        fruitMap.remove("Mango");
        System.out.println(fruitMap);
        System.out.println(fruitMap.containsValue(20));
        System.out.println(fruitMap.containsKey("Kiwi"));
        System.out.println(fruitMap.isEmpty());
        System.out.println(fruitMap.size());
        fruitMap.replace("Banana",50.0);
        System.out.println(fruitMap);
    }
}
