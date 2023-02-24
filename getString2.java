package JAVA;
import java.io.*;
public class getString2 {
    public static void main(String[] args) throws IOException{
        String s1,s2;
        InputStreamReader IN=new InputStreamReader(System.in);
        BufferedReader BR=new BufferedReader(IN);
        System.out.print("Enter name: ");
        String name=BR.readLine();
        System.out.print("Enter Roll: ");
        s1= BR.readLine();
        int roll=Integer.valueOf(s1);
        System.out.print("Enter Mark: ");
        s2= BR.readLine();
        float mark=Float.valueOf(s2);
        System.out.println("Name is:"+name);
        System.out.println("Roll is:"+roll);
        System.out.println("Mark is:"+mark);
    }
}
