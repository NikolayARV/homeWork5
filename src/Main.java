public class Main {
     public static void main(String[] args) {
          System.out.println("Hello world!");
          System.out.println("Задача 1");
          char clientOS = 0;
          if (clientOS == 0) {
               System.out.println("Установите версию приложения для iOS по ссылке");
          }
          if (clientOS == 1) {
               System.out.println("Установите версию приложения для Android по ссылке");
          }
          System.out.println("Задача 2");
          int clientDeviceYear = 2012;
          if (clientOS == 0 && clientDeviceYear < 2015) {
               System.out.println("Установите облегченную версию приложения для iOS по ссылке");
          } else if (clientOS == 0 && clientDeviceYear >= 2015) {
               System.out.println("Установите версию приложения для iOS по ссылке");
          }
          if (clientOS == 1 && clientDeviceYear < 2015) {
               System.out.println("Установите облегченную версию приложения для Android по ссылке");
          } else if (clientOS == 1 && clientDeviceYear >= 2015) {
               System.out.println("Установите версию приложения для Android по ссылке");
          }
          System.out.println("Задача 3");
          int year = 2100;
          if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
               System.out.println(year + " год является високосным.");
          } else {
               System.out.println(year + " год не является високосным.");
          }
          System.out.println("Задача 4");
          int deliveryDistance = 105;
          int deliveryDays = 1;
          if (deliveryDistance > 20) {
               deliveryDays = deliveryDays + 1;
          }
          if (deliveryDistance > 60) {
               deliveryDays = deliveryDays + 1;
          }
          if (deliveryDistance > 100) {
               deliveryDays = deliveryDays + 1;
          }
          System.out.println("Потребуется " + deliveryDays + " дней доставки.");
          System.out.println("Задача 5");
          int monthNumber = 15;
          switch (monthNumber) {
               case 1:
               case 2:
               case 12:
                    System.out.println("Это зимний месяц.");
                    break;
               case 3:
               case 4:
               case 5:
                    System.out.println("Это весенний месяц.");
                    break;
               case 6:
               case 7:
               case 8:
                    System.out.println("Это летний месяц.");
                    break;
               case 9:
               case 10:
               case 11:
                    System.out.println("Это осенний месяц.");
                    break;
               default:
                    System.out.println("Нет такого месяца.");
          }
     }
}
