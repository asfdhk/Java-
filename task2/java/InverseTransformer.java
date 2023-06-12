public class InverseTransformer extends TextTransformer{

    @Override
    public String transform(String text) {
        StringBuffer stringBuffer = new StringBuffer(text);
        stringBuffer.reverse();
        String d = new String(stringBuffer);
        return d;
    }
}
