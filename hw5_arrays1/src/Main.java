import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        //task1
        int[] array1 = new int[] {1, 2, 3};
        double[] array2 = {1.57, 7.654, 9.986};
        int[] array3 = new int[5];
        for (int i = 0; i < 5; i++) {
            array3[i] = i * 100;
        }
        //task2
        printArray(array1, false);
        printArray(array2, false);
        printArray(array3, false);
        //task3
        printArray(array1, true);
        printArray(array2, true);
        printArray(array3, true);

        //task4
        System.out.println(Arrays.toString(odd2Even(array1)));
    }

    private static void printArray(int[] array, boolean reverseOrder){
        Integer[] array1 = Arrays.stream(array).boxed().toArray(Integer[]::new );
        printArray(array1, reverseOrder);

    }
    private static void printArray(double[] array, boolean reverseOrder){
        Double[] array1 = Arrays.stream(array).boxed().toArray(Double[]::new );
        printArray(array1, reverseOrder);
    }
    private static <T> void printArray(T[] array, boolean reverseOrder) {
        List<T> list = Arrays.asList(array);
        if (reverseOrder)
            Collections.reverse(list);
        for (T t:list) {
            System.out.print(t + ", ");
        }
        System.out.println();
    }

    private static int[] odd2Even (int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1)
                array[i]++;
        }
        return array;
    }


}