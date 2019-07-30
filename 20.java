import java.io.*;
class demo {
    public static void main(String[] args) throws Exception {
        File f = new File("output.txt");
        byte b[] = new byte[(int)f.length()];
        FileInputStream fis = new FileInputStream(f);
        BufferedInputStream buffer = new BufferedInputStream(fis);
        int i = 0;
        int c;
        while((c = buffer.read()) != -1) {
            if (i == 25) {
                break;
            }
            b[i] = (byte)c;
            i++;
            System.out.print((char)c);
        }
        fis.close();
        buffer.close();
    }
}