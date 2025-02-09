public class Main {
    public static void main(String[] args) {

        System.out.println("Задача № 1");

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию для IOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задача № 2");

        int clientOS2 = 1;
        int clientDeviceYear = 2015;

        if (clientOS2 == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию версию для IOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию версию для IOS по ссылке");
            }
        } else if (clientOS2 == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию версию для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию версию для Android по ссылке");
            }
        }

        System.out.println("Задача № 3");

        int year = 2025;

        if (year > 1584) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println("Год не может быть меньше 1585");
        }

        System.out.println("Задача № 4");

        int deliveryDistance = 95;
        int deliveryDay = 1;

        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else if (deliveryDistance <= 20) {
            deliveryDay++;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDay += 1;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDay += 2;
        }
        System.out.println("Потребуется дней:" + deliveryDay);

        System.out.println("Задача № 5");

        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Больше 12 месяцев не существует");
        }

    }
}


