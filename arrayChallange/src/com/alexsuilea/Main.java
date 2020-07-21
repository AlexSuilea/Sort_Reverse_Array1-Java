package com.alexsuilea;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] intNumbers = getInt(5);
        int[] sortedIntNumbers=sort(intNumbers);
        print(sortedIntNumbers);
    }

    public static int[] getInt(int number){
        System.out.println("Enter 5 integer numbers:\r");
        int[] elements = new int[number];
        for(int i=0; i<number; i++){
            elements[i] = scanner.nextInt();
        }
        return elements;
    }

    public static void print(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static int[] sort(int[] array){
        int[] copyArray = new int[array.length];
        for(int i=0; i<array.length; i++){
            copyArray[i] = array[i];
        }

        for(int i=0; i<copyArray.length; i++){
            for(int j=i+1; j<copyArray.length; j++){
                if(copyArray[i] < copyArray[j]){
                    int temp = copyArray[i];
                    copyArray[i] = copyArray[j];
                    copyArray[j] = temp;
                }
            }
        }
      return copyArray;
    }



}
