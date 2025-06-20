package WEEK_01.FactoryMethodPatternExample;

public class PdfFactory extends DocumentFactory {
    @Override
    public void createDocument() {
        PdfDocument doc = new PdfFile();
        doc.open();
    }
}