public class Main {
     public static void main(String[] args) {
          System.out.println("Hello world!");
          System.out.println("Задача 1");
          char clientOS = 1;
          if (clientOS == 0)
          {
               System.out.println("Установите версию приложения для iOS по ссылке");
          }
          if (clientOS == 1)
          {
               System.out.println("Установите версию приложения для Android по ссылке");
          }
}
}