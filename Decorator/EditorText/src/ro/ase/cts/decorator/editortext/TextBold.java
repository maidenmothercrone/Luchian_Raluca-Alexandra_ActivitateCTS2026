package ro.ase.cts.decorator.editortext;

public class TextBold extends TextDecorator{
    public TextBold(Text text) {
        super(text);
    }

    @Override
    public String getContinut() {
        return "[BOLD]" + text.getContinut() + "[/BOLD]";
    }
}
