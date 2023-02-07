import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void checkYear (int year) {
        if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if(year % 100 == 0){
            System.out.println(year + " год не является високосным");
        } else if(year % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public  static  void task1(){
        System.out.println("Задача 1");
        checkYear(2021);
    }

    public static void checkOS (byte clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }
    public  static  void task2(){
        System.out.println("Задача 2");
        checkOS((byte) 0, 2021);
    }

    public static int calcDelivery (int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if(deliveryDistance <= 60){
            return 2;
        } else if(deliveryDistance <= 100){
            return 3;
        } else {
            return 0;
        }
    }
    public  static  void task3(){
        System.out.println("Задача 3");
        int days = calcDelivery(95);
        String[] outMessage = {"Доставки нет", "1 день", "2 дня", "3 дня"};
        System.out.println("На доставку потребуются " + outMessage[days]);
    }
}