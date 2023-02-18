package JavaProblems;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter your Year:");
        int year= obj.nextInt();
        if(year%4==0 && year%100==0 || year%400==0){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not Leap Year");
        }

    }
}
