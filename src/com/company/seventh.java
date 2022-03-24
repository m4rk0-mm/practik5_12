package com.company;

public class seventh {
    public static void main(String[] args) {
        int t_array[][] = new int[7][7];
        int max = 0;

        for(int a = 0; a < t_array.length; a++){
            for(int b = 0; b < t_array[a].length; b++) {
                t_array[a][b] = (int) (Math.random() * 6);
                System.out.print(t_array[a][b] + " ");
            }
            System.out.println(" ");
        }for(int i = 0; i < t_array.length; i++){
            for (int u = 0; u < t_array.length; u++ ){
                if(t_array[i][u] > max){
                    max = t_array[i][u];
                }

            }
            System.out.println(max);


        }

    }
}
