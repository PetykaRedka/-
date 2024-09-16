package mypath;

//        +--------------------------------------------------+
//        |                      Stock                      |
//        +--------------------------------------------------+
//        | - symbol: String                                 |
//        | - name: String                                   |
//        | - previousClosingPrice: double                   |
//        | - currentPrice: double                           |
//        +--------------------------------------------------+
//        | + Stock(symbol: String, name: String)            |
//        | + getChangePercent(): double                     |
//        +--------------------------------------------------+


public class Stock {
    String symbol;
    String name;
    double PreviousClosePrice;
    double currentPrice;

    Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    double getChangePercent() {
        return ((currentPrice - PreviousClosePrice / pPreviousClosePrice) * 100;
    }
}
