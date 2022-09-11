public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    private static void task1(){
        int clientOS = 0;

        if (clientOS == 1)
            System.out.println("Установите версию приложения для Android по ссылке");
        else if (clientOS == 0)
            System.out.println("Установите версию приложения для iOS по ссылке");
    }

    private static void task2(){
        int clientOS = 1;
        int clientDeviceYear = 2010;
        String os="";
        String version = "";

        if (clientOS==0)
            os = "iOS";
        else if (clientOS == 1)
            os = "Android";
        if (clientDeviceYear <= 2015)
            version = "облегченную ";

        System.out.println("Установите " + version + "версию приложения для " + os + " по ссылке");
    }

    private static void task3(){
        int year = 1900;
        boolean isLeapYear = false;

        if (year % 400 == 0)
            isLeapYear = true;
        else if (year % 100 == 0)
            isLeapYear = false;
        else if (year % 4 == 0)
            isLeapYear = true;

        System.out.println(year + " год" + (isLeapYear ? " " : " не ") + "является високосным");

    }

    private static void task4(){
        int deliveryDistance = 95;
        int days = 1 + (deliveryDistance+20)/40 ;
        System.out.println("Потребуется дней " + days);
    }

    private static void task5(){
        int monthNumber = 8;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + " месяц принадлежит сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц принадлежит сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц принадлежит сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц принадлежит сезону осень");
                break;
            default:
                System.out.println("Ошибка: не существует месяца с номером " + monthNumber);
        }
    }
}