package ro.ase.cts.decorator.editortext;

public class TextSubliniat extends TextDecorator{
    public TextSubliniat(Text text) {
        super(text);
    }

    @Override
    public String getContinut() {
        return "[U]" + text.getContinut() + "[/U]";
    }
}
