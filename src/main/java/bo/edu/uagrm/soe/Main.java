package bo.edu.uagrm.soe;

public class Main {
    public static void main(String[] args) {

        PDFReportGenerator pdfReportGenerator = new PDFReportGenerator();
        System.out.println(pdfReportGenerator.generateReport("ArchivoPDF"));

        ExcelReportGenerator excelReportGenerator = new ExcelReportGenerator();
        System.out.println(excelReportGenerator.generateReport("ArchivoExcel"));

        HTMLReportGenerator htmlReportGenerator = new HTMLReportGenerator();
        System.out.println(htmlReportGenerator.generateReport("ArchivoHTML"));

    }
}