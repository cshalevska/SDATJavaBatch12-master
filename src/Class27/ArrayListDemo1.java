package Class27;

import Review09.Doctor;

import java.util.ArrayList;
public class ArrayListDemo1 {

    public static void main(String[] args) {
        ArrayList<Double>numberList=new ArrayList<>();
        Double double1= new Double(10.5);
        double number=double1.doubleValue(); //unboxing
        Double number2=new Double(number); //boxing
      // this below is the moste use
        double number3=10.5; //autoboxing
        Double number4=number3;
        number3=number4;//autoboxing

        String name=new String ("hakan");
        String name3="Hakan";
    }
}
