package e2;

import e2.StockMarket;
import e2.StockMarketReport;

public class StockMarketAdapter implements StockMarketReport {

    private StockMarket stockMarket;

    public StockMarketAdapter(){
        this.stockMarket = new StockMarket();
    }

    @Override
    public String download() {
        String xml = stockMarket.download();
        return convertXmlToJson(xml);
    }

    public String convertXmlToJson(String xml){
        String json = "";
        System.out.println("Converting XML to JSON...");
        return json;
    }

}
