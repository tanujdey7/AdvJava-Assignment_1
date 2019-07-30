import java.io.*;

class demo
{
    public static void main(String args[]) throws Exception
    {
        String s1 = "GLS UNiversity";
        RandomAccessFile r1 = new RandomAccessFile("29.txt","rw");
        r1.write(s1.getBytes());
        byte b[] = new byte[100];
        r1.close();
        RandomAccessFile r2 = new RandomAccessFile("29.txt","r");
        r2.read(b);
        String s = new String(b);
        System.out.println(s);
        
    }
}