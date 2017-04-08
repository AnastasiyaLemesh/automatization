package task1.subtask2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by TTN on 08.02.2017.
 */
public class Transpone {
    public static void main(String[] args) {
        int rowSize, columnSize;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter rows size: ");
        rowSize = in.nextInt();
        System.out.println("Enter columns size: ");
        columnSize = in.nextInt();

        int matrix[][] = new int[rowSize][columnSize];

        System.out.println("Enter the elements for the Matrix");

        for(int row=0;row<rowSize;row++){
            for(int col=0;col<columnSize;col++){
                matrix[row][col]=in.nextInt();
            }
        }

        for(int row=0;row<rowSize;row++){
            System.out.println();
            for(int col=0;col<columnSize;col++){
                System.out.print(matrix[row][col] + " ");
            }
        }

        System.out.println("\n************************************");

        int matrixResult[][] = new int[columnSize][rowSize];

        for(int row=0;row<rowSize;row++){
            for(int col=0;col<columnSize;col++){
                matrixResult[col][row] = matrix[row][col];
            }
        }

        for(int row=0;row<columnSize;row++){
            System.out.println();
            for(int col=0;col<rowSize;col++){
                System.out.print(matrixResult[row][col] + " ");
            }
        }

    }
}
