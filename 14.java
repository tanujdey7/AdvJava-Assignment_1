import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
class demo {
    public static void main(String[] args) throws Exception {
        File file = new File("40.java");
        FileInputStream fis = new FileInputStream(file);
        byte[] b = new byte [(int)file.length()];
        fis.read(b);
        fis.close();
        /*for(int i = 0; i < file.length() ; i++) {         //Print without using ByteArrayInputStream
            System.out.print((char)b[i]);
        }*/
        ByteArrayInputStream bIn = new ByteArrayInputStream(b);
        int i;
        while((i = bIn.read()) != -1) {
            System.out.print((char) i);
        }

    }
}