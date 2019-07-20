import java.io.BufferedReader;
import java.io.FileReader;

class demo {
    public static void main(String[] args) throws Exception{
        FileReader file = new FileReader("BufferedWriter.txt");
        BufferedReader buffer = new BufferedReader(file);
        int i;
        while((i = buffer.read()) != -1) {
            System.out.print((char)i);
        }
    }
}