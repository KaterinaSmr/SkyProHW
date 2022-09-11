import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        task1(arr);
        task2(arr);
        task2(new int[]{});
        task3(arr);
        task4();
    }

    private static void task1(int[] arr){
        System.out.println("Сумма трат за месяц составила: " + Arrays.stream(arr).sum() + " рублей");
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        System.out.println("Сумма трат за месяц составила: " + sum + " рублей");
    }

    private static void task2(int[] arr){
        System.out.println("Минимальная сумма трат за день составила " +
                Arrays.stream(arr).min().orElse(0) + " рублей. Максимальная сумма трат за день составила " +
                Arrays.stream(arr).max().orElse(0) + " рублей");
    }

    private static void task3(int[] arr){
        if (arr.length > 0) {
            System.out.println("Средняя сумма трат за месяц составила " + (float) Arrays.stream(arr).sum() / arr.length + " рублей");
            System.out.println("Средняя сумма трат за месяц составила " + Arrays.stream(arr).average().getAsDouble() + " рублей");
        } else
            System.out.println("Нет данных для расчета");
    }

    private static void task4(){
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}