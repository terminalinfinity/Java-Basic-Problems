package JavaProblems;

public class Problem12 {
    public static void main(String[] args) {
        int n=5;
        for (int i= 0; i<= n; i++)
        {
            for (int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++)
            {
                System.out.print(" *");
            }
            System.out.println("");
        }
        for (int i= n-1; i>= 0; i--)
        {
            for (int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for (int k=i;k>=0;k--)
            {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}
