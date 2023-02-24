package JAVA;

import java.io.DataInputStream;

public class getCharacter {
    public static void main(String[] args) {
        DataInputStream in=new DataInputStream(System.in);
        char c;
        try {
            System.out.print("Enter Your Character: ");
            c=(char) System.in.read();
            System.out.println("Your character is:"+c);
        }
        catch (Exception e){

        }
    }
}
