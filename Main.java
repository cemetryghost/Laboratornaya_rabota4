package com.company;

public class Main {

    public static void main(String[] args) {
        int MyArray[] = {7, 20, 78, 16, 2, 157};
        int min = MyArray[0];
        double sr_arif = 0;

        for(int i =0; i < MyArray.length; i++){
            if(MyArray[i] < min){
                min = MyArray[i];
            }
        }
        System.out.println("Minimum element = " + min);

        if(MyArray.length > 0){
            double amount1 = 0;
            for (int p : MyArray) {
                amount1 += p;
            }
            sr_arif = amount1 / MyArray.length;
        }
        double amount2 = sr_arif + min;
        System.out.println("Arithmetic mean = " + sr_arif);
        System.out.println("Sum of the minimum element and the arithmetic mean = " + amount2);
    }
}
