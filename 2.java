import java.io.*;
class demo {
    //Code 1
    public static void main(String[] args) throws Exception {
        String dirPath = "/home/tanujdey7/anaconda3";
        File dir = new File(dirPath);
        String[] files = dir.list();
        if(files.length == 0) {
            System.out.println("Folder is empty");
        } 
        else {
            for(String str : files) {
                System.out.println(str);
            }
        }
    }
    /* //Code 2
    public static void main(String[] args) throws Exception {
        File dir = new File("/home/tanujdey7/anaconda3");
        File[] files = dir.listFiles();
        if(files.length == 0) {
            System.out.println("Folder is Empty");
        }
        else {
            for(File file : files) {
                System.out.println(file.getName());
            }
        }
    }*/
}
