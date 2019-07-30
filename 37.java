import java.io.*;
class demo {
    public static void main(String[] args) throws Exception{
        FileReader file = new FileReader("output.txt");
        int c;
        int i = 0;
        while((c = file.read() ) != -1) {
            if(i==5) {
                break;
            }
            System.out.print((char)c);
            i++;
        }
    }
}