import java.util.Locale;

public class UpDownTransformer extends TextTransformer{

    @Override
    public String transform(String text) {
        String nm = "";
        for (int i = 0; i<text.length();i++){
            if (i%2 == 0){
                 nm+=text.substring(i,i+1).toUpperCase();
            }else {
                 nm+=text.substring(i,i+1).toLowerCase();
            }
        }
        return nm;
    }
}
