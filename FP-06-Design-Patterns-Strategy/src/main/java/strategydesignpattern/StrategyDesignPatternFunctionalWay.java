package strategydesignpattern;

import java.util.ArrayList;
import java.util.List;

public class StrategyDesignPatternFunctionalWay {
    public static void main(String[] args) {
        /**
         * Strategy design pattern is used when we have multiple solutions or algorithms to solve a specific task
         * and client decides the specific implementation which is to be used in runtime
         *
         * For example, there might be multiple sorting techniques to sort the collection, and it's up to the user,
         * which sorting algorithm he wants to use
         *
         * The best example in JDK is Collections.sort(List list, Comparator c);
         * Sort methods takes 2 arguments - list to sort and comparator implementation, and based on different
         * comparator implementations, we can sort the objects in different ways = client can specify the sorting
         * strategy or the comparator implementation which is to be used at runtime
         */

        List<Stock> stockList = new ArrayList<>();

        stockList.add(new Stock("APPL",318.65, 10));
        stockList.add(new Stock("MSFT",166.88, 45));
        stockList.add(new Stock("GOOGL",990.0, 12));
        stockList.add(new Stock("AMZ",1866.74, 45));
        stockList.add(new Stock("GOOGL",990.0, 3));
        stockList.add(new Stock("AAPL",318.65, 8));
        stockList.add(new Stock("APPL",318.65, 9));

        // regular way
        StockFilteringStrategy.bySymbol(stockList, "AMZ").forEach(System.out::println);
        StockFilteringStrategy.byPriceAbove(stockList, 300.0).forEach(System.out::println);
        System.out.println("------------------------------------------------------------------");

        // functional way
        // filter method takes List and Predicate to sort on
        // public static List<Stock> filter(List<Stock> list, Predicate<Stock> predicate)
        StockFilteringStrategy.filter(stockList, stock -> stock.getSymbol().equals("MSFT")).forEach(System.out::println);
        StockFilteringStrategy.filter(stockList, stock -> stock.getUnits() <= 10).forEach(System.out::println);






    }
}
