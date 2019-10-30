package com.test;

import java.util.Random;

public class Main {


    public static void main(String[] args) {


        String name = "Zhora";
        int age = generateRandomAge();
        int temperature = +10;

        if (age > 20 && age < 45 && temperature < +30 && temperature > -20) {
            System.out.println("Можно идти гулять");
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            System.out.println("Можно гулять");
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            System.out.println("Тоже Можно");
        } else {
            System.out.println("Лучше сидеть дома");
        }

    }

    public static int generateRandomAge() {
        int age = (int) (Math.random() * 108);
        return age;
    }
}
