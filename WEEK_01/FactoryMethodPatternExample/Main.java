package WEEK_01.FactoryMethodPatternExample;

public class Main {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordFactory();
        wordFactory.createDocument();

        DocumentFactory pdfFactory = new PdfFactory();
        pdfFactory.createDocument();

        DocumentFactory excelFactory = new ExcelFactory();
        excelFactory.createDocument();
    }
}
