import java.io.FileInputStream;
import java.io.FileOutputStream;

class demo {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("num.txt");
        FileOutputStream fout1 = new FileOutputStream("even.txt");
        FileOutputStream fout2 = new FileOutputStream("odd.txt");
        int c;
        while((c = fis.read()) != -1) {
            if(c % 2 == 0) {
                fout1.write(c);
            }
            if(c % 2 == 1) {
                fout2.write(c);
            }
            
        }
        System.out.println("Done!");
    }
}