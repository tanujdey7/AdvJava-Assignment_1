import java.io.*;
class demo {
    public static void main(String[] args) throws Exception {
        File f = new File("31.txt");
        byte b[] = new byte[(int)f.length()];
        FileInputStream file = new FileInputStream("31.txt");
        file.read(b);
        String str = new String(b);
        char ch[] = str.toCharArray();
        int i;
        CharArrayReader c = new CharArrayReader(ch);
        while((i = c.read()) != -1) {
            System.out.print((char)i);
        }
    }
}