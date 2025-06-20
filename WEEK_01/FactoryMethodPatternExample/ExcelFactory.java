package WEEK_01.FactoryMethodPatternExample;

public class ExcelFactory extends DocumentFactory {
    @Override
    public void createDocument() {
        ExcelDocument doc = new ExcelFile();
        doc.open();
    }
}