package Class25;

public interface Human {
    // public static final redundat becouse by defult all variables are public static final

   //  static final int legs=2; - we can simply stay in legs=2
    int legs=2;
   // public abstract void walk(); - interface only allowed public method

    void walk();
    static void printLegs(){
        System.out.println(legs);
    }
public default void noNeedToWorry(){
    System.out.println("Defult methods are there to do functional programming");
}
}

interface LivingBeing{
    static void printLegs(){
        System.out.println("Not sure");
    }
}
class Maha implements Human,LivingBeing{

    @Override
    public void walk() {
        System.out.println("I can walk");

    }
}