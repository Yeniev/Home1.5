import java.nio.CharBuffer;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[30];
        int sum = array[0];
        int max = array[0];
        //  int min = array[0];
        double mean = array[0];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100_000) + 100_000;
            sum += array[i];
        }
        System.out.print(Arrays.toString(array));
        System.out.println();
        System.out.println("Cумма трат за месяц составила " + sum + " рублей");
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        int min = max;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        for (int j : array) {
            mean += j;
        }
        System.out.println("Средняя сумма трат за месяц " + (int) Math.abs(mean / 30));


        System.out.println();


        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(reverseFullName[i]);
            } else System.out.print(reverseFullName[i]);
        }
    }
}