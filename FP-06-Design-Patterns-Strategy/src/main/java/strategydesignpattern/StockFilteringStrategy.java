package strategydesignpattern;

import java.util.ArrayList;
import java.util.List;

public class StockFilteringStrategy {

    public static List<Stock> bySymbol(List<Stock> list, String symbol){
        List<Stock> filteredData = new ArrayList<>();

        for (Stock stock: list) {
            if (stock.getSymbol().equals(symbol)) {
                filteredData.add(stock);
            }
        }

        return filteredData;
    }

}
