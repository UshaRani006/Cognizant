package WEEK_01.FactoryMethodPatternExample;

public class ExcelFile extends ExcelDocument {
    @Override
    public void open() {
        System.out.println("Opening Excel document.");
    }
}
