package Operations;

import java.io.IOException;

public class ReportGeneration {
    public static void generateReport() throws IOException {
        String report = "mvn serenity:aggregate";
        Process process = Runtime.getRuntime().exec(report);
        process.getInputStream();
        System.out.println("Report Generated");
    }
}
