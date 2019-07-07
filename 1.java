import java.io.*;
class demo {
    public static void main(String[] args) {
        File f = new File("input.txt");
        if(f.exists()) {
            System.out.println("Exists");
        }   
        else {
            System.out.println("Doesnt Exist");
        }
    }
}