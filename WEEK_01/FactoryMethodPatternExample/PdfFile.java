package WEEK_01.FactoryMethodPatternExample;

public class PdfFile extends PdfDocument {
    @Override
    public void open() {
        System.out.println("Opening PDF document.");
    }
}
