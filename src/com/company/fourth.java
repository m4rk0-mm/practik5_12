package com.company;

public class fourth {
    public static void main(String[] args) {
        int array_1[] = new int[10];
        for(int a = 0; a < 10; a++){
            array_1[a] = (int) Math.round(Math.random()* 10);
            System.out.print(array_1[a]);
        }
        System.out.print(" ");

        int array_2[] = new int[10];
        for(int a = 0; a < 10; a++){
            array_2[a] = (int) Math.round(Math.random()* 10);
            System.out.print(array_2[a]);
        }
        System.out.println();
        int array_3[] = new int[10];
        for(int a = 0; a < 10; a++){
            array_3[a] =  array_1[a] + array_2[a];
            System.out.print(array_3[a] + " ");
        }

    }
}
