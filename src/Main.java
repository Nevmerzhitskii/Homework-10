public class Main {
    public static void main(String[] args) {
        checkYear(1621);
        checkDevice(14, 1);
        printDeliveryCard(20);

    }


    public static void checkYear(int year) {
        System.out.println("Задача№1");


        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Год является високосным");
        } else {
            System.out.println(year + " Год не является високосным");
        }

    }

    public static void checkDevice(int clientDeviceYear, int clientOS) {
        System.out.println("Задача№2");


        if (clientDeviceYear < 15 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 15 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке ");
        }
        if (clientDeviceYear >= 15 && clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке ");

        } else if (clientDeviceYear >= 15 && clientOS == 0)
            System.out.println("Установите версию приложения для Android по ссылке");
    }

    public static void printDeliveryCard (int distance) {

        int days = calcDeliveryDays(distance);


        if (days > 0) {
            System.out.println("Потребуется дней " + days);

        } else {
            System.out.println(" Доставка не осуществляется");
        }
    }

public static int calcDeliveryDays(int distance){
       if (distance <= 20){
           return 1;
       }else if (distance <= 60){
           return 2;
       } else if (distance <= 100){
           return 3;
       }else {
           return -1;
       }

}




}
