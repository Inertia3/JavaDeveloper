import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Week614ReadingfromFile {
    public static void main(String[] args) throws IOException {
        String filepath = "C:\\Users\\sahil\\Desktop\\MyWork\\Telusko\\aaa.txt";
        FileReader reader = null;

        try{
            File file1 = new File(filepath);
            reader = new FileReader(file1);
           
            // int i = reader.read();
            // System.out.println((char)i);
            // int i = reader.read();
            // while(i != -1){
            //     System.out.println((char)i);
            //     i = reader.read();
            // }
            char ch[] = new char[(int)file1.length()];
            reader.read(ch);
            for(char c : ch){
                System.out.print(c);
            }
        }

        catch(Exception e){
            System.out.println(e);
        }

        finally{
            reader.close();
        }
    }
}
