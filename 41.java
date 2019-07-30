import java.io.FileInputStream;
import java.io.*;
class demo {
    public static void main(String[] args) throws Exception {
        File f = new File("output.txt");
        FileInputStream file = new FileInputStream("output.txt");
        byte b[] = new byte[(int)f.length()];
        file.read(b);
        String str = new String(b);
        int i;
        System.out.println(str.toUpperCase());
    }
}