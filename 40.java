import java.io.*;
class demo {
    public static void main(String[] args) throws Exception{
        FileWriter fw = new FileWriter("write.txt");
        FileReader fos = new FileReader("write.txt");
        String str = "My name is Tanuj";
        fw.write(str);
        fw.close();
        int i;
        String s="" , s1="";
        int count = 0;
        while((i = fos.read()) != -1) {
            s = Character.toString((char)i);
            s1 = s.toUpperCase();
            System.out.print(s);
            for(int j = 0 ; j < s1.length() ; j++) {
                if(s1.charAt(j) == 'A') {
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println(count);
        fos.close();
        
    }
}