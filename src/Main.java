public class Main {
    public static void main(String[] args) {
        //Задача1
        System.out.println("Задача 1");
        int clientOS = 1;
        int iOS = 0;
        int android = 1;
        if (clientOS == iOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == android) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задача 2
        System.out.println("Задача 2");
        int clienTOS = 0;
        int yearOfLssue = 2016;
        if (clienTOS == 0 && yearOfLssue < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clienTOS == 0 && yearOfLssue >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clienTOS == 1 && yearOfLssue < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clienTOS == 1 && yearOfLssue >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задача 3
        System.out.println("Задача 3");
        int year = 1700;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        //Задача 4
        System.out.println("Задача 4");
        int deliveryDistance = 101;
        int deliveryTime = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + deliveryTime * 2);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + deliveryTime * 3);
        } else {
            System.out.println("Доставки нет.");
        }
        //Задача 5
        System.out.println("Задача 5");
        int monthNumber = 15;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень.");
                break;
            default:
                System.out.println("В году 12 месяцев.");
        }

    }
}
