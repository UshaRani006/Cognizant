package WEEK_01.FactoryMethodPatternExample;

public class WordFile extends WordDocument {
    @Override
    public void open() {
        System.out.println("Opening Word document.");
    }
}