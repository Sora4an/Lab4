// Задача 3
package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] array = new float[]{};

        System.out.println("Enter an element of float array");
        while (!scanner.hasNext("quit")) {
            if (scanner.hasNextFloat()){
                array = Arrays.copyOf(array, array.length + 1);
                array[array.length - 1] = scanner.nextFloat();
                System.out.println("Enter another float or type quit to stop");
            }
            else {
                System.out.println("Error type! Please enter a float");
                scanner.next();
            }
        }
        System.out.print("Your array: " );
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();

        switch (array.length){
            case 1:
                System.out.println("Result array: " + array[0]);
                break;
            case 0:
                System.out.println("Error! Null array");
                break;
            default:
                float[] newArray = new float[array.length];
                int l = 1;
                newArray[0] = array[0];
                for (int i = 1; i < array.length; i++)
                {
                    if (newArray[l - 1] <= array[i])
                    {
                        newArray[l] = array[i];
                        l++;
                    }
                }
                System.out.print("Result array: ");
                for (int i = 0; i < l; i++)
                    System.out.print(newArray[i] + " ");
                break;
        }
        scanner.close();
    }
}
