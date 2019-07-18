import java.io.File;
import java.util.Scanner;

class demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Folder Name");
        String name = input.next();
        File f = new File(name);
        if(f.isDirectory() == true) {
            System.out.println("It is a Folder");
        } else {
            System.out.println("It is not a Folder");
        }
    }
}