
package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String result = shouldGoOut(22, -10);
        System.out.println(result);
        System.out.println(shouldGoOut(17, 11));
        System.out.println(shouldGoOut(50, -9));
        System.out.println(shouldGoOut(100, 100));
        String r = shouldGoOut(50, -11);
        System.out.println(r);

        int randomAge = generateRandomAge();
        int temp = generateRandomTemperature();
        System.out.println(shouldGoOut(randomAge, temp));
        System.out.println(shouldGoOut(randomAge, temp));


    }

    /*Создать возвращаемый метод который будет принимать 2 входящих параметра -
      возраст человека и температуру на улице, и возвращать результат в виде строки.
      */
    public static String shouldGoOut(int ageOfPerson, int temperature) {
        /*Алгоритм метода должен работать следующим образом:
        если возраст человека от 20 до 45 лет и температура на улице от -20 до 30 градусов,
         то возвращаемый результат - “Можно идти гулять”;
         */
        if (ageOfPerson > 20 && ageOfPerson < 45 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять.";
        }

        /*eсли же человеку меньше 20 лет и температура на улице в диапазоне от 0 до 28 градусов,
         то результат снова -  “Можно идти гулять”;
         */
        if (ageOfPerson < 20 && temperature > 0 && temperature < 28) {
            return "Можно идти гулять.";
        }

        /*а если человеку больше 45 лет, то результат “Можно идти гулять” формируется только тогда
        когда на улице температура в диапазоне от -10 до 25 градусов;
         */
        if (ageOfPerson > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять.";
        }
        //В остальных случаях метод должен возвращать результат - “Оставайтесь дома”;
        else {
            return "Оставайтесь дома.";
        }

    }

    //ДЗ на сообразительность:
    //Написать метод в котором генерируется случайный возраст public static int generateRandomAge(){........}
    public static int generateRandomAge() {
        //Random rand = new Random();
        return new Random().nextInt(120) + 1;


    }

    public static int generateRandomTemperature() {
        Random rand = new Random();
        return rand.nextInt(62) - 25;
    }
}