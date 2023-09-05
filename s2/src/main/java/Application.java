import e1.Singleton;
import e2.AnalyzeInformation;
import e2.StockMarketAdapter;

public class Application {

    public static void main(String[] args) {
        System.out.println("--------E1--------");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");

        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);

        System.out.println("");
        System.out.println("--------E2--------");

        StockMarketAdapter stockMarketAdapter = new StockMarketAdapter();
        String json = stockMarketAdapter.download();

        AnalyzeInformation library = new AnalyzeInformation();

        try {
            library.AnalyzeInformation(json);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
