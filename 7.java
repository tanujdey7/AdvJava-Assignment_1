import java.io.*;
import java.util.Scanner;
class demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter FileName: ");
        String file = input.next();
        File f = new File(file);
        if(f.isFile() == true) {
            System.out.println("It is a file");
        }
        else {
            System.out.print("It is not a File");
        }
    }
}