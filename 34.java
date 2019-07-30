import java.io.*;
class demo {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("35.txt");
            int i;
            while((i = file.read()) != -1) {
                System.out.print((char)i);
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}