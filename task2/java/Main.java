public class Main {
    public static void main(String[] args) {
        TextSave textSave = new TextSave();
        textSave.textTransformer = new UpDownTransformer();
        textSave.saveTextToFile(textSave.textTransformer.transform("hello"));
    }
}