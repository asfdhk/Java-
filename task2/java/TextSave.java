import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TextSave {

    private TextTransformer textTransformer ;

    private File file ;

    public void saveTextToFile(String text){
        try (PrintWriter a = new PrintWriter("a.txt")) {

            a.println(text);
        } catch (FileNotFoundException e) {
            System.out.println("ERROR FILE WRITE");
        }
    }

    public File getFile() {
        return file;
    }

    public TextTransformer getTextTransformer() {
        return textTransformer;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void setTextTransformer(TextTransformer textTransformer) {
        this.textTransformer = textTransformer;
    }
}
