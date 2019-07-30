import java.io.*;
class demo {
    public static void main(String[] args) throws Exception {
        FileWriter file = new FileWriter ("output.txt");
        BufferedWriter buffer = new BufferedWriter(file);
        buffer.write("Hello World sample text xyz");
        buffer.close();
    }
}