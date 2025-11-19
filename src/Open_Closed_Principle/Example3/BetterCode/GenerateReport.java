package Open_Closed_Principle.Example3.BetterCode;

import java.util.ArrayList;
import java.util.List;

public class GenerateReport {
    public static void genReport(List<ReportGenerator> reports){
        for(ReportGenerator report:reports){
            System.out.println(report.generate());
        }
    }

    public static void main(String[] args) {
        List<ReportGenerator>ll=new ArrayList<>();
        ll.add(new PDFReportGenerator());
        ll.add(new WordReportGenerator());
        ll.add(new PushReport());

        genReport(ll);
    }
}
