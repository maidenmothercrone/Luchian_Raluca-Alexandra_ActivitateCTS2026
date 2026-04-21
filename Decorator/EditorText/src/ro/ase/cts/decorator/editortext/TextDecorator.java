package ro.ase.cts.decorator.editortext;

public abstract class TextDecorator implements Text{
    protected Text text;
    public TextDecorator (Text text){
        this.text = text;
    }
}
