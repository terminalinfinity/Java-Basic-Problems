package JavaProblems;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        //three numbers as Input and print the greatest number among them
        Scanner obj=new Scanner(System.in);
        System.out.println("Input your Numbers:");
        int n1= obj.nextInt();
        int n2= obj.nextInt();
        int n3= obj.nextInt();
        if(n1<n2 && n3<n2)
            System.out.println("Number Two is Greater");
        else if (n1<n3 && n2<n3) {
            System.out.println("Number Three is Greater");
        }
        else
            System.out.println("Number One is Greater");
    }
}
