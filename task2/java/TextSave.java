import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TextSave {

    TextTransformer textTransformer ;

    File file ;

    public void saveTextToFile(String text){
        try (PrintWriter a = new PrintWriter("a.txt")) {

            a.println(text);
        } catch (FileNotFoundException e) {
            System.out.println("ERROR FILE WRITE");
        }
    }
}
