package JavaProblems;

public class Problem8 {
    public static void main(String[] args) {
        //Pattern
        int row=6;
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
