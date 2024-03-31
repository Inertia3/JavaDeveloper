import java.io.*;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Week617PrintWriter {
    public static void main(String[] args) {
        String filepath = "C:\\Users\\sahil\\Desktop\\MyWork\\Telusko\\aaa.txt";
        FileWriter writer = null;
        PrintWriter pw = null;

        try{
            File newFile = new File(filepath);
            writer = new FileWriter(newFile, true);
            pw = new PrintWriter(writer);
            
            pw.println("Sahil Ansari");
            pw.println('A');
            pw.println(10.99);
            pw.println(9>10);
        }
        catch(Exception e){
            System.out.println(e);
        }

        finally{
            pw.close();
        }
    }
}
