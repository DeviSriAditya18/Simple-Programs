import java.util.*;

public class MatrixAddSubMul {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no.of Rows:");
        int r = s.nextInt();
        System.out.println("Enter no.of Columns:");
        int c = s.nextInt();
        int A[][] = new int[r][c];
        int B[][] = new int[r][c];
        int C[][] = new int[r][c];
        System.out.println("Enter elements for Matrix A:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                A[i][j] = s.nextInt();
            }
            System.out.println();
        }
        System.out.println("Enter elements for Matrix B:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                B[i][j] = s.nextInt();
            }
            System.out.println();
        }
        System.out.println("Enter Operator");
        int v = s.nextInt();
        switch (v) {
            case 1:
                System.out.println("Addition of 2 Matrices A & B:");
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {
                        C[i][j] = A[i][j] + B[i][j];
                        System.out.print(C[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Subtraction of 2 Matrices A & B:");
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {
                        C[i][j] = A[i][j] - B[i][j];
                        System.out.print(C[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("Multiplication of 2 Matrices A & B:");
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {
                        C[i][j] = A[i][j] * B[i][j];
                        System.out.print(C[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.print("Invalid Operator");
                break;
        }
    }
}
