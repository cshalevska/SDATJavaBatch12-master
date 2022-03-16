package Class27;

public class Task1 {

}
interface Shape{
    void calculateArea(double input);
    void calculateParameter(double inut);

}
class Circle implements Shape{
    @Override
    public void calculateArea(double input) {
        double area=Math.PI*Math.pow(input,2);
        System.out.println(area);
    }

    @Override
    public void calculateParameter(double input) {
        System.out.println(2*Math.PI*input);
    }
}
class Square implements Shape{

    @Override
    public void calculateArea(double input) {

    }

    @Override
    public void calculateParameter(double inut) {

    }
}