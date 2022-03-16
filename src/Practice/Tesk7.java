package Practice;

public class Tesk7 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i+=3) { // when we need to skip 2,3,4 we are adding i+=2,or 3

                System.out.println(numbers[i]);
            }
        }
    }

