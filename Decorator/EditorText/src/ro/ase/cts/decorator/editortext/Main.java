package ro.ase.cts.decorator.editortext;

public class Main {
    static void main(String[] args) {
        Text text = new TextSimplu("text");
        System.out.println(text.getContinut());

        text = new TextBold(text);

        System.out.println(text.getContinut());

        text = new TextItalic(text);

        System.out.println(text.getContinut());

        text = new TextSubliniat(text);
        System.out.println(text.getContinut());
    }
}
