import java.io.FileInputStream;
import java.io.FileOutputStream;
class demo {
    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream("write.txt");
        FileOutputStream fout = new FileOutputStream("duplicate.txt");
        int i;
        while((i = fin.read()) != -1) {
            fout.write(i);
        }
        fin.close();
        fout.close();
        System.out.println("Copied");
    }
}