package e2;

public class AnalyzeInformation {

    public void AnalyzeInformation(String json) throws Exception {
        if(!validateJson(json)) {
            throw new Exception("Invalid json");
        }
        System.out.println("Analyzing information...");
    }

    public boolean validateJson(String data) {
        return true;
    }
}
