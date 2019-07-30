import java.io.RandomAccessFile;

class demo {
    public static void main(String[] args) throws Exception {
        RandomAccessFile random = new RandomAccessFile("output.txt", "rw");
        System.out.print((char)random.read());
        random.seek(4);
        System.out.print((char)random.read());
        random.seek(8);
        System.out.print((char)random.read());
    }
}