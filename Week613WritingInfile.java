import java.io.*;

public class Week613WritingInfile {
    public static void main(String[] args) throws IOException {
        String filepath = "C:\\Users\\sahil\\Desktop\\MyWork\\Telusko\\aaa.txt";

        FileWriter writer = null;

        try{
            File file1 = new File(filepath);
            // Whatever existing data in the file will be overridden
            // and new data will be added to kepp the old data and add the new
            // data one small change we have to make that is done below
            // in comment 

            // writer = new FileWriter(file1);
            writer = new FileWriter(file1, true);

            writer.write("Hello! I'm Sahil");
            writer.write("\n");
            writer.write(67);
            writer.write("\n");
            writer.write(97);
            writer.write("\n");
            char ch[] = {'A', 'R', 'S', 'H', 'I', 'Y', 'A'};
            writer.write(ch);
            writer.write("\n");
        }
        catch(Exception e){
            System.out.println(e);
        }

        finally{
            writer.close();
        }
    }
}
