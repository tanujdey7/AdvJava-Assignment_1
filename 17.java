import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class demo {
    public static void main(String[] args) throws Exception {
        File f = new File("write.txt");
        FileInputStream fis = new FileInputStream(f);
        byte b[] = new byte[(int)f.length()];
        fis.read(b);
        fis.close();
        ByteArrayInputStream barray = new ByteArrayInputStream(b);
        int i;
        String str = "";
        while((i = barray.read()) != -1) {
            str = Character.toString(i);
            System.out.print(str.toUpperCase());
        }
    }
}