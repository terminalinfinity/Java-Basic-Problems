package JAVA;

public class Array2D {
    public static void main(String[] args) {
        int mark[][] = new int[3][3];
        mark[0][0] = 20;
        mark[0][1] = 30;
        mark[0][2] = 44;

        mark[1][0] = 50;
        mark[1][1] = 60;
        mark[1][2] = 10;

        mark[2][0] = 28;
        mark[2][1] = 90;
        mark[2][2] = 55;
        System.out.println("Element of the Matrix is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mark[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }
}
