package Class27;

import java.util.ArrayList;

public class Task {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Cece");
        name.add("Emilija");
        name.add("Mila");
       name.add("Manna");
        name.add("Monique");

        System.out.println(name.isEmpty());
        System.out.println(name.contains("Emilija"));
        System.out.println(name.size());
        System.out.println(name);
    }

}