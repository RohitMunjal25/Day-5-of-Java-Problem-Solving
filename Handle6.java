import java.util.*;
import java.io.*;

public class Handle6 {
    public static void main(String[] args) throws Exception {
        File file=new File("empty.txt");
        if(file.createNewFile()){
            System.out.println("file created:"+" "+file.getName());
        }
        else{
            System.out.println("file exist already:"+" "+file.getName());
        }
    }
    
}
