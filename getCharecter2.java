package JAVA;

import java.io.DataInputStream;
import java.io.IOException;

public class getCharecter2 {
    public static void main(String[] args) throws IOException {
        char c;
        DataInputStream in=new DataInputStream(System.in);
        System.out.println("Enter Your Character:");
        c=(char) System.in.read();
        System.out.println("Your Character is:"+c);
    }
}
