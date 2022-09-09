public class Main {
    public static void main(String[] args) {
        //task1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println(fullName);

        //task2
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName);

        //task3_v1
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName);

        //task3_v2
        fullName = "Иванов Семён Семёнович";
        if (fullName.contains("ё")) {
            String[] strings = fullName.split("ё");
            StringBuilder sb = new StringBuilder(strings[0]);

            for (int i = 1; i < strings.length; i++) {
                sb.append("е");
                sb.append(strings[i]);
            }
            fullName = sb.toString();
        }
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }



}