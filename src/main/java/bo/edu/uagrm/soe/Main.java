package bo.edu.uagrm.soe;

public class Main {
    public static void main(String[] args) {

        PDFReportGenerator pdfReportGenerator = new PDFReportGenerator();
        pdfReportGenerator.generateReport();

        ExcelReportGenerator excelReportGenerator = new ExcelReportGenerator();
        excelReportGenerator.generateReport();

        HTMLReportGenerator htmlReportGenerator = new HTMLReportGenerator();
        htmlReportGenerator.generateReport();

    }
}