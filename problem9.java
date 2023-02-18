package JavaProblems;

public class problem9 {
    public static void main(String[] args) {
        //Pattern
        int row=3;
        for(int i=row; i>=0; i--)
        {
            for(int j=i; j>=0; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
