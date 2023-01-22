import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        System.out.println(number[1]);
        int[] number1 = new int[3];
        for (int index = 0; index < number1.length; index++) {
            number1[index] = index + 4;
        }
        //number1[0] = 4; How to do with 4, 5, 6
        //number1[1] = 5;
        //number1[2] = 6;
        int forUnderstand = number1[2];
        System.out.println(forUnderstand);
        int[] number2 = new int[3];
        number2[0] = 7;
        number2[1] = 8;
        number2[2] = 9;
        int forUnderstand1 = 0;
        System.out.println(number2[forUnderstand1]);
        System.out.println();

        //Task 1.1
        System.out.println("Task 1.1");
        double[] array = {1.57, 7.654, 9.986};
        System.out.println(array[1]);
        System.out.println();

        //Task 2
        System.out.println("Task 2");

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
            if(i != number.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.print(number1[0]);
        for (int i = 1; i < number1.length; i++) {
            System.out.print(", " + number1[i]);
        }
        System.out.println();

        System.out.print(number2[0]);
        for (int i = 1; i < 3; i++) {
            System.out.print(", " + number2[i]);
        }
        System.out.println();

        System.out.print(array[0]);
        for (double i = 1; i < array.length; i++) {
            System.out.print(", " + array[(int)i]);
        }
        System.out.println();
        System.out.println();

        //Task 3
        System.out.println("Task 3");

        for (int i = 2; i >= 0; i--) {
            System.out.print(number[i]);
            if(i != number.length - 3){
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.print(array[2]);
        for (int i = 1; i >= 0; i--) {
            System.out.print(", " + array[i]);
        }
        System.out.println();
        System.out.println();

        //Task 4
        System.out.println("Task 4");
        for (int ind = 0; ind < number.length; ind++) {
            if (number[ind] % 2 == 1) {
                number[ind] += 1;
            }

        }
        System.out.println(Arrays.toString(number));
        System.out.println();
    }
}