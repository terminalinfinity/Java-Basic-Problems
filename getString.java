package JAVA;

import java.io.*;

public class getString {
    public static void main(String[] args) throws IOException {
        String s;
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        System.out.println("Enter your Line:");
        s=br.readLine();
        System.out.println(s);
    }
}
