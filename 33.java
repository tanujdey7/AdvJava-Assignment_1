import java.io.*;
class demo{
    public static void main(String[] args) throws Exception  {
        FileOutputStream file = new FileOutputStream("33.txt");
        OutputStreamWriter out = new OutputStreamWriter(file);
        char b[] = {'a','e','i','o','u'};
        out.write(b);
        out.close();

    }
}