import java.io.*;
class demo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("output.txt");
        BufferedInputStream buffer = new BufferedInputStream(fis);
        int i;
        int c = 0; 
        while((i = buffer.read()) != -1) {
            if(c%2==1) {
                System.out.print((char)i);
            }
            c++;
        }
    }
}