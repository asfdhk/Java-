public class Main {
    public static void main(String[] args) {
        TextSave textSave = new TextSave();
        textSave.setTextTransformer(new UpDownTransformer());
        textSave.saveTextToFile(textSave.getTextTransformer().transform("hello"));
    }
}