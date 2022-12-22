import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    private static void task1(){
        byte b = 1;
        short e = 2;
        int i = 3;
        long l = 100L;
        float f = 300.01f;
        double d = 123.333;
        boolean h = true;
        char c ='a';
    }

    private static void task2(){
        float f = 27.12f;
        long l = 987_678_965_549L;
        double d = 2.786;
        short s = 569;
        int j = -159;
        int i = 27897;
        byte b = 67;
    }

    private static void task3(){
        final int lP = 23;
        final int aS = 27;
        final int eA = 30;
        final int totalPaper = 480;
        System.out.println("На каждого ученика рассчитано " + totalPaper/(lP+aS+eA) + " листов бумаги");
    }

    private static void task4(){
        int performance = 16/2;
        int[] arr = {
                20,
                24 * 60,
                24 * 60 * 3,
                24 * 60 * 30
        };
        for (int i = 0; i < arr.length; i++) {
            System.out.println("За "+ arr[i] +" минут машина произвела "+ arr[i] * performance+" штук бутылок");
        }
    }

    private static void task5(){
        int totalTinsOfPaint = 120;
        int whiteTinsFor1Classroom = 2;
        int brownTinsFor1Classroom = 4;

        int totalClassrooms = totalTinsOfPaint/(whiteTinsFor1Classroom + brownTinsFor1Classroom);
        System.out.println("В школе, где "+totalClassrooms+" классов, нужно "+totalClassrooms * whiteTinsFor1Classroom
                +" банок белой краски и "+ totalClassrooms * brownTinsFor1Classroom+" банок коричневой краски");
    }

//    private static void task2(){
//        float boxer1 = 78.2f;
//        float boxer2 = 82.7f;
//        System.out.println("Total weight = " + (boxer1 + boxer2));
//        System.out.println("Weight difference = " + (boxer2 - boxer1));
//    }
//
    private static void task6(){
        int bananaWeight = 80;
        int bananaQty = 5;
        int milkWeight = 105;
        int milkQty = 2;
        int iceCreamWeight = 100;
        int iceCreamQty = 2;
        int eggWeight = 70;
        int eggQty = 4;

        float weight = (bananaWeight*bananaQty + milkWeight * milkQty + iceCreamWeight*iceCreamQty
                + eggWeight * eggQty) ;
        System.out.println("Вес в граммах = " + weight + "кг");
        System.out.println("Вес в килограммах = " + weight/1000f + "кг");
    }

    private static void task7(){
        int dailyWeightLoose1 = 250;
        int dailyWeightLoose2 = 500;
        float weightToLoose = 7000f;

        float days1 = weightToLoose / dailyWeightLoose1;
        float days2 = weightToLoose / dailyWeightLoose2;

        System.out.println("Дней при ежедневной норме " + dailyWeightLoose1 + "г: " + days1);
        System.out.println("Дней при ежедневной норме " + dailyWeightLoose2 + "г: " + days2);
        System.out.println("Дней в среднем " + ((days1+days2)/2));
    }

    private static void task8(){
        final float increaseRate = 1.1f;
        HashMap<String, Float> employeeSalary= new HashMap<>();
        employeeSalary.put("Маша", 67760f);
        employeeSalary.put("Денис", 83690f);
        employeeSalary.put("Кристина", 76230f);

        for (Map.Entry<String, Float> e : employeeSalary.entrySet()) {
            float oldSalary = e.getValue();
            e.setValue(oldSalary * increaseRate);
            System.out.println(e.getKey() + " теперь получает " + e.getValue()
                    + " рублей. Годовой доход вырос на " + ((e.getValue()-oldSalary)*12) + " рублей.");
        }


    }
}