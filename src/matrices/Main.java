package src.matrices;

public class Main {

    public static void show(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++)
                System.out.print("[" + mat[i][j] + "]");
            System.out.println("");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int mat_1[][] = new int[2][3];
        int mat_2[][] = new int[3][2];
        int mat_3[][] = new int[2][2];

        for (int i = 0; i < mat_1.length; i++) {
            for (int j = 0; j < mat_1[0].length; j++) {
                mat_1[i][j] = (int) (Math.random() * 5);
            }
        }

        for (int i = 0; i < mat_2.length; i++) {
            for (int j = 0; j < mat_2[0].length; j++) {
                mat_2[i][j] = (int) (Math.random() * 5);
            }
        }

        for (int i = 0; i < mat_3.length; i++) {
            for (int j = 0; j < mat_3[0].length; j++) {
                mat_3[i][j] = 0;
            }
        }

        for (int i = 0; i < mat_1.length; i++) {
            for (int j = 0; j < mat_2[0].length; j++) {
                for (int k = 0; k < mat_2.length; k++) {
                    mat_3[i][j] += mat_1[i][k] * mat_2[k][j];
                }
            }
        }

        show(mat_1);
        show(mat_2);
        show(mat_3);
    }
}
