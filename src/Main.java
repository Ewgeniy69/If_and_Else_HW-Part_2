public class Main {
    public static void main(String[] args) {

        System.out.println("Задача № 1");

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задача № 2");
        // Исправлено: Вывод сообщения соответствует шаблону.

        int clientOS2 = 1;
        int clientDeviceYear = 2014;

        if (clientOS2 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS2 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (clientOS2 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS2 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        //Исправлено: Уменьшена вложенность условий, так как она превышала допустимый уровень.

        System.out.println("Задача № 3");

        int year = 2025;

        if (year > 1584 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " год является високосным");
        } else if (year > 1584) {
            System.out.println(year + " год не является високосным");
        } else {
            System.out.println("Год не может быть меньше 1585");
        }
        // Исправлено: устранена избыточная вложенность условий.

        System.out.println("Задача № 4");

        int deliveryDistance = 19;
        int deliveryDay = 1;

        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
            return;
        } else if (deliveryDistance < 20) {
            deliveryDay = 1;
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
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

