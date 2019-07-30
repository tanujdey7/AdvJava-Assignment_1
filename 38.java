import java.io.BufferedReader;
import java.io.*;
class demo {
    public static void main(String[] args) throws Exception {
        FileReader file = new FileReader("41.java");
        BufferedReader buffer = new BufferedReader(file);
        int c;
        while((c = buffer.read())!=-1) {
            System.out.print((char)c);
        }
    }
}