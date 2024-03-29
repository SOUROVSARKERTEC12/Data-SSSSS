import java.util.Scanner;
public class matrixadd {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int mat1[][] = new int[10][10];
        int mat2[][] = new int[10][10];
        int mat3[][] = new int[10][10];

        System.out.print("Number of row: ");
        int row = scan.nextInt();
        System.out.print("Number of column: ");
        int col = scan.nextInt();
        System.out.println();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter element " + (i + 1) + ":" + (j + 1) + " of first table = ");
                mat1[i][j] = scan.nextInt();
            }
        }

        System.out.println("\nTable 1:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter element " + (i + 1) + ":" + (j + 1) + " of second table = ");
                mat2[i][j] = scan.nextInt();
            }
        }

        System.out.println("\nTable 2:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nAdded Matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat3[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nSubtracted Matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat3[i][j] = mat1[i][j] - mat2[i][j];
                System.out.print(mat3[i][j] + " ");
            }
            System.out.println();
        }

        int mat4[][] = new int[10][10];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < col; k++) {
                    mat4[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }

        System.out.println("\nMultiplied Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat4[i][j] + " ");
            }
            System.out.println();
        }
    }
}
