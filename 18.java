import java.io.*;
class demo {
    public static void main(String[] args) {
        File f = new File("output.txt");
        byte b[] = new byte[(int)f.length()];
        FileInputStream fis = new FileInputStream(f);
        BufferedInputStream buffer = new BufferedInputStream(fis);
        int i = 0;
        int c;
        while((c = buffer.read()) != -1) {
            if
        }
    }
}