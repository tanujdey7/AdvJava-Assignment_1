import java.io.*;
class demo {
    public static void main(String[] args) {
       try {
           File f = new File("input.txt");
           if(f.canWrite()) {
               System.out.println("It is Writeable");
           }
           else {
               System.out.println("It's not writeable");
           }
       } catch (Exception e) {
           System.err.println(e);
       } 
    }
}