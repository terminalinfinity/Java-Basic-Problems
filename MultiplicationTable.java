package JAVA;

public class MultiplicationTable {
    final static int row=10;
    final static int col=10;
    public static void main(String[] args) {
        int r,c,i,j;
        int mul[][]=new int [row][col];
        System.out.println("\t\t\t====================");
        System.out.println("\t\t\tMULTIPLICATION TABLE");
        System.out.println("\t\t\t====================");
        for(j=1;j<=10;j++)
            System.out.print("\t"+j);
        System.out.println();
        for(i=0;i<row;i++){
            r=i+1;
            System.out.print("   "+r +". ");
            for(j=0;j<col;j++){
                c=j+1;
                mul[i][j]=r*c;
                System.out.print("   "+mul[i][j]);
            }
            System.out.println();
        }
    }
}
