package JavaProblems;

import java.util.Scanner;

public class problem1 {
    //Write a JAVA program to show a number is a prime number or not.
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Input your number:");
        int num=obj.nextInt();
        int count=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("its a Prime Number");
        }
        else{
            System.out.println("Its not a Prime Number");
        }
    }
}
