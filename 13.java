import java.io.*;
class demo {
    public static void main(String[] args) throws Exception {
        File f = new File("write.txt");
        FileInputStream fis = new FileInputStream(f);
        byte b[] = new byte[(int)f.length()];
        fis.read(b);
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        int c;
        while((c = bis.read()) != -1 ){
            System.out.print((char)c);
        } 
    }
}