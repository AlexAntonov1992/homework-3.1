public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

//Задача 1
        int cclientOS = 0;
        if (cclientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (cclientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
//Задача 2
        int clientOS = 0;
        int clientDeviceYear = 2014;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

//Задача 3
        int year = 1992;
        if (year == 1964 || year == 1968 || year == 1972 || year == 1976 || year == 1980 || year == 1984 || year == 1988 || year == 1992 || year == 1996 || year == 2000 || year == 2004 || year == 2008 || year == 2012 || year == 2016 || year == 2020 || year == 2024) {
            System.out.println(+year + " год является високосным");
        } else {
            System.out.println(+year + " год не является високосным");
        }
//Задача 4
        int deliveryDistance = 100;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется 1 день");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется 2 деня");
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется 3 деня");
        } else {
            System.out.println("Доставки нет");
        }
//Задача 5
        int monthNumber = 11;
        if (monthNumber >= 1 && monthNumber <= 2 || monthNumber == 12) {
            System.out.println("Зима");
        }else if (monthNumber >= 3 && monthNumber <= 5) {
            System.out.println("Весна");
        }else if (monthNumber >= 6 && monthNumber <= 8) {
            System.out.println("Лето");
        }else if (monthNumber >= 9 && monthNumber <= 11 ) {
            System.out.println("Осень");
        }






    }
}




