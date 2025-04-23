import java.io.*;
public class FileDetails {
    public static void main(String[] args) throws Exception {
        File file=new File("test010.txt");
        if(file.exists()){
            System.out.println("file name:"+" "+file.getName());
            System.out.println("file absolute path:"+" "+file.getAbsolutePath());
            System.out.println("readable:"+" "+file.canRead());
            System.out.println("writable:"+" "+file.canWrite());
            System.out.println("lenght:"+" "+file.length());
            if(file.delete()){
                System.out.println("file deleted successfully:"+" "+file.getName());

            }
            else{
                System.out.println("file do not exist for deletion:"+" "+file.getName());
            }
        }
        
    }
    
}
