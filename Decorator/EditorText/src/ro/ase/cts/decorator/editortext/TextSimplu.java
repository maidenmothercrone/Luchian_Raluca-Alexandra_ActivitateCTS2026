package ro.ase.cts.decorator.editortext;

public class TextSimplu implements Text{
    private String continut;
    public TextSimplu (String continut){
        this.continut=continut;
    }
    @Override
    public String getContinut() {
        return continut;
    }
}
