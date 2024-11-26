import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public void getLibrary() {
        try {
            File library = new File("library.json");
            Scanner scanner = new Scanner(library);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: file not found!");
            e.printStackTrace();
        }
    }
}