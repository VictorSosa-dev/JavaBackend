import e1.Singleton;
import e2.AnalyzeInformation;
import e2.StockMarketAdapter;
import e3.SaveCommand;
import e3.TextEditor;
import reto1.Motor;
import reto1.MotorElectrico;
import reto1.MotorElectricoAdapter;

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

        System.out.println("");
        System.out.println("--------r1--------");
        Motor motor = new MotorElectricoAdapter();
        motor.encender();
        motor.acelerar();
        motor.apagar();

        System.out.println("");
        System.out.println("--------E3--------");
        TextEditor te = new TextEditor(new SaveCommand());
        te.onPressSaveButton();
        te.onPressSaveOption();
        te.onShortcut();

    }
}
