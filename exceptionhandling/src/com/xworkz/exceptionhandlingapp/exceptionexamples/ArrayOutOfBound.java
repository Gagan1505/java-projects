package com.xworkz.exceptionhandlingapp.exceptionexamples;

public class ArrayOutOfBound {
    public static void main(String[] args) {
        System.out.println("Main started");
        int array[] = new int[]{1,2,3,4,5};
        try{
            System.out.println(array[9]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array size is limited");
        }

        System.out.println("Main ended");
    }
}
