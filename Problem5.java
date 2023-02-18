package JavaProblems;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        //show all the even numbers between 1 to n
        Scanner obj=new Scanner(System.in);
        System.out.println("Input Number:");
        int n= obj.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
