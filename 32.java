import java.io.*;
class demo {
    public static void main(String[] args) throws Exception{
        FileInputStream file = new FileInputStream("33.txt");
        InputStreamReader input = new InputStreamReader(file);
        int i;
        while((i = input.read()) != -1) {
            System.out.print((char)`i);
        }
    }

}