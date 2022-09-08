import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        task1(arr);
        task2(arr);
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
                Arrays.stream(arr).min().getAsInt() + " рублей. Максимальная сумма трат за день составила " +
                Arrays.stream(arr).max().getAsInt() + " рублей");
    }

    private static void task3(int[] arr){
        System.out.println("Средняя сумма трат за месяц составила "+ (float) Arrays.stream(arr).sum() / 30 +" рублей");
        System.out.println("Средняя сумма трат за месяц составила "+ Arrays.stream(arr).average().getAsDouble() +" рублей");
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