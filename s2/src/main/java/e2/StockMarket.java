package e2;

import e2.StockMarketReport;

public class StockMarket implements StockMarketReport {


    @Override
    public String download() {
        String xml = "";
        System.out.println("Downloading stock market report xml...");
        return xml;
    }
}
