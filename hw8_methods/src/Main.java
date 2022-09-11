import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //task1
        checkLeapYear(2000);
        checkLeapYear(1900);
        checkLeapYear(2020);

        //task2
        defineAppVersion(1, 2020);
        defineAppVersion(0, 2022);

        //task3
        System.out.println("Потребуется дней " + calculateDeliveryDays(95));
    }

    private static void checkLeapYear(int year){
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    private static void defineAppVersion(int clientOS, int clientDeviceYear){
        String os;
        String version="";

        if (clientOS==0)
            os = "iOS";
        else if (clientOS == 1)
            os = "Android";
        else {
            System.out.println("Операционная система не может быть определена");
            return;
        }

        if (clientDeviceYear < LocalDate.now().getYear())
            version = "облегченную ";
        System.out.println("Установите " + version + "версию приложения для " + os + " по ссылке");
    }

    private static int calculateDeliveryDays(int deliveryDistance){
        return 1 + (deliveryDistance+20)/40 ;
    }
}