import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TryCatchFinally {
    public static void main(String[] args) {
        try { writeToFile();}
        catch (IOException e) { System.out.println(e.getMessage()); }//I/O exception must be handledif not the method would not work.
}
// throws means whoever is using this function to handle the exception, regardless if it is already handled in the method
    public static void writeToFile() throws IOException
    {// this declaration is outside if not finally cannot recognise bw
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("myFile.txt"));

            bw.write("Compiler enforces the throws keyword to be included");
            bw.close();
        }catch(IOException e){

        }
        finally {
            bw.close();
        }
    }
}