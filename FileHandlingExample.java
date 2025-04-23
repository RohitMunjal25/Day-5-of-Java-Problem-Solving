import java.util.*;
import java.io.*;
public class FileHandlingExample{
    public static void main(String[] args) throws Exception {
        // creating the new file....
        try{
        File file=new File("test0100.txt");
        if(file.createNewFile()){
            System.out.println("file created successfully"+file.getName());
        }
        else{
            System.out.println("file already exist");
        }
        //writing initial content
        FileWriter writer=new FileWriter(file);
        writer.write("hello everyone this is initial content");
        writer.close();
        // Reading and printing the file..
        Scanner reader=new Scanner(file);
        System.out.println("reading file content");
        while(reader.hasNextLine()){
            System.out.println(reader.nextLine());
        }
        //appending..
        FileWriter appendWriter=new FileWriter(file,true);
        appendWriter.write("this is append part");
        appendWriter.close();
        // couting words
        reader=new Scanner(file);
        int count=0;
        while(reader.hasNextLine()){
            String line=reader.nextLine();
            count +=line.split("\\s+").length;

                 
        }
        reader.close();
        System.out.println("total words are:"+count);
        if(file.delete()){
            System.out.println("file deleted");
        }
        else{
            System.out.println("file deletion failed");
        }}
        catch(IOException e){
            e.printStackTrace();
            System.out.println("an error");
        }
        
        
    
    }
}
