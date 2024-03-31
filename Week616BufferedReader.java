import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Week616BufferedReader {
    public static void main(String[] args) throws IOException {
        String filepath = "C:\\Users\\sahil\\Desktop\\MyWork\\Telusko\\aaa.txt";

        FileReader reader = null;
        BufferedReader br  = null;
        try{
            File newFile = new File(filepath);
            reader  = new FileReader(newFile);
            br = new BufferedReader(reader);

            String str = br.readLine();
            while(str!=null){
                System.out.println(str);
                str = br.readLine();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            br.close();
        }
    }
}
