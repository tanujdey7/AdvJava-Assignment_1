//Write a Java program to display file size.
import java.io.*;
class demo {
    public static void main(String[] args) {
        File f = new File("1.java");
        long size = f.length();
        System.out.println(size);
    }
}