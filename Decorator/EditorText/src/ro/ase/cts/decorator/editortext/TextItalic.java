package ro.ase.cts.decorator.editortext;

public class TextItalic extends TextDecorator{
    public TextItalic(Text text) {
        super(text);
    }

    @Override
    public String getContinut() {
        return "[ITALIC]" + text.getContinut() + "[/ITALIC]";
    }
}
