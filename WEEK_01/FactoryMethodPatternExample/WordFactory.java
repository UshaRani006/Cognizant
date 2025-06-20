package WEEK_01.FactoryMethodPatternExample;

public class WordFactory extends DocumentFactory {
    @Override
    public void createDocument() {
        WordDocument doc = new WordFile();
        doc.open();
    }
}
