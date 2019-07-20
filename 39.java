import java.io.BufferedWriter;
import java.io.FileWriter;
class demo {
    public static void main(String[] args) throws Exception {
        FileWriter  file = new FileWriter("BufferedWriter.txt");
        BufferedWriter buffer = new BufferedWriter(file);
        buffer.write("This is an example of Buffered Writer");
        buffer.close();
    }
}