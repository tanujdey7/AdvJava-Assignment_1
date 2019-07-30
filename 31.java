import java.io.*;
class demo {
    public static void main(String[] args) throws Exception {
        CharArrayWriter ch = new CharArrayWriter();
        ch.write("This is a sample text");
        FileWriter f = new FileWriter("31.txt");
        ch.writeTo(f);
        ch.close();
        f.close();
    }
}