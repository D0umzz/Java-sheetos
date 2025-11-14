package sheet3;

public class Question2 {
    public static void main(String[] args) {
        Stock stock=new Stock("ORCL","Oracle Corporation",34.5,34.35);
        System.out.printf("price-change percentage of oracle %.3f: ",stock.getChangePercent());
    }
}
class Stock{
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;
    public Stock(String symbol,String name,double previousClosingPrice,double currentPrice){
        this.symbol= symbol;
        this.name= name;
        this.previousClosingPrice=(previousClosingPrice>0)?previousClosingPrice:1;
        this.currentPrice=currentPrice;
    }
    public double getChangePercent() {
        if (previousClosingPrice==0){
            System.out.println("INVALID DIVISION");
            return 0;
        }
        else {
            return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
        }
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }
}