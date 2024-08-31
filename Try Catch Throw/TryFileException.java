import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryFileException {
        public static void main(String[] args) {
            Scanner scanner = null;
            File myFile = new File("test.txt");
            try {
                scanner = new Scanner(myFile);
                while (scanner.hasNext()) {
                    System.out.println(scanner.nextLine());
                }
            }
            catch (FileNotFoundException e) {
                System.out.println(e.getMessage()); }
            finally { if (scanner != null) { scanner.close(); } }
        }

}

