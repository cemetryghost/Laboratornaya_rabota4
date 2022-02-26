package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(3, 10);
        int[] MyArray = new int[size];

        System.out.print("Array: ");

        for(int i = 0; i < MyArray.length; i++){
            MyArray[i] = random.nextInt(15);
            System.out.print(MyArray[i] + "  ");
        }
        System.out.println();

        int min = MyArray[0];
        double sr_arif = 0;

        for (int z : MyArray) {
            if (z < min) {
                min = z;
            }
        }

        if(MyArray.length > 0){
            double amount1 = 0;
            for (int p : MyArray) {
                amount1 += p;
            }
            sr_arif = amount1 / MyArray.length;
        }
        double amount2 = sr_arif + min;
        System.out.println("Minimum element = " + min);
        System.out.println("Arithmetic mean = " + sr_arif);
        System.out.println("Sum of the minimum element and the arithmetic mean = " + amount2);
    }
}
