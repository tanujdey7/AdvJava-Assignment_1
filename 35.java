import java.io.FileWriter;

class demo {
    public static void main(String[] args) throws Exception {
        FileWriter file = new FileWriter("35.txt`");
        file.write("Name");
        file.write("Address");
        file.close();
    }
}