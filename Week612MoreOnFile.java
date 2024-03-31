
import java.io.*;

public class Week612MoreOnFile {
    public static void main(String[] args) {

        String Filename = "C:\\Users\\sahil\\Desktop\\MyWork\\Telusko\\aaa.txt";
        String Foldername = "C:\\Users\\sahil\\Desktop\\MyWork\\Telusko\\FileHand";
        try{

            // creating a file
            File newFile = new File(Filename);
            System.out.println(newFile.exists());

            System.out.println(newFile.createNewFile());

            // creating a folder
            File folder = new File(Foldername);
            folder.mkdir();
            System.out.println(folder.exists());


            System.out.println(newFile.getPath());
            System.out.println(newFile.getAbsolutePath());
            System.out.println(newFile.getParent());

            System.out.println(folder.getPath());
            System.out.println(folder.getAbsolutePath());
            System.out.println(folder.getParent());

            // Listing the files inside a directory
            File file2 = new File("C:\\Users\\sahil\\Desktop\\MyWork\\Telusko");

            String str[] = file2.list();
            int count = 0;

            for(String name : str){
                System.out.println(name);
                count++;
            }
            System.out.println("Total no of files in the Telusko directory is + "+count);
            

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
