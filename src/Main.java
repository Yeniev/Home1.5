import java.nio.CharBuffer;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Выводим суммы ");
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100_000) + 100_000);
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Задание 1");

        int myArray[] = array;
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println();
        System.out.println("Задание 2");

        int[] A = array;

        int max = Arrays.stream(A)
                .max()
                .getAsInt();

        int min = Arrays.stream(A)
                .min()
                .getAsInt();

        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");

        System.out.println();
        System.out.println("Задание 3");

        int[] B = array;

        double Average = Arrays.stream(B)
                .average()
                .getAsDouble();
        System.out.println("Средняя сумма трат за месяц составила " + Average + " рублей");

        System.out.println();
        System.out.println("Задане 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int i = reverseFullName.length - 1, j = 0;
        char[] let = new char[reverseFullName.length];
        while (i >= 0) {
            let[j] = reverseFullName[i];
            i--;
            j++;
        }
        for (char c : let) {
            System.out.print(c);
        }
    }
}