public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1(){
        int i = 0;
        while (i < 10){
            i++;
            System.out.print(i + " ");
        }

        System.out.println();
        for (int j = 10; j > 0 ; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void task2(){
        int firstFridayOfAMonth = 3;
        final int DAYS_IN_MONTH = 31;

        for (int i = firstFridayOfAMonth; i <= DAYS_IN_MONTH; i += 7) {
             System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
        }
    }

    public  static void task3(){
        int currentYear = 2022;
        int startYear = currentYear - 200;
        final int PERIOD = 79;
        int i = startYear;

        while (i < (currentYear + PERIOD)){
            if (i % PERIOD == 0)
                System.out.println(i);
            i++;
        }
    }
}