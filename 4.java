import java.io.*;
class demo {
    public static void main(String[] args) {
       try {
           File f = new File("input.txt");
           if(f.canRead()) {
               System.out.println("It is Readable");
           }
           else {
               System.out.println("It's not Readable");
           }
       } catch (Exception e) {
           System.err.println(e);
       } 
    }
}