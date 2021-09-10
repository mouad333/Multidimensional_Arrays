package com.company;

public class Main {

    public static void main(String[] args) {
           int rows=8;
           int cols=8;
           float[][] board=new float[rows][cols];
           for(int i=0;i<rows;i++){
               for(int j=0;j<cols;j++){
                 board[i][j]=(float) Math.random() * 100 + 1.0f;
                 System.out.println("arr[" + i + "][" + j + "] = "
                           + board[i][j]);
               }

           }
        System.out.println("print 10 random values: ");
        for(int i=0 ; i<10 ; i++){
           var randomrows=(int)(Math.random() * rows);
           var randomcols=(int)(Math.random() * cols);

               System.out.println("arr["+i+"]="+board[randomrows][randomcols]);
           }


    }
}
