package JavaProblems;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        //Write a JAVA program to show a number is a perfect number or not
        Scanner obj=new Scanner(System.in);
        System.out.print("Input your number:");
        int num=obj.nextInt();
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num)
            System.out.println("Perfect Number");
        else
            System.out.println("Not Perfect Number");
    }
}
