package task1.subtask2;

import java.util.Scanner;

/**
 * Created by TTN on 08.02.2017.
 */
public class Rotate {
    public static void main(String[] args) {
        int rowSize;
        int columnSize;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter rows size: ");
        rowSize =  in.nextInt();
        System.out.println("Enter columns size: ");
        columnSize =  in.nextInt();
        int matrix[][] = new int[rowSize][columnSize];

        System.out.println("Enter matrix's values: ");

        for(int row = 0; row < rowSize; row++){
            for(int col = 0; col < columnSize; col++){
                matrix[row][col] = in.nextInt();
            }
        }

        System.out.println("Result: ");

        for(int row = 0; row < rowSize; row++){
            for(int col = 0; col < columnSize; col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }


        int matrixResult[][] = new int[columnSize][rowSize];

        for(int row = rowSize -1; row >= 0; row--){
            for(int col = 0; col < columnSize; col++){
                int ind = rowSize - 1 - row;
                matrixResult[col][ind] = matrix[row][col];
            }
        }
        System.out.println("New result: ");

        for(int row=0;row<columnSize;row++){
            System.out.println();
            for(int col=0;col<rowSize;col++){
                System.out.print(matrixResult[row][col] + " ");
            }
        }

    }
}
