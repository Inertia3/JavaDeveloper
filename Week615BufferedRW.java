import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Week615BufferedRW {
    // @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        String filepath = "C:\\Users\\sahil\\Desktop\\MyWork\\Telusko\\aaa.txt";
        File file1 = new File(filepath);

        FileWriter writer = null;
        BufferedWriter bw = null;

        try{
            writer = new FileWriter(file1, true);
            bw = new BufferedWriter(writer);
            char ch[] = {'S','A','H','I', 'L'};
            bw.write(ch);
            bw.newLine();
            bw.write(97);
            bw.newLine();
            bw.write("Arshiya is a very good girl");
        }
        catch(Exception e){
            System.out.println(e);
        }

        finally{
            bw.close();
        }
    }
}
