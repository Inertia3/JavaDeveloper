
import java.io.*;

public class Week612MoreOnFile {
    public static void main(String[] args) {
        try{

            // creating a file
            File newFile = new File("C:\\Users\\sahil\\Desktop\\MyWork\\Telusko\\aaa.txt");
            System.out.println(newFile.exists());

            System.out.println(newFile.createNewFile());

            // creating a folder
            File folder = new File("C:\\Users\\sahil\\Desktop\\MyWork\\Telusko\\FileHand");
            folder.mkdir();
            System.out.println(folder.exists());

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
