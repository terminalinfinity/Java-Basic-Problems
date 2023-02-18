package JavaProblems;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        //Print Multiplication Table
        Scanner obj=new Scanner(System.in);
        System.out.print("Input Your Number:");
        int num=obj.nextInt();
        for(int i=1;i<=10;i++){
            int j=i*num;
            System.out.println(num+" x "+i+"="+j+"");
        }
    }
}
