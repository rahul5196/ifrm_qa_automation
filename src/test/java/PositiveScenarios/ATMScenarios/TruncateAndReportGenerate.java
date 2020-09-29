package PositiveScenarios.ATMScenarios;

import Operations.ReportGeneration;
import Operations.TruncateData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import java.io.IOException;

public class TruncateAndReportGenerate {
    @Given("I generate the report")
    public void iGenerateTheReport() throws IOException {
        ReportGeneration.generateReport();
    }

    @And("I truncate the tables")
    public void iTruncateTheTables() throws IOException {
        TruncateData.truncateTable();
    }
}
