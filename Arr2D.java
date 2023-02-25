package JAVA;

public class Arr2D {
    public static void main(String[] args) {
       int matrix1[][]={{1,2,3},{4,5,6},{7,8,9}};
       int matrix2[][]={{9,8,7},{6,5,4},{3,2,1}};
       int matrix3[][]=new int[3][3];
       int i,j;
        System.out.println("Element of the Matrix1 is:");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++)
                System.out.print(matrix1[i][j]+"  ");
            System.out.println();
        }
        System.out.println("Element of the Matrix2 is:");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++)
                System.out.print(matrix2[i][j]+"  ");
            System.out.println();
        }
        for(i=0;i<3;i++){
            for(j=0;j<3;j++)
                matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
        }
        System.out.println("Addition of the Matices is:");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++)
                System.out.print(matrix3[i][j]+"  ");
            System.out.println();
        }
    }
}
